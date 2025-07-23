// Reverse a number (e.g., 123 → 321)
// Code By :- Prof. Shiburaj

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int a = scanner.nextInt();
        int b;
        System.out.println("The reversed number is: ");
        while(a%10!=0){
            b = a%10;
            a = a/10;
            System.out.print(b);
        }



        scanner.close();
    }
}
