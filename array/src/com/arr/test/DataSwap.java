package com.arr.test;
/*
    数据交换
 */
public class DataSwap {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        System.out.println("交换前：a=" + a + ",b=" + b);
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("交换后：a=" + a + ",b=" + b);

        int[] arr = {11, 22, 33, 44, 55};
        System.out.println("交换前：arr[0]=" + arr[0] + ",arr[4]=" + arr[4]);
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        System.out.println("交换后：arr[0]=" + arr[0] + ",arr[4]=" + arr[4]);
    }
}
