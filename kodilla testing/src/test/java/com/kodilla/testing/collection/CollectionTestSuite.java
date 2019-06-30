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
        exterminator.exterminate(list);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        //When
        ArrayList <Integer> list2 = new ArrayList<>();
        //Then
        exterminator2.exterminate(list2);
    }
}