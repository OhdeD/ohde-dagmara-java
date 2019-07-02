package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int counter = 0;

    @Before
    public void beforeTests() {
        counter++;
        System.out.println("running test #" + counter + ".");
    }

    @After
    public void afterTests() {
        System.out.println("test #" + counter + " was run.");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting tests.");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("All test are done.");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle someCircle = new Circle("circle", 5.5);
        //When
        shapeCollector.addFigure(someCircle);
        //Then
        Assert.assertEquals(1, shapeCollector.getFiguresSize());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle someCircle = new Circle("circle", 5.5);
        shapeCollector.addFigure(someCircle);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(someCircle, result);
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle someCircle = new Circle("circle", 5.5);
        shapeCollector.addFigure(someCircle);
        shapeCollector.showFigures();
        //When
        shapeCollector.removeFigure(0);
        shapeCollector.showFigures();
        //Then
        Assert.assertEquals(0,shapeCollector.getFiguresSize());
    }



}
