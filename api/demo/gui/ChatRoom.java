package com.api.demo.gui;

import javax.swing.*;

/*
    聊天室
 */
public class ChatRoom {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        jf.setTitle("聊天室");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //显示聊天信息的文本域
        JTextArea messageArea = new JTextArea();
        messageArea.setBounds(10,10,360,200);
        jf.add(messageArea);

        //输入聊天信息的文本框
        JTextField messageField = new JTextField();
        messageField.setBounds(10,230,180,20);
        jf.add(messageField);

        //发送按钮
        JButton sendButton = new JButton("发送");
        sendButton.setBounds(200,230,70,20);
        jf.add(sendButton);

        //清空聊天按钮
        JButton clearButton = new JButton("清空聊天");
        clearButton.setBounds(280,230,100,20);
        jf.add(clearButton);

        jf.setVisible(true);
    }
}
