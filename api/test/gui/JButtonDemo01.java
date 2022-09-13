package com.api.test.gui;

import javax.swing.*;

public class JButtonDemo01 {
    /*
        构造方法
            JButton(String text)：构造一个带文本的按钮

        成员方法
            btn.setLocation(100,100)：设置坐标
            void setSize(int width, int height)：设置大小，使其宽度为width，高度为height，单位是像素
            btn.setBounds(100,100,100,20);
     */
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setTitle("给窗体中添加按钮");
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);//取消窗体的默认布局

        JButton btn = new JButton("我是按钮");
       /* //void setSize(int width, int height)：设置大小
        btn.setSize(100,20);
        // btn.setLocation(100,100)：设置坐标.默认0,0
        btn.setLocation(100,100);*/
        btn.setBounds(100,100,100,20);

        JButton btn2 = new JButton("我是按钮2");
        btn2.setBounds(100,120,100,20);

        //容器可以通过add添加组件
        jf.add(btn);
        jf.add(btn2);

        jf.setVisible(true);


    }
}
