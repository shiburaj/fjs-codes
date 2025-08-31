//Print multiplication table of a number
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of which you want multiplication table:");
        int a = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multi = a * i;
            System.out.println(a + "*" + i + "=" + multi + " ");
        }

        sc.close();

    }

}
