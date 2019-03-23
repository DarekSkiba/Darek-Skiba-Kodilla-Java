package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverageForEmptyArray() {
        //Given
        int numbers[] = new int[5];
        numbers[0]=25;
        numbers[1]=20;
        numbers[2]=15;
        numbers[3]=10;
        numbers[4]=5;

        //When
        double expectedAverageExists = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(15, expectedAverageExists, 0.01);
    }
}
