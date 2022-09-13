package com.api.demo.gui;

import javax.swing.*;

public class Demo_ChatRoom {
    public static void main(String[] args) {
        //创建窗口
        JFrame jf = new JFrame();
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setAlwaysOnTop(true);
        jf.setTitle("聊天室");

        //文本域
        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(10,10,360,200);
        jf.add(jTextArea);

        // 文本框
        JTextField jTextField = new JTextField();
        jTextField.setBounds(10,230,180,20);
        jf.add(jTextField);

        //按钮
        JButton jButton1 = new JButton("发送");
        jButton1.setBounds(200,230,70,20);
        JButton jButton2 = new JButton("清空聊天");
        jButton2.setBounds(280,230,100,20);

        jf.add(jButton1);
        jf.add(jButton2);
        jf.setVisible(true);

    }
}
