import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to find its factorial");
        int a =sc.nextInt();

        int fact=1;

        if(a==0||a==1){
            System.out.println("factorial is 1");
        }else{
            for(int i=1;i<=a;i++){
                fact=fact*i;
            }
            System.out.println("the factorial of "+ a +" is "+ fact);
        }
  
    sc.close();
    }
}
