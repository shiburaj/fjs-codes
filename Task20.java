//Armstrong
//Code by - Hunain Shaikh

package com.example;

public class Task20 {
    public static void main(String[] args) {
        int n = 153, res = 0, rem;
        int temp = n;
        while( temp != 0 ){
            rem = temp % 10;
            res += rem*rem*rem;
            temp /= 10;
        }
        if(n == res){
            System.out.println(n + " is an Armstrong number");
        }
        else System.out.println(n + " is not an Armstrong number");
    }
}
