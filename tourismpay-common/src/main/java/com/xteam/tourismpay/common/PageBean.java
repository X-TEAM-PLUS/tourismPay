package com.xteam.tourismpay.common;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月10日
 * Time: 09:47:04
 * 功能:翻页参数
 */
public class PageBean {
    private Integer start;
    private Integer limit;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}


