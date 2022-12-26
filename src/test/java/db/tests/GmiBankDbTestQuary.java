package db.tests;

import org.testng.annotations.Test;

import java.sql.*;

public class GmiBankDbTestQuary {


    private final static String url = "jdbc:postgresql://157.230.48.97:5432/gmibank_db";

    private final static String user = "techprodb_user";


    private final static String password = "Techpro_@126";

    @Test
    public void GmiBankDbTestQuary() throws SQLException {
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        String query = "Select * From tp_Customer Where id = 9595";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            {
                System.out.println(resultSet.getString("id") + "  "
                        + resultSet.getString("first_name") + "  "
                        +resultSet.getString("last_name")+ "  "
                        + resultSet.getString("email")+ " "+
                        resultSet.getString("middle_initial")+ "  " +
                        resultSet.getString("phone_number"));
            }
        }

    }
}
