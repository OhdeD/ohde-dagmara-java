package com.kodilla.exception.test;

public class EsceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2, 1);
        }catch (Exception e){
            System.out.println("It can't work. Change the numbers." + e);
        }finally {
            System.out.println("bye bye");
        }

    }
}
