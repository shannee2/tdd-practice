package org.example.fizz;

public class Fizz {
    public String checkDivisibleByThreeAndFive(int num) {
        if(num<=0){
            throw new IllegalArgumentException();
        }
        return String.valueOf(num);

    }
}
