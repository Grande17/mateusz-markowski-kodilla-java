package com.kodilla.stream.array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int[] test = new int[]{1,2,3,4,5,6,7,8,9,16,10,11,12,13,14,15};
        //When
        double test1 = ArrayOperations.getAverage(test);
        //Then
        assertEquals(8.5, test1);

    }
}
