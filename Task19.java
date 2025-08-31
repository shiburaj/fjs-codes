//Digit counter
//Written by Hunain Shaikh 241P043

package main.java.com.example;

public class Task19 {
    public static void main(String[] args) {
        int n = 1151234213, i = 0;
        while( n != 0){
            n /= 10;
            i++;
        }
        System.out.println("Number of digits - " + i);
    }
}
