package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify (String text, PoemDecorator decorate) {
            String result = decorate.decorate(text);
            System.out.println(result);

    }
}