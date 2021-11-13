package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    OddNumbersExterminator exterminator = new OddNumbersExterminator();
    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test case: end");
    }

    @Test
    @DisplayName("Odd numbers exterminator while empty list")
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> list1 = new ArrayList<>();
        //When
        List<Integer> list1ext = exterminator.exterminate(list1);
        System.out.println("Odd Number Exterminator - Empty List test ");
        //Then
        Assertions.assertEquals(list1, list1ext);
    }

    @Test
    @DisplayName("Odd numbers exterminator while list has values")
    void testOddNumbersExterminatorNromalList(){
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        for(int i =1; i<100; i++){
            normalList.add(i);
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int n=1; n<100; n++) {
            if (n % 2 == 0) {
                resultList.add(n);
            }
        }

        //When
        List<Integer> exterminetedList = exterminator.exterminate(normalList);
        System.out.println("Odd numbers exterminator - normal list test");
        //Then
        Assertions.assertEquals(exterminetedList, exterminetedList);
    }





}
