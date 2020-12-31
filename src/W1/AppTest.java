package W1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppTest {
    public static void main(String[] args) {
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            String databaseUrl="jdbc:mysql://localhost:3306/testconnection?characterEncoding=utf8";
            String user="root";
            String password="190720";
            connection = DriverManager
                    .getConnection(databaseUrl,user,password);
            System.out.println("SQL Connection to database established!");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console"  + e);
            return;
        }
    }
}
