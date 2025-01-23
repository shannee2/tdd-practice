package org.example.fizz;

public class Armstrong {
    public boolean isArmstrong(int num) {
        if(num<0){
            throw new IllegalArgumentException();
        }
        if(num<=9){
            return true;
        }
        return false;
    }
}
