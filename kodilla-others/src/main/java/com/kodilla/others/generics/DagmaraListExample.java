package com.kodilla.others.generics;

public class DagmaraListExample {
    public static void main(String[] args) {


        DagmaraList<Integer> integerDagmaraList = new DagmaraList<>();
        DagmaraList<String> stringDagmaraList = new DagmaraList<>();
        DagmaraList<Double> doubleDagmaraList = new DagmaraList<>();

        integerDagmaraList.add(6);
        integerDagmaraList.add(7);
        System.out.println("DagmaraList elements of type Integer: " + integerDagmaraList);
        System.out.println("Last element on Integer's type list: " +integerDagmaraList.get(integerDagmaraList.size()-1) +"\nremoving last element...");
        integerDagmaraList.remove(integerDagmaraList.size()-1);
        System.out.println("Last element on Integer's type list: " +integerDagmaraList.get(integerDagmaraList.size()-1));

        stringDagmaraList.add("Dagmara");
        stringDagmaraList.add("Ohde");
        System.out.println("\nDagmaraLists elements of type String: " + stringDagmaraList);
        System.out.println("Removing element: " + stringDagmaraList.get(0));
        stringDagmaraList.remove(stringDagmaraList.get(0));
        System.out.println("DagmaraList elements of type String: " + stringDagmaraList);

        doubleDagmaraList.add(10.15);
        System.out.println("\nDagmaraList elements of type Double: " + doubleDagmaraList);
        doubleDagmaraList.remove(0);
        System.out.println("After removing first element, doubleDagmaraList include: " + doubleDagmaraList);


    }

}
