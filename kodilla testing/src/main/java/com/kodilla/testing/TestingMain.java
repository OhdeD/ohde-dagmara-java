package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import java.sql.SQLOutput;

public class TestingMain {

    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(5.0,10.0);

        double resultAdd= calculator.addAtoB();
        double resultSubtract = calculator.subtractAfromB();

        if(resultAdd == 15.0){
            System.out.println("Method addAtoB works perfectly.");
        }else{
            System.out.println("During testing addAtoB something went wrong...");
        }

        if(resultSubtract == 5.0){
            System.out.println("Method subtractAfromB works perfectly.");
        }else{
            System.out.println("During testing subtractAformB something went wrong...");
        }
    }

}
