package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {

    @Test
    public void testUpdateVipLevels() throws SQLException{
        //Given
        DbManager dbManager =DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement =  dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()){
            howMany = rs.getInt("How_many");
        }
        assertEquals(0, howMany);
    }

    @Test
    public  void testUpdateBestsellers() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String query = "UPDATE BOOKS SET BESTSELLER = FALSE";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(query);
        //When
        String callQuery = "CALL UpdateBestsellers()";
        statement.execute(callQuery);
        //Then
        int no = 0;
        String count = "SELECT COUNT(*) FROM BOOKS WHERE BESTSELLER = FALSE";
        ResultSet notBestsellers = statement.executeQuery(count);
        while (notBestsellers.next()){
            no++;
        }
        assertEquals(1,no);
    }
}
