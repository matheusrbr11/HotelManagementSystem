package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class CustomerInfo extends JFrame implements ActionListener{

    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTable table;
    JButton back;

    CustomerInfo() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        l1 = new JLabel("Document Type");
        l1.setBounds(10, 10, 100, 20);
        add(l1);

        l2 = new JLabel("Number");
        l2.setBounds(160, 10, 100, 20);
        add(l2);

        l3 = new JLabel("Name");
        l3.setBounds(290, 10, 100, 20);
        add(l3);

        l4 = new JLabel("Gender");
        l4.setBounds(410, 10, 100, 20);
        add(l4);

        l5 = new JLabel("Country");
        l5.setBounds(540, 10, 100, 20);
        add(l5);

        l6 = new JLabel("Room Number");
        l6.setBounds(650, 10, 100, 20);
        add(l6);

        l7 = new JLabel("Checkin time");
        l7.setBounds(770, 10, 100, 20);
        add(l7);

        l8 = new JLabel("Deposit");
        l8.setBounds(900, 10, 100, 20);
        add(l8);

        table = new JTable();
        table.setBounds(0, 40, 1000, 400);
        add(table);

        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from customer");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(420, 500, 120, 30);
        add(back);


        setBounds(300, 200, 1000, 600);
        setVisible(true);
    }

    public static void main(String[] args) {

        new CustomerInfo();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Reception();
    }
}
