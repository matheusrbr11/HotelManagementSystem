package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class Pickup extends JFrame implements ActionListener{

    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTable table;
    JButton back, submit;
    JCheckBox available;

    Pickup() {



        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("Pickup Service");
        text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        text.setBounds(400,30,200,30);
        add(text);

        available = new JCheckBox("Only display available");
        available.setBounds(390, 100, 150, 25);
        available.setBackground(Color.WHITE);
        add(available);

        l1 = new JLabel("Name");
        l1.setBounds(40, 160, 100, 20);
        add(l1);

        l2 = new JLabel("Age");
        l2.setBounds(200, 160, 100, 20);
        add(l2);

        l3 = new JLabel("Gender");
        l3.setBounds(330, 160, 100, 20);
        add(l3);

        l4 = new JLabel("Company");
        l4.setBounds(470, 160, 100, 20);
        add(l4);

        l5 = new JLabel("Brand");
        l5.setBounds(620, 160, 100, 20);
        add(l5);

        l6 = new JLabel("Availability");
        l6.setBounds(750, 160, 100, 20);
        add(l6);

        l7 = new JLabel("Location");
        l7.setBounds(890, 160, 100, 20);
        add(l7);

        table = new JTable();
        table.setBounds(0, 200, 1000, 300);
        add(table);

        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from driver");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(300, 520, 120, 30);
        add(submit);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(500, 520, 120, 30);
        add(back);


        setBounds(300, 200, 1000, 600);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Pickup();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            try {
                String query1 = "select * from driver";
                String query2 = "select * from driver where available = 'Available'";

                Conn conn = new Conn();
                ResultSet rs;
                if (available.isSelected()) {
                    rs = conn.s.executeQuery(query2);
                } else {
                    rs = conn.s.executeQuery(query1);
                }
                table.setModel(DbUtils.resultSetToTableModel(rs));


            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            setVisible(false);
            new Reception();
        }
    }
}
