//Check if a number is even or odd
import java.util.Scanner;

public class WatchPro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your first number:");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
     
    }

}
