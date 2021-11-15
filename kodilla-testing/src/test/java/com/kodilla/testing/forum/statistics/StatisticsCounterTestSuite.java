package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;



public class StatisticsCounterTestSuite {
    static int i=1;
    @AfterAll
    public static void afretAll(){
        System.out.println("All tests are done!");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("I'm starting test nr: "+ i++);
    }




    private List<String> generateList(int size){
        List<String> testList = new ArrayList<>();
        for(int i=1; i<=size; i++){
            testList.add("Test"+i);
        }
        return testList;
    }

    @Test
    void testPostsStatisticsWith0(){
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statistics);
        //When
        int quantity = calculate.getPostsQuantity();
        //Then
        assertEquals(0, quantity);
    }
    @Test
    void testPostStatisticsWith1000(){
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statistics);
        //When
        int quantity = calculate.getPostsQuantity();
        //Then
        assertEquals(1000,quantity);
        assertEquals(0,calculate.getAvgCommentPerPost());
    }
    @Test
    void testCommentsStatisticsWith0(){
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(0);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statistics);
        //When
        int quantity = calculate.getCommentsQuantity();
        //Then
        assertEquals(0,quantity);

    }
    @Test
    void testMoreCommentsThanPosts(){
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(10);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statistics);
        //When
        int commentsQ = calculate.getCommentsQuantity();
        int postsQ = calculate.getPostsQuantity();
        //Then
        assertEquals(100,commentsQ);
        assertEquals(10,postsQ);

        assertEquals(10,calculate.getAvgCommentPerPost());
    }
    @Test
    void testMorePostsThanComments(){
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statistics);
        //When
        int commentsQ = calculate.getCommentsQuantity();
        int postsQ = calculate.getPostsQuantity();
        //Then
        assertEquals(10,commentsQ);
        assertEquals(100,postsQ);
    }
    @Test
    void testUsersQuantity0(){
        //Given
        List<String> names = generateList(0);
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(names);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statistics);
        //When
        int usersQ = calculate.getUsersQuantity();
        //Then
        assertEquals(0,usersQ);
    }
    @Test
    void testUsersQuantity100(){
        //Given
        List<String> names = generateList(100);
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(names);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);
        CalculateAdvStatistics calculate = new CalculateAdvStatistics(statistics);
        //When
        int usersQ = calculate.getUsersQuantity();
        int postsQ = calculate.getPostsQuantity();
        int commentsQ = calculate.getCommentsQuantity();
        //Then
        assertEquals(100,usersQ);
        assertEquals(0, postsQ);
        assertEquals(0,commentsQ);

        assertEquals(0, calculate.getAvgPostPerUser());
        assertEquals(0,calculate.getAvgCommentPerUser());



    }



}
