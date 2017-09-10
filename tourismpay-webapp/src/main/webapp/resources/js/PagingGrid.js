/**
 * Created by yankun on 2016/3/4 0004.
 *
 *
 {
     dataUrl:'',
     dockedItems:[{
         name:'修改'
         ,iconClass:'fa fa-edit'
         ,action:'/xxxx/xxx/edit'
         ,confirm:true
         ,parmaName:'id'
         ,columnName:'id'
     }
     ,{
         name:'删除'
         ,iconClass:'fa fa-edit'
         ,action:'/xxxx/xxx/delete'
         ,confirm:true
         ,parmaName:'id'
         ,columnName:'id'
     }
     ]
     ,pagingtoolbar:{
        pageSize:20
        ,displayInfo: true,
    }
 }
 *
 *
 *
 */
(function ($) {
    /**
     * 初始默认叁数
     * @type {{pageSize: number, pageNo: number}}
     */
    var defaultParams = {
        pageSize: 20
        , pageNo: 1
    };

    $.fn.pagingGrid = function pagingGrid(options) {
        var opts = $.extend({}, defaultParams, options);
        var pageSize = opts.pageSize;
        var pageNo = opts.pageNo;
        var start = (pageNo - 1) * pageSize;

        var selector = $(this).selector;

        var table = $(selector + " table");
        var form = $(selector + " form");
        //初始化
        init();

        function viewPagingToolBar(result) {
            var limit =(pageNo *pageSize)>result.rowCount?result.rowCount:(pageNo *pageSize);
                //总页数
                var totalPageCount = Math.ceil(result.rowCount / pageSize);
                //获取翻页对象pagination-toolbar
                var paginationUI = $(selector + " .pagination-toolbar");

                if (paginationUI) {
                    paginationUI.empty();
                    var rowDiv = $("<div class='row'></div>");
                    var displayInfoDiv = $("<div class='col-md-4'> 显示  "+ (result.rowCount>0?start+1:0)+ " 到  "+ limit+" 条，共 "+ result.rowCount +" 条</div>");
                    var paginationtoolbarPanel = $("<div class='col-md-8'></div>");
                    // 显示  1 到  10 条，共 43 条
                    var paginationtoolbarDiv = $(" <ul class='pagination pull-right no-margin'></ul>");
                    //上一页
                    if (pageNo > 1) {
                        paginationtoolbarDiv.append($("<li><a href=\"javascript:goPage('" + selector + "','" + getPagingParams((pageNo - 1)) + "')\"><i class=\"fa fa-arrow-left\"></li></a></li>"));
                    } else {
                        paginationtoolbarDiv.append($("<li  class=\"disabled\"><span><i class=\" disabled fa fa-arrow-left\"></i></span></li>"));
                    }

                    var pageNoStep = 10;
                    var startPageNo = pageNo > pageNoStep ? (pageNo % pageNoStep == 0 ? pageNo - pageNoStep + 1 : pageNo - pageNo % pageNoStep + 1) : 1;
                    var maxPageNo = startPageNo + pageNoStep > totalPageCount ? totalPageCount : startPageNo + pageNoStep;

                    //首页
                    if (pageNo > pageNoStep) {
                        paginationtoolbarDiv.append($("<li><a href=\"javascript:goPage('" + selector + "','" + getPagingParams(1) + "')\">1</a></li>"));
                        paginationtoolbarDiv.append($("<i class=\"fa fa-arrow-left\"></i>"));
                    }

                    //中间页码
                    for (var i = startPageNo; i <= maxPageNo; i++) {
                        var classContent;
                        if (i == pageNo) {
                            classContent = "class=\"active\"";
                        } else {
                            classContent = "";
                        }
                        paginationtoolbarDiv.append($("<li " + classContent + "><a href=\"javascript:goPage('" + selector + "','" + getPagingParams(i) + "')\">" + i + "</a></li>"));
                    }

                    if (totalPageCount - maxPageNo > 1) {
                        paginationtoolbarDiv.append($("<li><span>&hellip;</span></li>"));
                    }

                    //尾页
                    if (maxPageNo < totalPageCount) {
                        paginationtoolbarDiv.append($("<li><a href=\"javascript:goPage('" + selector + "','" + getPagingParams(totalPageCount) + "')\">" + totalPageCount + "</a></li>"));
                    }
                    //下一页
                    if (totalPageCount <= pageNo) {
                        paginationtoolbarDiv.append($("<li class=\"disabled\"><a href=\"#\"><i class=\"fa  fa-arrow-right\"></li></a></li>"));
                    } else {
                        paginationtoolbarDiv.append($("<li><a href=\"javascript:goPage('" + selector + "','" + getPagingParams((pageNo + 1)) + "')\"><i class=\"fa  fa-arrow-right\"></li></a></li>"));
                    }

                    paginationtoolbarPanel.append(paginationtoolbarDiv);

                    rowDiv.append(displayInfoDiv);
                    rowDiv.append(paginationtoolbarPanel);
                    paginationUI.append(rowDiv);
                }
        }

        /**
         * 获取翻页参数
         * @param pageN
         */
        function getPagingParams(pageN) {
            opts.pageNo = pageN;
            return escape(JSON.stringify(opts));
        }

        /**
         * 实始化表格
         */
        function init() {
            var action = ( opts.dataUrl.indexOf("?") != -1 ? (opts.dataUrl + "&") : (opts.dataUrl + "?")) + "start=" + start + "&limit=" + pageSize + "&dt=" + new Date().getTime();
            //加载数据
            $.ajax({
                url: contextPath + action,
                type: 'Post',
                data: form.serialize(),
                success: function (result) {
                    if (result.success) {
                        $(selector + " tbody").html("");
                        //表格信息
                        $.each(result.list, function (index, rowValue) {
                            var tr = $("<tr></tr>");
                            var tbHead = table.children('thead'); //获取table对象下的thead
                            var tbHeadTh = tbHead.find('tr th'); //获取thead下的tr下的th
                            tbHeadTh.each(function () {//遍历thead的tr下的th
                                var td = getTD($(this), rowValue);
                                tr.append(td);
                            });
                            table.append(tr);
                        });

                        if (opts.pagingtoolbar != 'undefined') {
                            //显示翻页
                            viewPagingToolBar(result);
                        }
                    }
                }
            });

        }

        /**
         * 获取单元格
         * @param tdValue
         * @param rowValue
         */
        function getTD(tdValue, rowValue) {
            if (tdValue.attr("checkbox")) { //带复选框的单元格
                return getCheckBoxTD(tdValue, rowValue);
            } else if (tdValue.attr("action")) {//带action的单元格
                return getActionTD(rowValue);
            } else { //普通单元格
                var valueName = tdValue.attr("column");
                if (valueName) {
                    return $("<td>" + getColumnValue(rowValue, valueName) + "</td>");
                }
            }
        }

        /**
         * 获取button DOM
         * @param dock
         * @param rowValue
         * @returns {*|HTMLElement}
         */
        function getButtonDom(dock, rowValue) {
            var url = contextPath + dock.action + "?" + dock.parmaName + "=" + getColumnValue(rowValue, dock.column);
            var parmas = dock.name + "," + url + "," + dock.confirm + "," + dock.ajax;
            var buttonColor = "default";
            if(typeof(dock.buttonColor)!= 'undefined'){
                buttonColor = dock.buttonColor;
            }
            var button  =$("<button  class='btn "+ buttonColor +" btn-flat btn-xs' onclick=\"execAction('" + selector + "','" + escape(parmas) + "','" + getPagingParams(opts.pageNo) + "');\"><i class='"+ dock.iconClass+"'></i></button>");
            //var a = $("<a title='" + dock.name + "' href=\"javascript:execAction('" + selector + "','" + escape(parmas) + "','" + getPagingParams(opts.pageNo) + "');\" class='btn btn-"+ buttonColor+" btn-flat btn-xs'><i class='" + dock.iconClass + "'></i></a>");
            return button;
        }


        /**
         * 获取按钮组
         * @param dock
         * @param rowValue
         */
        function getButtonGroupDom(dock, rowValue) {
             var dom = $("<div class='btn-group'></div>");
            var buttonColor = "default";
            if(typeof(dock.buttonColor)!= 'undefined'){
                buttonColor = dock.buttonColor;
            }
             var buttonGroup  =$("<button  class='btn "+ buttonColor +" dropdown-toggle'  data-toggle='dropdown'><i class='"+ dock.iconClass+"'></i> "+dock.name +" <i class='fa fa-angle-down'></i> </button>");
             var dropdownMenu = $("<ul class='dropdown-menu' role='menu'></ul>");
            if (dock.items != 'undefined' && dock.items.length > 0) {
                $.each(dock.items, function (index, item) {
                    var url = contextPath + item.action + "?" + item.parmaName + "=" + getColumnValue(rowValue, item.column);
                    var parmas = item.name + "," + url + "," + item.confirm + "," + item.ajax;
                    var button = $("<li><a  href=\"javascript:execAction('" + selector + "','" + escape(parmas) + "','" + getPagingParams(opts.pageNo) + "');\"><i class='"+ item.iconClass +"'></i> "+ item.name+" </a></li>");
                    //控制可见性
                    if(typeof(item.equalField)!= 'undefined' && typeof(item.equalValue) != 'undefined'){
                        var checkValue = getColumnValue(rowValue,item.equalField);
                        if(checkValue==item.equalValue){
                            dropdownMenu.append(button);
                        }
                    }else{
                        dropdownMenu.append(button);
                    }

                });
            }
            dom.append(buttonGroup);
            dom.append(dropdownMenu);
            return dom;
        }

        function getXtypeDom(dock,rowValue) {
            var xtype = "button";
            if(typeof(dock.xtype) != 'undefined'){
                xtype = dock.xtype;
            }
            if(xtype=='button'){
                    return getButtonDom(dock,rowValue);
            }else if(xtype=='buttongroup'){
                return getButtonGroupDom(dock,rowValue);
            }
        }

        /**
         * action按钮
         * @param rowValue
         * @returns {*|HTMLElement}
         */
        function getActionTD(rowValue) {
            var td = $("<td></td>");
            if (opts.dockedItems != 'undefined' && opts.dockedItems.length > 0) {
                //表格信息
                $.each(opts.dockedItems, function (index, dock) {
                    //控制可见性
                    if(typeof(dock.equalField) != 'undefined' && typeof(dock.equalValue)!= 'undefined'){
                        var checkValue = getColumnValue(rowValue,dock.equalField);
                        if(checkValue==dock.equalValue){
                            td.append(getXtypeDom(dock,rowValue));
                        }
                    }else{
                        td.append(getXtypeDom(dock,rowValue));
                    }
                });
            }
            return td;
        }

        /**
         * 带复选框的单元格
         * @param tdValue
         * @param rowValue
         * @returns {*|HTMLElement}
         */
        function getCheckBoxTD(tdValue, rowValue) {
            return $("<td><input type=\"checkbox\" data-md-icheck class=\"ts_checkbox\" name='" + tdValue.attr("column") + "' value='" + getColumnValue(rowValue, tdValue.attr("column")) + "'></td>");
        }


        /**
         * 根据列名获取列值
         * @param rowValue
         * @param columnName
         * @returns {*}
         */
        function getColumnValue(rowValue, columnName) {
            if (columnName) {
                return rowValue[columnName] != null ? rowValue[columnName] : "";
            }
            return "";
        }
    }
})(jQuery);

