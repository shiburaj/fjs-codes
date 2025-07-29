package com.example;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String input = sc.nextLine();
        char[] c = input.toCharArray();
        int cons = 0, vow = 0;
        for(int i = 0; i < input.length(); i++){
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u'){    // vowel catcher
                vow++;
            }
            else if(c[i] == ' '){ // accounting for whitespaces
                continue;
            }
            else{
                cons++; 
            }
        }
        System.out.printf("Number of vowels in the string : %d%n", vow);
        System.out.printf("Number of consonants in the string : %d%n", cons);
        System.out.printf("Length of string : %d", input.length());
        sc.close();

    }
}
