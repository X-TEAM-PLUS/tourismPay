package com.xteam.tourismpay.service;

import com.xteam.tourismpay.api.PFT_Exception;
import com.xteam.tourismpay.api.PFT_OrderService;
import com.xteam.tourismpay.common.JsonUtils;
import com.xteam.tourismpay.common.MD5Utils;
import com.xteam.tourismpay.domain.Orders;
import com.xteam.tourismpay.dto.*;
import com.xteam.tourismpay.manager.OrdersManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.Date;

@Service
public class PFT_OrderServiceImpl implements PFT_OrderService {
    private static final Log log = LogFactory.getLog(PFT_OrderServiceImpl.class);
    /**
     * 账户
     */
    @Value("#{configProperties['system.account']}")
    private String systemAccount;

    /**
     * 密钥
     */
    @Value("#{configProperties['system.secretKey']}")
    private String secretKey;


    @javax.annotation.Resource
    private OrdersManager ordersManager;


    @Override
    public GetTicketListResponseData getTicketList(String uuLld) throws PFT_Exception {
        GetTicketListResponseData response = null;
        try {

            //通过axis2自动生成的web service客户端的代码类
            com.xteam.tourismpay.PFTMXStub pFTMXStub = new com.xteam.tourismpay.PFTMXStub();
            //创建接口对应对象
            com.xteam.tourismpay.PFTMXStub.Get_Ticket_List   getTicketList = new com.xteam.tourismpay.PFTMXStub.Get_Ticket_List();
            //设置接口调用参数
            getTicketList.setAc(systemAccount);
            getTicketList.setPw(secretKey);
            getTicketList.setN(uuLld); //景区的ID 号int （注：2.1&门票接口的UUlid）  2633

            //获取接口响应值
            com.xteam.tourismpay.PFTMXStub.Get_Ticket_ListResponse  getTicketListResponse = pFTMXStub.get_Ticket_List(getTicketList);
            String result = getTicketListResponse.getGet_Ticket_List();
            log.info("查询门票列表："+result);
            //解析
            JAXBContext context = JAXBContext.newInstance(GetTicketListResponseData.class);
            Unmarshaller unmar = context.createUnmarshaller();
            response = (GetTicketListResponseData) unmar.unmarshal( new StringReader(result));
            if(response.getGetTicketListResponse()[0].getUuErrorcode()!=null){
                throw new PFT_Exception("["+response.getGetTicketListResponse()[0].getUuErrorcode()+"]:"+response.getGetTicketListResponse()[0].getUuErrorinfo());
            }
        }
        catch (Exception e) {
            log.error("查询门票列表接口调用异常",e);
            throw  new PFT_Exception("查询门票列表接口调用异常");
        }

        return response;
    }

    @Override
    public SubmitOrderResponseData submit(String orderNo) throws PFT_Exception {
        SubmitOrderResponseData response = null;
        try {
            //查询本地订单
            Orders orders = new Orders();
            orders.setOrderNo(BigDecimal.valueOf(Long.valueOf(orderNo)));
            Orders orderDBInfo = ordersManager.get(orders);
            if(orderDBInfo==null){
                throw new Exception("本地订单号不存在");
            }

            //支付时间
            orderDBInfo.setUpdated(new Date());
            //订单状态已支付
            orderDBInfo.setOrderStatus(1);
            //更新数据
            ordersManager.update(orderDBInfo);

            //通过axis2自动生成的web service客户端的代码类
            com.xteam.tourismpay.PFTMXStub pFTMXStub = new com.xteam.tourismpay.PFTMXStub();
            //创建接口对应对象
            com.xteam.tourismpay.PFTMXStub.PFT_Order_Submit order_submit = new com.xteam.tourismpay.PFTMXStub.PFT_Order_Submit();
            //设置接口调用参数
            order_submit.setAc(systemAccount);
            order_submit.setPw(secretKey);
            order_submit.setLid(orderDBInfo.getLid()); //景区的ID 号int （注：2.1&门票接口的UUlid）  2633
            order_submit.setTid(orderDBInfo.getTid());//门票的ID 号int （注：2.1&门票接口的UUid）
            order_submit.setRemotenum(orderDBInfo.getOrderNo() +"");//远端订单号 String（贵网站的唯一订单号，请确保唯一，不能为空）
            order_submit.setTprice(orderDBInfo.getTprice().multiply(BigDecimal.valueOf(100)).toString());//单价(分单位)int
            order_submit.setTnum(orderDBInfo.getTnum().toString());//数量 int
            order_submit.setPlaytime(orderDBInfo.getPlayTime());//游玩时间 Date(e.g.2012-03-16)
            order_submit.setOrdername(orderDBInfo.getOrderName());//取票人姓名 String （使用测试接口，取票人姓名必须为‘测试test’）
            order_submit.setOrdertel(orderDBInfo.getOrderTel());//取票人手机 String
            order_submit.setContactTEL(orderDBInfo.getContactTel());//联系人手机String
            order_submit.setSmsSend(orderDBInfo.getSmsSend().toString());//是否需要发送短信 int （0 发送 1 不发送 注：发短信只会返回双方订单号，不发短信才会将凭证信息返回）
            order_submit.setPaymode(orderDBInfo.getPayMode().toString());//扣款方式int （0 使用账户余额 2 使用供应商处余额 4 现场支付 注：余额不足返回错误122）
            order_submit.setOrdermode(orderDBInfo.getOrderMode().toString());//下单方式 int （0 正常下单1 手机用户下单 注：如无特殊请使用正常下单）
            order_submit.setAssembly(orderDBInfo.getAssembly());//集合地点 （线路时需要，可为空）
            order_submit.setSeries(orderDBInfo.getSeries());//团号 （线路时需要，可为空）（场次信息获取接口详情 3.7 方法。必填参数 格式：
            // json_encode(array(（int）场馆 id,（int）场次 id,（string）分区 id));）
            order_submit.setConcatID(orderDBInfo.getConcatId());//联票ID （未开放，请填0）
            order_submit.setPCode(orderDBInfo.getPCode());//套票ID （未开放，请填0）
            order_submit.setM(orderDBInfo.getM());//供应商ID （注：2.1 查询门票列表的UUaid）
            order_submit.setPersonID(orderDBInfo.getPersonId());//身份证号码
            //获取接口响应值
            com.xteam.tourismpay.PFTMXStub.PFT_Order_SubmitResponse  order_submitResponse = pFTMXStub.pFT_Order_Submit(order_submit);
            String result = order_submitResponse.getPFT_Order_Submit();
            log.info("提交订单返回："+result);
            //解析
            JAXBContext context = JAXBContext.newInstance(SubmitOrderResponseData.class);
            Unmarshaller unmar = context.createUnmarshaller();
            response = (SubmitOrderResponseData) unmar.unmarshal( new StringReader(result));
            if(response.getSubmitOrderResponse().getUuErrorcode()==null){
                //更新票付通接口
                orderDBInfo.setPftOrderNo(response.getSubmitOrderResponse().getUuOrderNum());
                orderDBInfo.setOrderStatus(2);//票付通下单成功
                orderDBInfo.setUpdated(new Date());
                //更新数据
                ordersManager.update(orderDBInfo);
            }else{
                throw new PFT_Exception("["+response.getSubmitOrderResponse().getUuErrorcode()+"]:"+response.getSubmitOrderResponse().getUuErrorinfo());
            }
        }
        catch (Exception e) {
           log.error("票付通下单接口调用异常",e);
        }

        return response;
    }

