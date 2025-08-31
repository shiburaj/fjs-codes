import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sn.nextInt();
        InnerTask2 check = new InnerTask2();
        check.find(num);
        
    }
}

class InnerTask2 {
    public void find(int n){
            if (n%2==0) {
                System.out.println(n+" is a even number");

            }
            else{
                System.out.println(n+" is a odd number");
            }
    }
}