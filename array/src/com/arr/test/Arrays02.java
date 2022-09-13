package com.arr.test;
/*
    需求：已知一个二维数组 arr = {{1,2,3},{4,5,6},{7,8,9}}; 请把元素在控制台输出
 */
public class Arrays02 {
    public static void main(String[] args) {
        //定义二维数组，并进行静态初始化
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //获取数据1,2,3
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
//        for (int i = 0; i < arr[0].length; i++) {
//            System.out.println(arr[0][i]);
//        }
//
//        //获取数据4,5,6
////        System.out.println(arr[1][0]);
////        System.out.println(arr[1][1]);
////        System.out.println(arr[1][2]);
//        for (int i = 0; i < arr[1].length; i++) {
//            System.out.println(arr[1][i]);
//        }
//
//        //获取数据7,8,9
////        System.out.println(arr[2][0]);
////        System.out.println(arr[2][1]);
////        System.out.println(arr[2][2]);
//        for (int i = 0; i < arr[2].length; i++) {
//            System.out.println(arr[2][i]);
//        }

        for (int i = 0; i < arr.length; i++) {
            //arr[i]
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
