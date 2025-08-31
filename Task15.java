//Temperature converter
//Written by Hunain Shaikh 241P043

package main.java.com.example;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature format ( C / F ) : ");
        String type = sc.next();
        if(type.equals("C") || type.equals("c")){
            System.err.print("Enter Temperature ( in Celsius ) : ");
            double c = sc.nextInt();
            double res = (9.0/5*c)+32;
            System.out.printf("Temperature in Farenheit : %.2f F", res);
        }
        else if(type.equals("F") || type.equals("f")){
            System.err.print("Enter Temperature ( in Farenheit ) : ");
            double f = sc.nextInt();
            double res = (f-32)*5.0/9;
            System.out.printf("Temperature in Celsius : %.2f C", res);
        }
        else{
            System.out.println("Invalid temperature!");
        }
        sc.close();
    }   
}
