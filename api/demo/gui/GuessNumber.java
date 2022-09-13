package com.api.demo.gui;

import javax.swing.*;

/*
    猜数字
 */
public class GuessNumber {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        jf.setTitle("猜数字");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //提示信息
        JLabel messageLable = new JLabel("系统产生了一个1-100之间的数据，请猜一猜");
        messageLable.setBounds(70,50,350,20);
        jf.add(messageLable);

        //输入要猜的数字
        JTextField numberField = new JTextField();
        numberField.setBounds(120,100,150,20);
        jf.add(numberField);

        //猜数字的按钮
        JButton guessButton = new JButton("我猜");
        guessButton.setBounds(150,150,100,20);
        jf.add(guessButton);

        jf.setVisible(true);
    }
}
