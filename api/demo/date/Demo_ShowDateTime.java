package com.api.demo.date;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*gui-date
    手机日期和时间显示
 */
public class Demo_ShowDateTime {
    public static void main(String[] args) {
        //创建窗口
        JFrame jf = new JFrame();
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setAlwaysOnTop(true);
        jf.setTitle("显示时间和日期");

        //时间
        Date d = new Date();
        //格式-日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String dateSdf = sdf.format(d);
        //格式-时间
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
        String timeSdf = sdf1.format(d);

        //时间日期，四个文本标签
        JLabel dateLabel = new JLabel("日期");
        dateLabel.setBounds(50,50,100,20);
        jf.add(dateLabel);

        JLabel date = new JLabel(dateSdf);
        date.setBounds(50,80,200,20);
        jf.add(date);

        JLabel timeLabel = new JLabel("时间");
        timeLabel.setBounds(50,150,100,20);
        jf.add(timeLabel);

        JLabel time = new JLabel(timeSdf);
        time.setBounds(50,180,200,20);
        jf.add(time);


        jf.setVisible(true);

    }
}


