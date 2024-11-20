package connectdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    private static final String URL = "jdbc:postgresql://localhost:5432/coursemanagersystem";
    private static final String USER = "test";
    private static final String PASSWORD = "test123";

    private static Connection connection;

    public static Connection getConnectionDB() {
        try {
            return (connection==null) ? DriverManager.getConnection(URL, USER, PASSWORD) : connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
