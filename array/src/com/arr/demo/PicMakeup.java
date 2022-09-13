package com.arr.demo;

import javax.swing.*;
import java.util.Random;

/*
    图片打乱
 */
public class PicMakeup {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        jf.setTitle("图片打乱");
        jf.setSize(380, 400);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //图片打乱
        int[][] datas = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        Random r = new Random();
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                int x = r.nextInt(datas.length);
                int y = r.nextInt(datas[x].length);

                int temp = datas[i][j];
                datas[i][j] = datas[x][y];
                datas[x][y] = temp;
            }
        }

        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                JLabel jLabel = new JLabel(new ImageIcon("itheima-array2\\images\\"+datas[i][j]+".png"));
                jLabel.setBounds(j*90,i*90,90,90);
                jf.add(jLabel);
            }
        }

        jf.setVisible(true);
    }
}
