package com.arr.demo;

import javax.swing.*;

/*
    图片展示
 */
public class Demo_ShowPics {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        jf.setTitle("图片展示");
        jf.setSize(380, 400);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

//        JLabel jLabel1 = new JLabel(new ImageIcon("array\\images\\1.png"));
//        jLabel1.setBounds(0, 0, 90, 90);
//        jf.add(jLabel1);
//
//        JLabel jLabel2 = new JLabel(new ImageIcon("array\\images\\2.png"));
//        jLabel2.setBounds(90, 0, 90, 90);
//        jf.add(jLabel2);
//
//        JLabel jLabel3 = new JLabel(new ImageIcon("array\\images\\3.png"));
//        jLabel3.setBounds(180, 0, 90, 90);
//        jf.add(jLabel3);
//
//        JLabel jLabel4 = new JLabel(new ImageIcon("array\\images\\4.png"));
//        jLabel4.setBounds(270, 0, 90, 90);
//        jf.add(jLabel4);

//        for (int i=0; i<4; i++) {
//            JLabel jLabel = new JLabel(new ImageIcon("array\\images\\"+(i+1)+".png"));
//            jLabel.setBounds(i*90,0,90,90);
//            jf.add(jLabel);
//        }
//
////        JLabel jLabel5 = new JLabel(new ImageIcon("array\\images\\5.png"));
////        jLabel5.setBounds(0, 90, 90, 90);
////        jf.add(jLabel5);
////
////        JLabel jLabel6 = new JLabel(new ImageIcon("array\\images\\6.png"));
////        jLabel6.setBounds(90, 90, 90, 90);
////        jf.add(jLabel6);
////
////        JLabel jLabel7 = new JLabel(new ImageIcon("array\\images\\7.png"));
////        jLabel7.setBounds(180, 90, 90, 90);
////        jf.add(jLabel7);
////
////        JLabel jLabel8 = new JLabel(new ImageIcon("array\\images\\8.png"));
////        jLabel8.setBounds(270, 90, 90, 90);
////        jf.add(jLabel8);
//        for (int i=0; i<4; i++) {
//            JLabel jLabel = new JLabel(new ImageIcon("array\\images\\"+(i+5)+".png"));
//            jLabel.setBounds(i*90,90,90,90);
//            jf.add(jLabel);
//        }
//
////        JLabel jLabel9 = new JLabel(new ImageIcon("array\\images\\9.png"));
////        jLabel9.setBounds(0, 180, 90, 90);
////        jf.add(jLabel9);
////
////        JLabel jLabel10 = new JLabel(new ImageIcon("array\\images\\10.png"));
////        jLabel10.setBounds(90, 180, 90, 90);
////        jf.add(jLabel10);
////
////        JLabel jLabel11 = new JLabel(new ImageIcon("array\\images\\11.png"));
////        jLabel11.setBounds(180, 180, 90, 90);
////        jf.add(jLabel11);
////
////        JLabel jLabel12 = new JLabel(new ImageIcon("array\\images\\12.png"));
////        jLabel12.setBounds(270, 180, 90, 90);
////        jf.add(jLabel12);
//        for (int i=0; i<4; i++) {
//            JLabel jLabel = new JLabel(new ImageIcon("array\\images\\"+(i+9)+".png"));
//            jLabel.setBounds(i*90,180,90,90);
//            jf.add(jLabel);
//        }
//
////        JLabel jLabel13 = new JLabel(new ImageIcon("array\\images\\13.png"));
////        jLabel13.setBounds(0, 270, 90, 90);
////        jf.add(jLabel13);
////
////        JLabel jLabel14 = new JLabel(new ImageIcon("array\\images\\14.png"));
////        jLabel14.setBounds(90, 270, 90, 90);
////        jf.add(jLabel14);
////
////        JLabel jLabel15 = new JLabel(new ImageIcon("array\\images\\15.png"));
////        jLabel15.setBounds(180, 270, 90, 90);
////        jf.add(jLabel15);
////
////        JLabel jLabel16 = new JLabel(new ImageIcon("array\\images\\16.png"));
////        jLabel16.setBounds(270, 270, 90, 90);
////        jf.add(jLabel16);
//        for (int i=0; i<4; i++) {
//            JLabel jLabel = new JLabel(new ImageIcon("array\\images\\"+(i+13)+".png"));
//            jLabel.setBounds(i*90,270,90,90);
//            jf.add(jLabel);
//        }
//        //创建数组骨架(不用数据)
//        int[][] arr = new int[4][4];
//        //循环遍历显示
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//               // JLabel jLabel = new JLabel(new ImageIcon("array\\images\\"+(i*4+j+1)+".png"));
//                JLabel jLabel = new JLabel(new ImageIcon("array\\images\\"+(i*4+j+1)+".png"));
//                jLabel.setBounds((j*90),(i*90),90,90);
//                jf.add(jLabel);
//            }
//        }

        //创建数组骨架(带数据)
        int[][] datas = {
                {1,2,3,4,},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        //循环遍历显示
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                // JLabel jLabel = new JLabel(new ImageIcon("array\\images\\"+(i*4+j+1)+".png"));
                JLabel jLabel = new JLabel(new ImageIcon("array\\images\\"+datas[i][j]+".png"));
                jLabel.setBounds((j*90),(i*90),90,90);
                jf.add(jLabel);
            }
        }

        jf.setVisible(true);

    }
}
