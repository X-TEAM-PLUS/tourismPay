package com.xteam.tourismpay.common;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月10日
 * Time: 09:47:04
 * TableName:T_ORDERS
 */
public class DateTimeConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        try {
            return dateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
