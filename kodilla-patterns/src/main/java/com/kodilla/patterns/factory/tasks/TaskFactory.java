package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task makeTask(String task) {
        switch (task) {
            case SHOPPING:
                return new ShoppingTask("Food", "orange", 10.00);
            case PAINTING:
                return new PaintingTask("Kitchen", "yellow", "front wall");
            case DRIVING:
                return new DrivingTask("Pick-up Martin", "5th Av.", "Audi");
            default:
                return null;
        }
    }
}
