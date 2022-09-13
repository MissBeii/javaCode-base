package com.arr.demo;

import java.util.Random;

/*
    需求：已知二维数组 arr = {{1,2,3},{4,5,6},{7,8,9}};用程序实现把数组中的元素打乱,并在控制台输出打乱后的数组元素
 */
public class Demo_ArraysMakeup {
    public static void main(String[] args) {
        //定义一个二维数组
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11}};
        //遍历-原本对比
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //定义随机对象
        Random r = new Random();
        //遍历二维数组打乱
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //随机坐标arr[x][y]
                int x = r.nextInt(arr.length);
                int y = r.nextInt(arr[x].length);
                //置换
                int temp = arr[i][j];
                arr[i][j] = arr[x][y];
                arr[x][y] = temp;
            }
        }
        //遍历-打乱
        System.out.println("--------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
