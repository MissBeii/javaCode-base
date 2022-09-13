package com.arr.demo;

import javax.swing.*;
import java.util.Random;

/*
    图片打乱
 */
public class Demo_PicMakeup {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        jf.setTitle("图片打乱");
        jf.setSize(380, 400);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //骨架
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        //打乱数组方式
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //arr[x][y]任意
                int x = r.nextInt(arr.length);
                int y = r.nextInt(arr[x].length);
                
                int temp = arr[i][j];
                arr[i][j] = arr[x][y];
                arr[x][y] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                JLabel jLabel = new JLabel(new ImageIcon("array\\images\\"+arr[i][j]+".png"));
                jLabel.setBounds(j*90,i*90,90,90);
                jf.add(jLabel);
            }
        }

        jf.setVisible(true);
    }
}
