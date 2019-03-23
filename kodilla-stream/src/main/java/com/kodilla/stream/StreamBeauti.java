package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;



public class StreamBeauti {
    public static void main(String[] args) {
       PoemBeautifier poemDecorator = new PoemBeautifier();

        System.out.println("Calculating expressions with lambdas");
        poemDecorator.beautify("abc", result -> result.toUpperCase());
        poemDecorator.beautify("abc", result -> result.toLowerCase();
        poemDecorator.beautify("abc", result -> result.replace("abc", "ale ale" )


    }
}