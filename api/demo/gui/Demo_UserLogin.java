package com.api.demo.gui;

import javax.swing.*;

public class Demo_UserLogin {

    public static void main(String[] args) {
        //创建窗体
        JFrame jf = new JFrame();
        jf.setTitle("登录");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);

        //创建字符串-用户名文本
        JLabel Jlabel1 = new JLabel("用户名：");
        Jlabel1.setBounds(50,50,50,20);
        jf.add(Jlabel1);
        //创建输入框
        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(150,50,180,20);
        jf.add(jTextField1);

        JLabel Jlabel2 = new JLabel("密码：");
        Jlabel2 .setBounds(50,100,50,20);
        jf.add(Jlabel2);

        //创建密码输入框-不能回显
        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150,100,180,20);
        jf.add(jPasswordField);

        //创建登录按钮
        JButton btn = new JButton("登录");
        btn.setBounds(50,200,280,20);

        jf.add(btn);


        jf.setVisible(true);


    }

}
