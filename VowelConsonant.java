//Count vowels and consonants in a string IN JAVA
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String a = sc.nextLine();
        a = a.toLowerCase();

        int ConsonantCounter = 0;
        int start = 0;
        int end = a.length();
        int Vowelcounter = 0;

        while (start < end) {
            char ch = a.charAt(start);
            if (Character.isLetter(ch)) {
              if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    Vowelcounter++;
              } else {
                    ConsonantCounter++;

                }
            }
            start++;
        }
        sc.close();
        System.out.println("Vowels:" + Vowelcounter);
        System.out.println("Consonants:" + ConsonantCounter);

    }
}
