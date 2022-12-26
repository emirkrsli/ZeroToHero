package db.tests;


import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GmiBankDbTestCreateCustomer {
    private final static String url = "jdbc:postgresql://157.230.48.97:5432/gmibank_db";

    private final static String user = "techprodb_user";


    private final static String password = "Techpro_@126";
    @Test
    public void test() throws SQLException {
        Connection con = DriverManager.getConnection(url,user,password);

        Statement statement =con.createStatement();
        String query = "Insert into tp_customer (id,first_name,last_name,email,middle_initial,phone_number,address,ssn) Values(9595,'Berkay','aster','bekoo@gmail.com','us',05416342995,'13Streetnorth13','414-13-1313')";
        int CreateCustomer = statement.executeUpdate(query);
        System.out.println(CreateCustomer + " New Customer Created!...");

    }



}