package com.api.demo.gui;

import javax.swing.*;
/*简易考勤查询*/
public class Demo_AttendanceQuery01 {
    public static void main(String[] args) {
        //创建窗口
        JFrame jf = new JFrame();
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setAlwaysOnTop(true);
        jf.setTitle("考勤查询");

        //创建三个标签
        JLabel dateLabel = new JLabel("考勤日期");
        dateLabel.setBounds(50,20,100,20);
        jf.add(dateLabel);

        JLabel startLabel = new JLabel("开始时间");
        startLabel.setBounds(50,70,100,20);
        jf.add(startLabel);

        JLabel endLabel = new JLabel("结束时间");
        endLabel.setBounds(250,70,100,20);
        jf.add(endLabel);

        //创建两个文本域
        JTextField startTextField1 = new JTextField();
        startTextField1.setBounds(50,100,100,20);
        jf.add(startTextField1);

        JTextField endTextField2 = new JTextField();
        endTextField2.setBounds(250,100,100,20);
        jf.add(endTextField2);

        //创建按钮
        JButton jButton = new JButton("确定");
        jButton.setBounds(250,180,60,20);
        jf.add(jButton);

        jf.setVisible(true);
    }
}
