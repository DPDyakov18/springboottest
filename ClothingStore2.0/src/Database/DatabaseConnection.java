package Database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DatabaseConnection {
    private static String url = "jdbc:sqlserver://DESKTOP-SL049\\SQLEXPRESS;databaseName=ClothingStoreDB;encrypt=false;trustServerCertificate=true";
    private static String user = "sa";
    private static String pass = "123";
    static Connection conn;

    public static Connection open() {
        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close() throws SQLException {
        conn.close();
    }
}