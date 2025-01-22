package org.example.fizz;

public class Fizz {
    public String checkDivisibleByThreeAndFive(int num) {
        if(num<=0){
            throw new IllegalArgumentException();
        }
        if(num%3==0 && num%5==0 && num%7==0){
            return "FizzBuzzBang";
        }
        if(num%3==0 && num%5==0){
            return "FizzBuzz";
        }
        if(num%3==0 && num%7==0){
            return "FizzBang";
        }
        if(num%5==0 && num%7==0){
            return "BuzzBang";
        }
        if(num%3==0){
            return "Fizz";
        }
        if(num%5==0){
            return "Buzz";
        }
        if(num%7==0){
            return "Bang";
        }
        return String.valueOf(num);
    }
}
