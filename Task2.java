// Check if a number is even or odd
// Code By :- Prof. Shiburaj

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int a = scanner.nextInt();
        if(a%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        scanner.close();


    }
}
