package db.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DatabaseUtility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VerifyCustomerData {


    @Test
    public void Test01() throws SQLException {


        Connection con = DatabaseUtility.connectDatabase();
        Statement statement = con.createStatement();
        String query = "Select * from tp_customer where id = 313313";
        ResultSet rs = statement.executeQuery(query);


        while (rs.next()) {
            System.out.println(rs.getString("id") + " " + rs.getString("first_name") + " " + rs.getString("mobile_phone_number"));

            Assert.assertNotNull(rs.getString("id"));
            //Assert.assertNotNull(rs.getString("mobile_phone_number"));


        }

        //Assertion


    }
}


