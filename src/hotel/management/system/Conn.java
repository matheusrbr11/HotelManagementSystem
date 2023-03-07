package hotel.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem?user=root&password=admin&useUnicode=true&characterEncoding=UTF-8");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
