package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    String text = "abc";

    public void beautify (PoemDecorator decorate) {
            return new PoemDecorator(decorate + text + decorate);

    }
}