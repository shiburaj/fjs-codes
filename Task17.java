

public class Task17 {
    public static void main(String[] args) {
        int[] arr = {67, 2, 3, 405, 5, 6, 7};
        int big = arr[0], n = arr.length;
        for(int i = 0; i < n; i++){
            if(big < arr[i]){
                big = arr[i];
            }
            else continue;
        }
        System.out.printf("Largest number in array is %d", big);
    }
}

