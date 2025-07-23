// Check if a number is prime
// Code By :- Prof. Shiburaj

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int a = scanner.nextInt();
        boolean isPrime = true;
        for(int i=2; i<a; i++){
            if(a%i==0){
                isPrime = false;
                break;
            }

        }
        if(isPrime && a>1){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }

        scanner.close();
    }
}
