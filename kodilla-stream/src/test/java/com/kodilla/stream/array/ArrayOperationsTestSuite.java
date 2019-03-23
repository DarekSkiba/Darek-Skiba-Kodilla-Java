package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverageForEmptyArray() {
        //Given
        int numbers[] = new int[5];

        //When
        boolean expectedAverageExists = Double.isNaN(ArrayOperations.getAverage(numbers));

        //Then
        Assert.assertTrue(expectedAverageExists);
    }
}
