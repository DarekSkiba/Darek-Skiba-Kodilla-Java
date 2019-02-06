package com.kodilla.testing;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {



    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //Given
    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
    List<Integer> numbers = new ArrayList<>();

        //When
    List<Integer> resultList = oddNumbersExterminator.exterminate(numbers);

        //Then
    Assert.assertEquals(0, resultList.size());
    }


    @Test
    public void testOddNumbersExterminatorNormalList(){

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);

        //When
        List<Integer> expNumbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(8);
        List<Integer> resultList = oddNumbersExterminator.exterminate(numbers);


        //Then
        Assert.assertEquals(expNumbers, resultList);
    }


}