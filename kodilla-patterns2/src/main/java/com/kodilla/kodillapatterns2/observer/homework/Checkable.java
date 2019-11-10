package com.kodilla.kodillapatterns2.observer.homework;

public interface Checkable {
    void assignMentor(Mentor mentor);
    void deleteMentor(Mentor mentor);
    void notifyMentors();
}
