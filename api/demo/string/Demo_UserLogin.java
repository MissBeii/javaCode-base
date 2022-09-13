package com.api.demo.string;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    1:已知的用户名和密码
        用户名：itheima
	    密码：123456
    2:用户名和密码的长度都是6-12位
    3:点击登录按钮
	    先判断输入的用户名和密码是否符合要求
	    再判断用户登录是否成功*/
public class Demo_UserLogin {
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

        //已知用户名密码
        String name = "string";
        String password = "123456";

        //登录按钮
        JButton loginButton = new JButton("登录");
        loginButton.setBounds(50,200,280,20);
        jf.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //文本域回显
                String nameField = usernameField.getText();
                String pwdField = passwordField.getText();
                if(nameField.length()<6||nameField.length()>12){
                    //字数不符合要求重新填写,不正确不能往下执行
                    //System.out.println("用户名长度6-12，请重新输入");
                    //页面统一，与后台分离
                    //JOptionPane轻松弹出一个对话框，用于提示或通知
                    JOptionPane.showMessageDialog(jf,"用户名长度6-12，请重新输入");
                    //错误，控件文本域清除，回显空
                    usernameField.setText("");
                    return;
                }
                if(pwdField.length()<6 || pwdField.length()>12){
                    //字数不符合要求重新填写
                    JOptionPane.showMessageDialog(jf,"密码长度6-12，请重新输入");
                    passwordField.setText("");
                    return;
                }
                if(nameField.equals(name) && pwdField.equals(password)){
                   // System.out.println("登录成功");
                    JOptionPane.showMessageDialog(jf,"登录成功");
                    passwordField.setText("");
                    usernameField.setText("");
                }else{
                    JOptionPane.showMessageDialog(jf,"用户名或密码不符，登录失败");
                }

            }
        });

        jf.setVisible(true);
    }
}

