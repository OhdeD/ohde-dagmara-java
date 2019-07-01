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
        System.out.println("Testing code ended.");
    }

    @Before
    public void before(){
        System.out.println("Starting test.");
    }
    @After
    public void after(){
        System.out.println("Test edned.");
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
        Assert.assertNotEquals(list,result);
        Assert.assertEquals(10, result.size());
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        //When
        ArrayList <Integer> list2 = new ArrayList<>();
        //Then
        ArrayList<Integer> result2 = exterminator2.exterminate(list2);
        Assert.assertEquals(0,result2.size());
    }
}