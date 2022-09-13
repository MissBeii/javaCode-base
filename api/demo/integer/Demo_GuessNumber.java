package com.api.demo.integer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/*gui-integer
    1:系统产生一个1-100之间的随机数
    2:猜的内容不能为空
    3:每次根据猜的数字给出相应的提示
*/
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

        //随机生成一个1-100之间数
        Random r = new Random();
        int i = r.nextInt(100)+1;

        //绑定事件
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取文本框中数据
                String jNumStr = jTextField.getText().trim();
                //判断不为空
                if(jNumStr.equals("")){
                    JOptionPane.showMessageDialog(jf,"输入不能为空，请重新输入");
                    jTextField.setText("");
                    return;
                }
                //提示大小信息
                int jNumInt = Integer.parseInt(jNumStr);
                if(jNumInt>i){
                    JOptionPane.showMessageDialog(jf,"您输入的值"+jNumInt+"大了，请重新输入");
                    jTextField.setText("");
                }else if(jNumInt<i){
                    JOptionPane.showMessageDialog(jf, "您输入的值"+jNumInt+"小了，请重新输入");
                    jTextField.setText("");
                }else{
                    JOptionPane.showMessageDialog(jf, "您猜对了");
                    return;
                }
            }
        });

        jf.setVisible(true);

    }
}

