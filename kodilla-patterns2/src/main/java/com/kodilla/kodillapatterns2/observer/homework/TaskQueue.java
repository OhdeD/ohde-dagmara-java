package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Checkable {
    private List<String> tasks;
    private String student;
    private List<Mentor> mentors;

    public TaskQueue(String student) {
        this.student = student;
        this.tasks = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyMentors();
    }

    @Override
    public void notifyMentors() {
        for (Mentor theMentor : mentors) {
            theMentor.observe(this);

        }
    }

    @Override
    public void assignMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void deleteMentor(Mentor mentor) {
        mentors.remove(mentor);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudent() {
        return student;
    }

    public static class JolaLojalna extends TaskQueue {
        public JolaLojalna() {
            super("Jola Lojalna");
        }
    }
}
