package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public void removeFigure(int n){
        figures.remove(n);
    }

    public Shape getFigure(int n){
        return figures.get(n);
    }

    public void showFigures(){
        System.out.println(figures);
    }

    public int getFiguresSize(){
        return figures.size();
    }

}
