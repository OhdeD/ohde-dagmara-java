package com.kodilla.jdbc;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "select U.FIRSTNAME, U.LASTNAME, count(*) as POSTS_ADDED\n" +
                "from USERS U join POSTS P on U.ID = P.USER_ID\n" +
                "group by U.LASTNAME\n" +
                "having POSTS_ADDED >1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);
        //Then
        int i = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getString("FIRSTNAME") +
                    " " + resultSet.getString("LASTNAME") + ": " +
                    resultSet.getInt("POSTS_ADDED"));
            i++;
        }
        resultSet.close();
        statement.close();
        Assert.assertEquals(3,i);

    }


}