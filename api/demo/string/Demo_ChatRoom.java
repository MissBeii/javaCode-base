package com.api.demo.string;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    聊天室 gui-string
    1:把文本框的内容发送到文本域中
    2:每次发送的文本内容不带前后空格
    3:多次发送的内容在文本域以追加的方式呈现
    4:清空聊天就是把文本域的内容设置为空
 */
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
        JButton sendButton = new JButton("发送");
        sendButton.setBounds(200,230,70,20);
        JButton clearButton = new JButton("清空聊天");
        clearButton.setBounds(280,230,100,20);
        jf.add(sendButton);
        jf.add(clearButton);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取文本框内容
                String text = jTextField.getText().trim();
                //文本框清空
                jTextField.setText("");
                //发送到文本域-单行
               // jTextArea.setText(text);
                //多行追加,并换行
                jTextArea.append(text+"\n");
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //清空聊天
                jTextArea.setText("");
            }
        });

        jf.setVisible(true);

    }
}
