/**
 * Create by clb
 */
package com.terry.jpetstore.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//这是一个屏幕居中的自定义窗口
public class MyFrame extends JFrame {

    //获取当前屏幕宽度
    private double screenWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    //获取当前屏幕高度
    private double screenHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    public MyFrame(String title, int width, int height) {
        super(title);
        //设置窗口大小
        setSize(width,height);
        //计算窗口位于屏幕中心的坐标
        int x = (int) (screenWidth - width) / 2;
        int y = (int) (screenHeight -height) / 2;
        //设置窗口位于屏幕中心
        setLocation(x,y);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
