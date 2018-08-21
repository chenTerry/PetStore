/**
 * Create by clb
 *
 *
 * */
package com.terry.jpetstore.ui;


import javax.swing.*;
import java.awt.*;

//用户登陆窗口
public class LoginFrame extends MyFrame {

    private JTextField txtAccountId;
    private JPasswordField txtPassword;

    public LoginFrame(){
        super("用户登陆",400,200);
        //设置布局管理为绝对布局
        getContentPane().setLayout(null);

        JLabel label1 = new JLabel();
        label1.setHorizontalAlignment(SwingConstants.RIGHT);
        label1.setBounds(51,33,83,30);
        label1.setText("账号：");
        label1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        getContentPane().add(label1);

        txtAccountId = new JTextField(10);
        txtAccountId.setText("j2ee");
        txtAccountId.setBounds(158, 33, 157, 30);
        txtAccountId.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        getContentPane().add(txtAccountId);

        JLabel label2 = new JLabel();
        label2.setHorizontalAlignment(SwingConstants.RIGHT);
        label2.setBounds(51,85,83,30);
        label2.setText("密码：");
        label2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        getContentPane().add(label2);

        txtPassword = new JPasswordField(10);
        txtPassword.setText("j2ee");
        txtPassword.setBounds(158, 85, 157, 30);
        txtPassword.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        getContentPane().add(txtPassword);

        JButton btnOk = new JButton();
        btnOk.setText("确定");
        btnOk.setFont(new Font("微软雅黑",Font.PLAIN, 15));
        btnOk.setBounds(61, 140, 100, 30);
        getContentPane().add(btnOk);

        JButton btnCancel = new JButton();
        btnCancel.setText("取消");
        btnCancel.setFont(new Font("微软雅黑",Font.PLAIN, 15));
        btnCancel.setBounds(225, 140, 100, 30);
        getContentPane().add(btnCancel);

        btnOk.addActionListener(e ->{
            txtAccountId.setText("push button OK");
        });

        btnCancel.addActionListener( e -> {
            System.exit(0);
        });
    }
}
