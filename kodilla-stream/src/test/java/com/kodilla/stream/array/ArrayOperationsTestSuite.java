package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(3, result, 0.0001);
    }

}