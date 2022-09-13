package com.arr.test;
/*
    遍历
 */
public class Array01 {
    public static void main(String[] args) {
        //定义数组并初始化
        int[] arr = {77, 88, 99, 66, 55, 44};

        //获取数组中的元素
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        //用循环改进
//        for (int i=0; i<5; i++) {
//            System.out.println(arr[i]);
//        }

        //格式：数组名.length
//        System.out.println(arr.length);

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
