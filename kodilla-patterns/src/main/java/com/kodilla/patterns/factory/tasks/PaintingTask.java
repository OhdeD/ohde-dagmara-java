package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final private String taskName;
    final private String colour;
    final private String whatToPaint;
    private boolean isExecuted = false;

    public PaintingTask(String taskName, String colour, String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
    }


    @Override
    public void executeTask() {
        System.out.println("Executing painting task");
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return isExecuted;
    }
}
