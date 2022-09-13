package com.api.demo.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    事件监听机制,给按钮加事件
        事件源（可以按钮，窗体，图片...）
        事件（鼠标，键盘...）
        绑定（将事件绑定到事件源上）
 */
public class ActionListener01 {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        jf.setTitle("事件监听机制");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //创建按钮
        JButton jButton = new JButton("你点我啊");
        jButton.setBounds(0, 0, 100, 100);
        jf.add(jButton);

        //核心代码
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你点我啊");//核心代码
            }
        });

        jf.setVisible(true);
    }
}
