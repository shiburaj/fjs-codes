import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int n1 = sn.nextInt();
        int n2 = sn.nextInt();
        int n3 = sn.nextInt();
        LargestNumber num = new LargestNumber();
        num.Find(n1,n2,n3);

    }
}
class LargestNumber{
    public void Find(int n1,int n2, int n3){
        if (n1>n2) {
            if (n1>n3) {
                System.out.println("Largest number is "+n1);
            } else {
                System.out.println("Largest number is "+n3);
            }
        } else {
            if (n2>n3) {
                System.out.println("Largest number is "+n2);
            } else {
                System.out.println("Largest number is "+n3);
            }
        }
    }
}