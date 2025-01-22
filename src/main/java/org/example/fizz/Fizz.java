package org.example.fizz;

public class Fizz {
    public String checkDivisibleByThreeAndFive(int num) {
        if(num<=0){
            throw new IllegalArgumentException();
        }
        if(num%3==0 && num%5==0){
            return "FizzBuzz";
        }
        if(num%3==0){
            return "Fizz";
        }
        if(num%5==0){
            return "Buzz";
        }
        return String.valueOf(num);

    }
}
