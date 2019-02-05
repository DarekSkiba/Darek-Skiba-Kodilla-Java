package com.kodilla.testing;

import java.util.ArrayList;



public class OddNumbersExterminator {



    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer oddNumber: numbers) {
            if(oddNumber % 2 ==0){
                evenNumbers.add(oddNumber);
            }
        }
        return evenNumbers;

    }



}
