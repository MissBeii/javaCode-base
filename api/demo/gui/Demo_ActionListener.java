package com.api.demo.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo_ActionListener {
    public static void main(String[] args) {
        //创建窗口
        JFrame jf = new JFrame();
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setAlwaysOnTop(true);
        jf.setTitle("事件-按钮添加点击事件");

        //事件源
        JButton jButton = new JButton("点击");
        jButton.setBounds(150,150,80,80);
        jf.add(jButton);
        //绑定
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //事件
                System.out.println("点我了");
            }
        });

        jf.setVisible(true);
    }
}
