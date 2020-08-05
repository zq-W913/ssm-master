package com.mytest.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvert implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat simpleDate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            if (simpleDate != null) {
                simpleDate.parse(s);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
