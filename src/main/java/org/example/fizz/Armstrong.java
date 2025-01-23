package org.example.fizz;

public class Armstrong {
    public boolean isArmstrong(int num) {
        if(num<0){
            throw new IllegalArgumentException();
        }
        if(num<=9){
            return true;
        }
        int temp = num, sum= 0;
        while(temp>0){
            sum+= (int) Math.pow(temp%10, 3);
            temp = temp/10;
        }
        return sum == num;
    }
}
