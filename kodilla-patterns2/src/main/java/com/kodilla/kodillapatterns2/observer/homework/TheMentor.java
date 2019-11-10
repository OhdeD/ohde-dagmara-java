package com.kodilla.kodillapatterns2.observer.homework;

public class TheMentor implements Mentor {
    private String name;
    private int counter;

    public TheMentor(String name) {
        this.name = name;
    }

    @Override
    public void observe(TaskQueue taskQueue) {
        System.out.println("Notification sent to: " + name + ".\nThere are " + taskQueue.getTasks().size() + " " + taskQueue.getStudent() + "'s tasks to check.");
        counter++;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }
}
