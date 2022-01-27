package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
       DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException{
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
        assertEquals(5, counter);

    }
    @Test
    void testSelectUsersAndPosts() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery ="SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS TASKS_NUMBER\n" +
                "FROM USERS U  JOIN ISSUES I on U.ID = I.USER_ID_ASSIGNEDTO\n" +
                "GROUP BY I.USER_ID_ASSIGNEDTO\n" +
                "HAVING COUNT(*) >= 2\n" +
                "ORDER BY U.LASTNAME;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter =0;
        while(rs.next()){
            System.out.println(rs.getString("FIRSTNAME") +", "+
                    rs.getString("LASTNAME")+", "+
                    rs.getInt("TASKS_NUMBER"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5,counter);
    }
}