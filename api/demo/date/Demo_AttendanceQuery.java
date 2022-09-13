package com.api.demo.date;

import com.api.demo.gui.DateChooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*gui-date
    考勤查询-点击后返回两个标准时间，方便以后操作
 */
public class Demo_AttendanceQuery {
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

        //创建两个文本域--改进此处
        //1创建日期选择控件2进行绑定
        com.api.demo.gui.DateChooser startDateChooser = com.api.demo.gui.DateChooser.getInstance("yyyy/MM/dd");
        com.api.demo.gui.DateChooser endDateChooser = DateChooser.getInstance("yyyy/MM/dd");

        JTextField startTextField1 = new JTextField("开始时间");
        startTextField1.setBounds(50,100,100,20);
        startDateChooser.register(startTextField1);
        jf.add(startTextField1);

        JTextField endTextField2 = new JTextField();
        endTextField2.setBounds(250,100,100,20);
        endDateChooser.register(endTextField2);
        jf.add(endTextField2);

        //创建按钮
        JButton jButton = new JButton("确定");
        jButton.setBounds(250,180,60,20);
        jf.add(jButton);

        //绑定
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取文本框内容时间字符串
                String startTimeStr = startTextField1.getText();
                String endTimeStr = endTextField2.getText();
                //格式匹配
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                try {
                    Date startT = sdf.parse(startTimeStr);
                    Date endT = sdf.parse(endTimeStr);
                    JOptionPane.showMessageDialog(jf,startT+"\n"+endT);

                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
            }
        });


        jf.setVisible(true);
    }
}
