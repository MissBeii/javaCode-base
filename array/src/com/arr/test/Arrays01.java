package com.arr.test;
/*
    静态初始化简化格式：数据类型[][] 数组名 = {{元素...},{元素...},{元素...},...};
 */
public class Arrays01 {
    public static void main(String[] args) {
        //静态初始化简化格式：数据类型[][] 数组名 = {{元素...},{元素...},{元素...},...};
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        //输出数组名
        System.out.println(arr); //[[I@776ec8df

        System.out.println(arr[0]); //[I@4eec7777
        System.out.println(arr[1]); //[I@3b07d329

        //如何获取到数据1,2,3呢？
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
    }
}