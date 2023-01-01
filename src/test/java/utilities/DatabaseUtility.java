package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtility {

    private final static String url = ConfigReader.getProperty("database_url");
    private final static String user=ConfigReader.getProperty("database_user");
    private final static String password = ConfigReader.getProperty("database_password");

    public static Connection connectDatabase() throws SQLException {
        Connection connection = DriverManager.getConnection(url,user,password);
        return connection;
    }







}
