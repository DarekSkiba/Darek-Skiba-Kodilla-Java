package com.kodilla.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OddNumbersExterminator {

    public List<Integer> exterminate(ArrayList<Integer> numbers){
        List<Integer> result= new ArrayList<>();

        int temporaryValue = 0;
        for (int n=0; n < numbers.size(); n++){
            temporaryValue = numbers.get(n);
            //checking if an element is even or odd
            if (temporaryValue % 2 == 0){
             result.add(temporaryValue);
            }
        }
        return result;
    }

}
