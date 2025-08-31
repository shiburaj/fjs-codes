package com.example;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("GCD of %d and %d is : %d%n", a, b, findGCD(a, b));
        System.out.printf("LCM of %d and %d is : %d", a, b, findLCM(a, b));
        sc.close();
    }

    static int findGCD(int a, int b){
        while( b != 0 ){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int findLCM(int a, int b){
        if(a == 0 || b == 0){
            return 0;
        }
        return Math.abs(a*b)/findGCD(a, b);
    }
}
