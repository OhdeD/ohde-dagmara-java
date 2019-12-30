package com.kodilla.others.generics;

public class DagmaraListExample {
    public static void main(String[] args) {
        DagmaraList<Integer> myList = new DagmaraList<>();
        myList.addElement(10);
        myList.addElement(100);
        myList.addElement(5);
        myList.addElement(150);
        System.out.println(myList.getElement(2));
        myList.removeElement(5);
        System.out.println(myList.getElement(2));

    }


}
