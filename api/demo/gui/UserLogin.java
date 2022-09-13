package com.api.demo.gui;

import javax.swing.*;

/*
    用户登录
 */
public class UserLogin {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        jf.setTitle("用户登录");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //显示用户名文本
        JLabel usernameLable = new JLabel("用户名");
        usernameLable.setBounds(50,50,50,20);
        jf.add(usernameLable);

        //用户名输入框
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150,50,180,20);
        jf.add(usernameField);

        //显示密码文本
        JLabel passwordLable = new JLabel("密码");
        passwordLable.setBounds(50,100,50,20);
        jf.add(passwordLable);

        //密码输入框
//        JTextField passwordField = new JTextField();
//        passwordField.setBounds(150,100,180,20);
//        jf.add(passwordField);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150,100,180,20);
        jf.add(passwordField);

        //登录按钮
        JButton loginButton = new JButton("登录");
        loginButton.setBounds(50,200,280,20);
        jf.add(loginButton);

        jf.setVisible(true);
    }
}
