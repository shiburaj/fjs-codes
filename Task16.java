//Smallest value finder
//Written by Hunain Shaikh 241P043

package main.java.com.example;

public class Task16 {
    public static void main(String[] args) {
        int[] arr = {67, 2, 3, 4, 5, 6, 7};
        int small = arr[0], n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] < small){
                small = arr[i];
            }
            else continue;
        }
        System.out.printf("Smallest number in array is %d", small);
    }
}
