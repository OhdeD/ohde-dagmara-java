package com.kodilla.exception.test;

import java.util.stream.DoubleStream;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b != 0) {
            return a / b;
        } else {
            try {
                int c = (int)a;
                int d=(int)b;
                return c/d;
            }catch(ArithmeticException e){
            System.out.println("Something went wrong: " + e);
        }finally{
            System.out.println("You can't divide by \"0\".");
            return 0;
        }
    }
}    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println(result);
    }
}