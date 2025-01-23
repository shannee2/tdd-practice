package org.example.fizz;

public class Armstrong {
    public boolean isArmstrong(int num) {
        if(num<0){
            throw new IllegalArgumentException("Negative numbers are not armstrong numbers");
        }
        if(num<=9){
            return true;
        }
        int temp = num, sum= 0, digits=0;

        while(temp>0){
            temp = temp/10;
            digits++;
        }
        temp = num;

        while(temp>0){
            sum+= (int) Math.pow(temp%10, digits);
            temp = temp/10;
        }
        return sum == num;
    }
}
