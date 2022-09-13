package com.api.test.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    构造方法
        SimpleDateFormat()：构造一个SimpleDateFormat，使用默认模式和日期格式
        SimpleDateFormat(String pattern)：构造一个SimpleDateFormat使用给定的模式和默认的日期格式

    格式化(从 Date 到 String )
        String format(Date date)：将日期格式化成日期/时间字符串

    解析(从 String 到 Date )
        Date parse(String source)：从给定字符串的开始解析文本以生成日期
 */
public class SimpleDateFormat01 {
    public static void main(String[] args) throws ParseException {
        //格式化(从 Date 到 String )
        Date d = new Date();
        //SimpleDateFormat()：构造一个SimpleDateFormat，使用默认模式和日期格式
//        SimpleDateFormat sdf = new SimpleDateFormat();
        //SimpleDateFormat(String pattern)：构造一个SimpleDateFormat使用给定的模式和默认的日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);//2022年04月17日 15:31:58
        System.out.println("-----------------");

        //解析(从 String 到 Date )
        //字符串与格式一致
        String ss = "2021-10-27 11:11:11";
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date dd = sdf2.parse(ss);
        System.out.println(dd);//Wed Oct 27 11:11:11 CST 2021
    }
}
