package com.arr.demo;

import java.util.Random;

/*
    需求：已知二维数组 arr = {{1,2,3},{4,5,6},{7,8,9}};用程序实现把数组中的元素打乱,并在控制台输出打乱后的数组元素
 */
public class ArraysMakeup {
    public static void main(String[] args) {
        //定义二维数组，并进行静态初始化
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //创建随机数对象
        Random r = new Random();

        //遍历二维数组，进行元素打乱
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //arr[i][j]
                int x = r.nextInt(arr.length);
                int y = r.nextInt(arr[x].length);

                //元素交换
                int temp = arr[i][j];
                arr[i][j] = arr[x][y];
                arr[x][y] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
