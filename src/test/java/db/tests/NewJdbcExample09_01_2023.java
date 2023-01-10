package db.tests;

import org.testng.annotations.Test;
import java.sql.*;



public class NewJdbcExample09_01_2023 {


    private final static  String  url ="jdbc:postgresql://157.230.48.97:5432/gmibank_db";

    private final static String user = "techprodb_user";

    private final static String password = "Techpro_@126";

// tp account tablosundan id si 122624 olan degeri cektim
    @Test
    public void NewJdbcExample() throws SQLException {
    Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        String query = "Select *From tp_account Where id = 122624";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            {
                System.out.println(resultSet.getString("id") + " "
                        + resultSet.getString("description") + " "
                        + resultSet.getString("balance") + " "
                        + resultSet.getString("account_type") + " "
                        + resultSet.getString("account_status_type") + " "
                        + resultSet.getString("create_date")+ " "
                        + resultSet.getString("closed_date"));
            }
        }
    }


    // DataBaseye tablo olusturdum icinde bulunan degerler id,first_name, last_name , Age,  i created table  with ,id first name last name m age values in dataBase.
    @Test
    public void NewTableCreate() throws SQLException {

        Connection con = DriverManager.getConnection(url,user,password);
        Statement statementt = con.createStatement();
        String sqltable = "Create Table example"+
                "(id INTEGER not NULL, "+
                "First_name VARCHAR(255), "+
                "last_name VARCHAR(255), "+
                "Age INTEGER)" ;
        statementt.execute(sqltable);
        System.out.println("created table");

    }
// olusturdugum example adli tabloyu icindeki verilerle birlikte drop table yontemi ile sildim .
    @Test
    public void DeleteTable() throws SQLException {
        Connection connec = DriverManager.getConnection(url,user,password);
        Statement stat = connec.createStatement();
        String deleteTable = "DROP TABLE example ";
        stat.executeUpdate(deleteTable);
        System.out.println("tablo silindi");

    }

}
