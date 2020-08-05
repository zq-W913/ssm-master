package com.mytest.convert;

import org.springframework.core.convert.converter.Converter;

public class StringConvert implements Converter<String,String> {


    @Override
    public String convert(String s) {
        if (s != null) {
           return s.trim();
        }
        return null;
    }
}
