package com.arr.test;

/*
    动态初始化：初始化时只指定数组长度，由系统为数组分配初始值
    格式：数据类型[] 变量名 = new 数据类型[数组长度];
    范例：int[] arr = new int[3];
 */
public class Array04 {
    public static void main(String[] args) {
        //格式：数据类型[] 变量名 = new 数据类型[数组长度];
        int[] arr = new int[3];

        //输出数组名
        System.out.println(arr); //[I@776ec8df

        //输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("------------");

        //修改数组中的元素
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        //再次输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