/**
 *
 * @param obj
 * @param pageNo
 */
function goPage(selector, opts) {
    var options = eval("(" + unescape(opts) + ")");
    $(selector).pagingGrid(options);

}


/**
 * 执行action
 * @param options
 */
function execAction(selector, parmas, pagingParams) {
    var params = unescape(parmas).split(",");
    var action = {};
    action.name = params[0];
    action.url = params[1];
    action.confirm = params[2];
    action.ajax = params[3];
    if ("undefined" != action.confirm) {
        confirmAction(selector, action, pagingParams);
    } else {
        if ("undefined" != action.ajax) {
            ajaxAction(selector, action, pagingParams);
        } else {
            urlAction(selector, action, pagingParams);
        }
    }

    function urlAction(selector, action, pagingParams) {
        location.href = action.url;
        goPage(selector, pagingParams);
    }

    function ajaxAction(selector, action, pagingParams) {
        $.ajax({
            url: action.url + "&dt=" + new Date().getTime(),
            type: 'GET',
            success: function (result) {
                var success = result.success;
                if (success) {
                    window.wxc.xcConfirm(action.name + "成功。", window.wxc.xcConfirm.typeEnum.info);
                    goPage(selector, pagingParams);
                } else {
                    window.wxc.xcConfirm(result.message, window.wxc.xcConfirm.typeEnum.error);
                }
            }
        });
    }

    /**
     * 确认Action
     * @param action
     * @constructor
     */
    function confirmAction(selector, action, pagingParams) {
        window.wxc.xcConfirm('确定要' + action.name + '么?', window.wxc.xcConfirm.typeEnum.confirm, {
            title: '提示'
            , onOk: function () {
                if ("undefined" != action.ajax) {
                    ajaxAction(selector, action, pagingParams);
                } else {
                    urlAction(selector, action, pagingParams);
                }
            },
        });
    }
}
