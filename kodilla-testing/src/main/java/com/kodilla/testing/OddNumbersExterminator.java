package com.kodilla.testing;

import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator {



    public ArrayList<Integer> exterminate(List<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer oddNumber: numbers) {
            if(oddNumber % 2 ==0){
                evenNumbers.add(oddNumber);
            }
        }
        return evenNumbers;

    }



}
