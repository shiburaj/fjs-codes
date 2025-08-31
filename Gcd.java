
//Find the GCD and LCM of two numbers
import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        int a = sc.nextInt();
        System.out.println("enter b number:");
        int b = sc.nextInt();

        int num1 = a;
        int num2 = b;

        while (b > 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        int gcd = a;
        int lcm = (num1 * num2) / gcd;

        System.out.println("GCD=" + gcd);
        System.out.println("LCM=" + lcm);

        sc.close();
    }

}
