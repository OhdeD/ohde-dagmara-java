package com.kodilla.spring.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToBeautify, PoemDecorator poemDecorator) {
        String beautifiedText = poemDecorator.decorate(textToBeautify);
        System.out.println(beautifiedText);
    }
}
