/**
 * PFTMXCallbackHandler.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package com.xteam.tourismpay;


/**
 *  PFTMXCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class PFTMXCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public PFTMXCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public PFTMXCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for get_ScenicSpot_List method
     * override this method for handling normal response from get_ScenicSpot_List operation
     */
    public void receiveResultget_ScenicSpot_List(
            com.xteam.tourismpay.PFTMXStub.Get_ScenicSpot_ListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from get_ScenicSpot_List operation
     */
    public void receiveErrorget_ScenicSpot_List(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for uPD_Order_Print_Status method
     * override this method for handling normal response from uPD_Order_Print_Status operation
     */
    public void receiveResultuPD_Order_Print_Status(
            com.xteam.tourismpay.PFTMXStub.UPD_Order_Print_StatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from uPD_Order_Print_Status operation
     */
    public void receiveErroruPD_Order_Print_Status(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for dynamic_Storage_Check method
     * override this method for handling normal response from dynamic_Storage_Check operation
     */
    public void receiveResultdynamic_Storage_Check(
            com.xteam.tourismpay.PFTMXStub.Dynamic_Storage_CheckResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from dynamic_Storage_Check operation
     */
    public void receiveErrordynamic_Storage_Check(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for pFT_Member_Relationship method
     * override this method for handling normal response from pFT_Member_Relationship operation
     */
    public void receiveResultpFT_Member_Relationship(
            com.xteam.tourismpay.PFTMXStub.PFT_Member_RelationshipResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from pFT_Member_Relationship operation
     */
    public void receiveErrorpFT_Member_Relationship(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for ping method
     * override this method for handling normal response from ping operation
     */
    public void receiveResultping(
            com.xteam.tourismpay.PFTMXStub.PingResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from ping operation
     */
    public void receiveErrorping(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for send_SMS_V method
     * override this method for handling normal response from send_SMS_V operation
     */
    public void receiveResultsend_SMS_V(
            com.xteam.tourismpay.PFTMXStub.Send_SMS_VResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from send_SMS_V operation
     */
    public void receiveErrorsend_SMS_V(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for check_Remote_URL method
     * override this method for handling normal response from check_Remote_URL operation
     */
    public void receiveResultcheck_Remote_URL(
            com.xteam.tourismpay.PFTMXStub.Check_Remote_URLResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from check_Remote_URL operation
     */
    public void receiveErrorcheck_Remote_URL(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for check_PersonID method
     * override this method for handling normal response from check_PersonID operation
     */
    public void receiveResultcheck_PersonID(
            com.xteam.tourismpay.PFTMXStub.Check_PersonIDResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from check_PersonID operation
     */
    public void receiveErrorcheck_PersonID(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for pFT_Coupon_Pre_Check method
     * override this method for handling normal response from pFT_Coupon_Pre_Check operation
     */
    public void receiveResultpFT_Coupon_Pre_Check(
            com.xteam.tourismpay.PFTMXStub.PFT_Coupon_Pre_CheckResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from pFT_Coupon_Pre_Check operation
     */
    public void receiveErrorpFT_Coupon_Pre_Check(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for order_Globle_Search method
     * override this method for handling normal response from order_Globle_Search operation
     */
    public void receiveResultorder_Globle_Search(
            com.xteam.tourismpay.PFTMXStub.Order_Globle_SearchResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from order_Globle_Search operation
     */
    public void receiveErrororder_Globle_Search(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for sendCustomTemplateSms method
     * override this method for handling normal response from sendCustomTemplateSms operation
     */
    public void receiveResultsendCustomTemplateSms(
            com.xteam.tourismpay.PFTMXStub.SendCustomTemplateSmsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from sendCustomTemplateSms operation
     */
    public void receiveErrorsendCustomTemplateSms(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for get_Ticket_List method
     * override this method for handling normal response from get_Ticket_List operation
     */
    public void receiveResultget_Ticket_List(
            com.xteam.tourismpay.PFTMXStub.Get_Ticket_ListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from get_Ticket_List operation
     */
    public void receiveErrorget_Ticket_List(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reSend_SMS_Global_PL method
     * override this method for handling normal response from reSend_SMS_Global_PL operation
     */
    public void receiveResultreSend_SMS_Global_PL(
            com.xteam.tourismpay.PFTMXStub.ReSend_SMS_Global_PLResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reSend_SMS_Global_PL operation
     */
    public void receiveErrorreSend_SMS_Global_PL(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for pFT_Order_Submit method
     * override this method for handling normal response from pFT_Order_Submit operation
     */
    public void receiveResultpFT_Order_Submit(
            com.xteam.tourismpay.PFTMXStub.PFT_Order_SubmitResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from pFT_Order_Submit operation
     */
    public void receiveErrorpFT_Order_Submit(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for order_chk_verify method
     * override this method for handling normal response from order_chk_verify operation
     */
    public void receiveResultorder_chk_verify(
            com.xteam.tourismpay.PFTMXStub.Order_chk_verifyResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from order_chk_verify operation
     */
    public void receiveErrororder_chk_verify(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for authrize method
     * override this method for handling normal response from authrize operation
     */
    public void receiveResultauthrize(
            com.xteam.tourismpay.PFTMXStub.AuthrizeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from authrize operation
     */
    public void receiveErrorauthrize(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getRealTimeStorage method
     * override this method for handling normal response from getRealTimeStorage operation
     */
    public void receiveResultgetRealTimeStorage(
            com.xteam.tourismpay.PFTMXStub.GetRealTimeStorageResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getRealTimeStorage operation
     */
    public void receiveErrorgetRealTimeStorage(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for get_qrcode method
     * override this method for handling normal response from get_qrcode operation
     */
    public void receiveResultget_qrcode(
            com.xteam.tourismpay.PFTMXStub.Get_qrcodeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from get_qrcode operation
     */
    public void receiveErrorget_qrcode(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for orderQuery method
     * override this method for handling normal response from orderQuery operation
     */
    public void receiveResultorderQuery(
            com.xteam.tourismpay.PFTMXStub.OrderQueryResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from orderQuery operation
     */
    public void receiveErrororderQuery(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for mpath_post method
     * override this method for handling normal response from mpath_post operation
     */
    public void receiveResultmpath_post(
            com.xteam.tourismpay.PFTMXStub.Mpath_postResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from mpath_post operation
     */
    public void receiveErrormpath_post(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for pFT_Member_Fund method
     * override this method for handling normal response from pFT_Member_Fund operation
     */
    public void receiveResultpFT_Member_Fund(
            com.xteam.tourismpay.PFTMXStub.PFT_Member_FundResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from pFT_Member_Fund operation
     */
    public void receiveErrorpFT_Member_Fund(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for logrec method
     * override this method for handling normal response from logrec operation
     */
    public void receiveResultlogrec(
            com.xteam.tourismpay.PFTMXStub.LogrecResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from logrec operation
     */
    public void receiveErrorlogrec(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for dynamic_Price_And_Storage method
     * override this method for handling normal response from dynamic_Price_And_Storage operation
     */
    public void receiveResultdynamic_Price_And_Storage(
            com.xteam.tourismpay.PFTMXStub.Dynamic_Price_And_StorageResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from dynamic_Price_And_Storage operation
     */
    public void receiveErrordynamic_Price_And_Storage(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for get_Screenings_List method
     * override this method for handling normal response from get_Screenings_List operation
     */
    public void receiveResultget_Screenings_List(
            com.xteam.tourismpay.PFTMXStub.Get_Screenings_ListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from get_Screenings_List operation
     */
    public void receiveErrorget_Screenings_List(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for get_ScenicSpot_Info method
     * override this method for handling normal response from get_ScenicSpot_Info operation
     */
    public void receiveResultget_ScenicSpot_Info(
            com.xteam.tourismpay.PFTMXStub.Get_ScenicSpot_InfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from get_ScenicSpot_Info operation
     */
    public void receiveErrorget_ScenicSpot_Info(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for get_Dynamic_Price_Merge method
     * override this method for handling normal response from get_Dynamic_Price_Merge operation
     */
    public void receiveResultget_Dynamic_Price_Merge(
            com.xteam.tourismpay.PFTMXStub.Get_Dynamic_Price_MergeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from get_Dynamic_Price_Merge operation
     */
    public void receiveErrorget_Dynamic_Price_Merge(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for thirdOrderSystem method
     * override this method for handling normal response from thirdOrderSystem operation
     */
    public void receiveResultthirdOrderSystem(
            com.xteam.tourismpay.PFTMXStub.ThirdOrderSystemResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from thirdOrderSystem operation
     */
    public void receiveErrorthirdOrderSystem(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for terminal_Code_Verify method
     * override this method for handling normal response from terminal_Code_Verify operation
     */
    public void receiveResultterminal_Code_Verify(
            com.xteam.tourismpay.PFTMXStub.Terminal_Code_VerifyResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from terminal_Code_Verify operation
     */
    public void receiveErrorterminal_Code_Verify(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for sMS_User_Defined method
     * override this method for handling normal response from sMS_User_Defined operation
     */
    public void receiveResultsMS_User_Defined(
            com.xteam.tourismpay.PFTMXStub.SMS_User_DefinedResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from sMS_User_Defined operation
     */
    public void receiveErrorsMS_User_Defined(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for order_Change_Pro method
     * override this method for handling normal response from order_Change_Pro operation
     */
    public void receiveResultorder_Change_Pro(
            com.xteam.tourismpay.PFTMXStub.Order_Change_ProResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from order_Change_Pro operation
     */
    public void receiveErrororder_Change_Pro(java.lang.Exception e) {
    }
}
