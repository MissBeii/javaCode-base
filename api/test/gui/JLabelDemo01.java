package com.api.test.gui;

import javax.swing.*;

/*
    构造方法
        JLabel(String text)：使用指定的文本创建 JLabel实例
        JLabel(Icon image)：使用指定的图像创建 JLabel实例
            ImageIcon(String filename)：从指定的文件创建ImageIcon
            文件路径：绝对路径，相对路径
    成员方法
        void setBounds(int x, int y, int width, int height)：设置位置和大小
 */
public class JLabelDemo01 {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        jf.setTitle("显示文本和图像");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //JLabel(String text)：使用指定的文本创建 JLabel实例
        JLabel jLabel = new JLabel("好好学习");//显示文本
        jLabel.setBounds(0,0,100,20);

        //JLabel(Icon image)：使用指定的图像创建 JLabel实例
        //ImageIcon(String filename)：从指定的文件创建ImageIcon
        //D:\Users\IdeaProjects\javase_code\api\images\mn.png
//        ImageIcon imageIcon = new ImageIcon("D:\\IdeaProjects\\javase_code\\itheima-api-gui\\images\\mn.png");
//        JLabel jLabel2 = new JLabel(imageIcon);
//        JLabel jLabel2 = new JLabel(new ImageIcon("D:\\Users\\IdeaProjects\\javase_code\\api\\images\\mn.png"));
        JLabel jLabel2 = new JLabel(new ImageIcon("api\\images\\mn.png"));
        jLabel2.setBounds(50,50,100,143);

        jf.add(jLabel);
        jf.add(jLabel2);

        //设置窗体可见
        jf.setVisible(true);
    }
}
