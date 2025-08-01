package main.java.com.example;

//Task 10 - Bubble sort
//Written by - Hunain Shaikh 241P043

public class Task10 {
    public static void main(String[] args) {
        int[] arr = { 1, 10, 3, 6, 14, 7, 9 };
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}


