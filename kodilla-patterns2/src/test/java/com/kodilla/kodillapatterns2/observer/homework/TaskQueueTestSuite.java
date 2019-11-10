package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testNotifyMentors() {
        //Given
        TaskQueue dagmaraOhde = new DagmaraOhde();
        TaskQueue adamNowak = new AdamNowak();
        TaskQueue jolaLojalna = new TaskQueue.JolaLojalna();

        TheMentor madryKtos = new TheMentor("Mądry Ktoś");
        TheMentor mentorMentor = new TheMentor("Mentor Mentor");
        TheMentor kodillaCzlowiek = new TheMentor("Kodilla Człowiek");

        dagmaraOhde.assignMentor(madryKtos);
        dagmaraOhde.assignMentor(mentorMentor);
        adamNowak.assignMentor(mentorMentor);
        jolaLojalna.assignMentor(mentorMentor);
        jolaLojalna.assignMentor(kodillaCzlowiek);
        //When
        dagmaraOhde.addTask("Task 1");
        dagmaraOhde.addTask("Task 2");
        adamNowak.addTask("Task 3");
        adamNowak.addTask("Task 4");
        jolaLojalna.addTask("Task 6");
        //Then
        assertEquals(2, madryKtos.getCounter());
        assertEquals(5, mentorMentor.getCounter());
        assertEquals(1, kodillaCzlowiek.getCounter());
    }
}