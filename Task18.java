//Avg of n numbers
//Code by - Hunain Shaikh

package com.example;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer limit : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        double res = 0;
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        for(int i = 0; i < n; i++){
            res += arr[i];
        }
        res /= n;
        System.out.printf("The average of the first %d numbers is %.2f", n, res);
        sc.close();
    }
}
