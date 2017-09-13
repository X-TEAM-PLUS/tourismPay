package com.xteam.tourismpay.common;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年05月31日
 * Time: 16:14:03
 * TableName:T_YIQIAN_MEMBER_BASIC_INFO
 */
public class DateTimeConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if(source==null || source.isEmpty()){
            return null;
        }
        String format = "yyyy-MM-dd HH:mm:ss";
        if(source.length()==10){
            format = "yyyy-MM-dd";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setLenient(false);
        try {
            return dateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}