    @Override
    public QueryOrderResponseData queryOrder(String orderNo) throws PFT_Exception {
        QueryOrderResponseData response = null;
        try{
            //查询本地订单
            Orders orders = new Orders();
            orders.setOrderNo(BigDecimal.valueOf(Long.valueOf(orderNo)));
            Orders orderDBInfo = ordersManager.get(orders);
            if(orderDBInfo!=null){
                //通过axis2自动生成的web service客户端的代码类
                com.xteam.tourismpay.PFTMXStub pFTMXStub = new com.xteam.tourismpay.PFTMXStub();

                 //调用票付通接口
                com.xteam.tourismpay.PFTMXStub.OrderQuery orderQuery = new com.xteam.tourismpay.PFTMXStub.OrderQuery();
                orderQuery.setAc(systemAccount);
                orderQuery.setPw(secretKey);
                orderQuery.setPftOrdernum(orderDBInfo.getUuOrderNum());
                orderQuery.setRemoteOrdernum(orderDBInfo.getOrderNo().toString());
                //获取接口响应值
                com.xteam.tourismpay.PFTMXStub.OrderQueryResponse  queryResponse = pFTMXStub.orderQuery(orderQuery);
                String result = queryResponse.getOrderQuery();
                log.info("查询订单："+result);

                //解析
                JAXBContext context = JAXBContext.newInstance(OrderQueryResonse.class);
                Unmarshaller unmar = context.createUnmarshaller();
                response = (QueryOrderResponseData) unmar.unmarshal( new StringReader(result));

            }else{
                throw new Exception("本地订单不存在");
            }

        }catch (Exception e){
            log.error("票付通订单查询接口调用异常",e);
        }
        return response;
    }

    @Override
    public void notifyStatus(TicketNotify ticketNotify) throws PFT_Exception {
        log.info("接收到出票消息：" + JsonUtils.toJSON(ticketNotify));
        //验证加密码
        String localVerifyCode = MD5Utils.MD5(systemAccount +secretKey).toLowerCase();
        if(localVerifyCode.equalsIgnoreCase(ticketNotify.getVerifyCode())){
            //更新订单的出票信息
            try {
                ordersManager.update(ticketNotify);
            } catch (Exception e) {
                throw new PFT_Exception(e.getMessage());
            }
        }else{
            throw  new PFT_Exception("加密码不一致");
        }
    }

    @Override
    public GetRealTimeStorageResonseData getRealTimeStorage(String aid, String pid,String playTime) throws PFT_Exception {
        GetRealTimeStorageResonseData response = null;
        try{
            //通过axis2自动生成的web service客户端的代码类
            com.xteam.tourismpay.PFTMXStub pFTMXStub = new com.xteam.tourismpay.PFTMXStub();
            //调用票付通接口
            com.xteam.tourismpay.PFTMXStub.GetRealTimeStorage  getRealTimeStorage = new com.xteam.tourismpay.PFTMXStub.GetRealTimeStorage();
            getRealTimeStorage.setAc(systemAccount);
            getRealTimeStorage.setPw(secretKey);
            getRealTimeStorage.setAid(aid);
            getRealTimeStorage.setPid(pid);
            getRealTimeStorage.setStart_date(playTime);
            getRealTimeStorage.setEnd_date(playTime);
            //获取接口响应值
            com.xteam.tourismpay.PFTMXStub.GetRealTimeStorageResponse  queryResponse = pFTMXStub.getRealTimeStorage(getRealTimeStorage);
            String result = queryResponse.getGetRealTimeStorage();
            log.info("查询实时库存价格："+result);

            //解析
            JAXBContext context = JAXBContext.newInstance(GetRealTimeStorageResonseData.class);
            Unmarshaller unmar = context.createUnmarshaller();
            response = (GetRealTimeStorageResonseData) unmar.unmarshal( new StringReader(result));

        }catch (Exception  e){
            log.error("票付通动态价格，实时库存上限获取接口调用异常",e);
        }
        return response;
    }
}
