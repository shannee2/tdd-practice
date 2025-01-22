package org.example.fizz;

public class Fizz {
    public String checkDivisibleByThreeAndFive(int num) {
        if(num<=0){
            throw new IllegalArgumentException();
        }
        if(num%3==0){
            return "Fizz";
        }
        return String.valueOf(num);

    }
}
