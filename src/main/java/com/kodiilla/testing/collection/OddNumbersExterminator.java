package com.kodiilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> numbers){
       ArrayList<Integer> evenNumbers = new ArrayList();
       for(Integer number: numbers){
            if(number%2==0){
                evenNumbers.add(number);
            }
       }
        System.out.println("Size of evenNumbers list is: " + evenNumbers.size() + ": "+ evenNumbers);
    }
}
