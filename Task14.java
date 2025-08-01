//Sum of all digits in a number
//Cody by - Hunain Shaikh 241P043

package main.java.com.example;

public class Task14 {
    public static void main(String[] args) {
        int n = 1234, res = 0;
        while( n % 10 != 0 ){
            res += n%10;
            n = n/10;
        }
        System.out.println(res);
    }
}
