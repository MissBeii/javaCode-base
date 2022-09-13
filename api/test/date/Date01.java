package com.api.test.date;

import java.util.Date;
/*
    构造方法：
        Date()：分配 Date对象并对其进行初始化，使其表示分配时间，测量 Date到毫秒
        Date(long date)：分配 Date对象并初始化它以表示自标准基准时间以来的指定毫秒数，即1970年1月1日00:00:00
 */
public class Date01 {
    public static void main(String[] args) {
        //Date()：分配 Date对象并对其进行初始化，使其表示分配时间，测量 Date到毫秒
        Date d1 = new Date();
        System.out.println(d1);//Sun Apr 17 15:29:50 CST 2022--时间

        //Date(long date)：分配 Date对象并初始化它以表示自标准基准时间以来的指定毫秒数，即1970年1月1日00:00:00
        Date d2 = new Date(1000 * 60 * 60);
        System.out.println(d2);//Thu Jan 01 09:00:00 CST 1970--中国用东8时区，00加8基础加(1000 * 60 * 60)毫秒
    }
}