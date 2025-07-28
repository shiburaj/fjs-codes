//Task-7 - Fibonacci series
//Written by - Hunain Shaikh

package com.example;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f0 = 0, f1 = 1, f2;
        int n;
        System.out.print("Enter integer : ");
        n = sc.nextInt();
        System.out.printf("%d %d", f0, f1);
        for(int i = 2; i < n; i++){
            f2 = f0 + f1;
            System.out.printf(" %d", f2);
            f0 = f1;
            f1 = f2;
        }
        sc.close();
    }
}
