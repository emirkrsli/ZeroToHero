package db.tests;

import org.testng.annotations.Test;
import utilities.DatabaseUtility;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateCustomer {
    @Test

    public void Test01() throws SQLException {
        Connection con = DatabaseUtility.connectDatabase();
        Statement statement = con.createStatement();
        String query = "INSERT INTO tp_customer (id,first_name,last_name,email,middle_initial,phone_number,address,ssn) VALUES ('313313','Emirhan','Arici','bekoo@gmail.com','tr',05416342995,'13Streetnorth13','454-13-1213')";

        int rs = statement.executeUpdate(query);

        System.out.println(rs + " rows inserted");

    }
}
