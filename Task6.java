// Calculate factorial of a number

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int a = scanner.nextInt();

        int factorial = 1;
        
        for(int i=1; i<=a; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + a + " is: " + factorial);


        scanner.close();
    }
}
