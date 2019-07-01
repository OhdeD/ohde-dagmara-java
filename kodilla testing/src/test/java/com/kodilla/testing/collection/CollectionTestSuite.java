package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Testing code");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Testing code ended succesfully.");
    }

    @Before
    public void before(){
        System.out.println("Starting test.");
    }
    @After
    public void after(){
        System.out.println("Test edned succesfully.");
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<20){
            list.add(i);
            i++;
        }
        //Then
        ArrayList<Integer> result = exterminator.exterminate(list);
        System.out.println("When add only even numbers: " + result);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        //When
        ArrayList <Integer> list2 = new ArrayList<>();
        //Then
        ArrayList<Integer> result2 = exterminator2.exterminate(list2);
        System.out.println("when laist is empty: " + result2);
    }
}