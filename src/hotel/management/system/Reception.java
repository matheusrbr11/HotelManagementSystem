package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener {

    JLabel image;
    JButton newCustomer, rooms, department, allEmployee, customers, managerInfo, checkout, update, roomStatus, pickup, searchRoom, logout;
    Reception() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10, 30, 200, 30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.addActionListener(this);
        add(newCustomer);

        rooms = new JButton("Rooms");
        rooms.setBounds(10, 70, 200, 30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add(rooms);

        department = new JButton("Department");
        department.setBounds(10, 110, 200, 30);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.WHITE);
        department.addActionListener(this);
        add(department);

        allEmployee = new JButton("All Employees");
        allEmployee.setBounds(10, 150, 200, 30);
        allEmployee.setBackground(Color.BLACK);
        allEmployee.setForeground(Color.WHITE);
        allEmployee.addActionListener(this);
        add(allEmployee);

        customers = new JButton("Customers Info");
        customers.setBounds(10, 190, 200, 30);
        customers.setBackground(Color.BLACK);
        customers.setForeground(Color.WHITE);
        customers.addActionListener(this);
        add(customers);

        managerInfo = new JButton("Manager Info");
        managerInfo.setBounds(10, 230, 200, 30);
        managerInfo.setBackground(Color.BLACK);
        managerInfo.setForeground(Color.WHITE);
        managerInfo.addActionListener(this);
        add(managerInfo);

        checkout = new JButton("Checkout");
        checkout.setBounds(10, 270, 200, 30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        checkout.addActionListener(this);
        add(checkout);

        update = new JButton("Update Status");
        update.setBounds(10, 310, 200, 30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);

        roomStatus = new JButton("Update Room Status");
        roomStatus.setBounds(10, 350, 200, 30);
        roomStatus.setBackground(Color.BLACK);
        roomStatus.setForeground(Color.WHITE);
        roomStatus.addActionListener(this);
        add(roomStatus);

        pickup = new JButton("Pickup Service");
        pickup.setBounds(10, 390, 200, 30);
        pickup.setBackground(Color.BLACK);
        pickup.setForeground(Color.WHITE);
        pickup.addActionListener(this);
        add(pickup);

        searchRoom = new JButton("Search Room");
        searchRoom.setBounds(10, 430, 200, 30);
        searchRoom.setBackground(Color.BLACK);
        searchRoom.setForeground(Color.WHITE);
        searchRoom.addActionListener(this);
        add(searchRoom);

        logout = new JButton("Logout");
        logout.setBounds(10, 470, 200, 30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        image = new JLabel(i1);
        image.setBounds(250, 30, 500, 470);
        add(image);

        setBounds(350, 200, 800, 570);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Reception();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == newCustomer) {
            new AddCustomer();
            setVisible(false);
        } else if (ae.getSource() == rooms) {
            new Room();
            setVisible(false);
        } else if (ae.getSource() == department) {
            new Department();
            setVisible(false);
        } else if (ae.getSource() == allEmployee) {
            new EmployeeInfo();
            setVisible(false);
        } else if (ae.getSource() == managerInfo) {
            new ManagerInfo();
            setVisible(false);
        } else if (ae.getSource() == customers) {
            new CustomerInfo();
            setVisible(false);
        } else if (ae.getSource() == searchRoom) {
            new SearchRoom();
            setVisible(false);
        } else if (ae.getSource() == update) {
            new UpdateCheck();
            setVisible(false);
        } else if (ae.getSource() == roomStatus) {
            new UpdateRoom();
            setVisible(false);
        } else if (ae.getSource() == pickup) {
            new Pickup();
            setVisible(false);
        } else if (ae.getSource() == checkout) {
            new Checkout();
            setVisible(false);
        } else if (ae.getSource() == logout) {
            setVisible(false);
            System.exit(0);
        }
    }
}
