package com.api.demo.gui;

import javax.swing.*;

public class Demo_GuessNumber {
    public static void main(String[] args) {
        //创建窗口
        JFrame jf = new JFrame();
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setAlwaysOnTop(true);
        jf.setTitle("猜数字");

        //创建文本标签
        JLabel jLabel = new JLabel("系统产生一个1-100之间数字，请猜一猜");
        jLabel.setBounds(70,50,350,20);
        jf.add(jLabel);

        //创建文本域
        JTextField jTextField = new JTextField();
        jTextField.setBounds(120,100,150,20);
        jf.add(jTextField);

        //按钮
        JButton jButton = new JButton("提交");
        jButton.setBounds(150,150,100,20);
        jf.add(jButton);

        jf.setVisible(true);

    }
}
