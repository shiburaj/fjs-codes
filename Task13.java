//Leap year checker
//Code by - Hunain Shaikh

package main.java.com.example;

public class Task13 {
    public static void main(String[] args) {
        int n = 2016;
        boolean leap = false;
        if(n%4==0){
            leap = true;
        }
        else if(n%100 == 0){
            leap = false;
        }
        else if(n %400 == 0){
            leap = true;
        }
        if(leap){
            System.out.printf("%d is a leap year!", n);
        }
        else{
            System.out.printf("%d is not a leap year!", n);
        }
    }
}
