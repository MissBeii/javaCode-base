package com.arr.demo;


import java.util.Scanner;

/*
    需求：定义一个可以存储5个元素的int数组，数据来自于键盘录入，最后遍历数组，把元素输出在控制台
 */
public class ArrayScanner {
    public static void main(String[] args) {
        //定义一个数组，并进行动态初始化
        int[] arr = new int[5];

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

//        //录入第1个数据
//        System.out.println("请输入第1个数据：");
////        int i = sc.nextInt();
////        arr[0] = i;
//        arr[0] = sc.nextInt();
//
//        //录入第2个数据
//        System.out.println("请输入第2个数据：");
//        arr[1] = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素：");
            arr[i] = sc.nextInt();
        }

        printArray(arr);

        //输出内容并换行
//        System.out.println("hello");
//        System.out.println("world");
        //输出内容不换行
//        System.out.print("hello");
//        System.out.print("world");
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }

    /*
        参数：int[] arr
        返回值：void
     */
//    public static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
}
