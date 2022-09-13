package com.api.test.gui;

import javax.swing.*;

/*
    构造方法
        容器组件
        JFrame()：构造一个最初不可见的新窗体

    成员方法
        void setVisible(boolean b)：显示或隐藏此窗体具体取决于参数b的值
        void setSize(int width, int height)：调整此组件的大小，使其宽度为width，高度为height，单位是像素
 */
public class JFrameDemo01 {
    public static void main(String[] args) {
        //JFrame()：构造一个最初不可见的新窗体
        JFrame jf = new JFrame();

        //void setSize(int width, int height)：调整此组件的大小，使其宽度为width，高度为height，单位是像素
        jf.setSize(400,300);

        //void setVisible(boolean b)：显示或隐藏此窗体具体取决于参数b的值
        jf.setVisible(true);
        //setDefaultCloseOperation(3);3表示窗口关闭时退出应用程序
        jf.setDefaultCloseOperation(3);
        //设置标题
        jf.setTitle("百度一下，你就知道");
        //窗体中间显示
        jf.setLocationRelativeTo(null);
        //窗体始终在其它窗体之上
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);//取消窗体的默认布局


    }


}
