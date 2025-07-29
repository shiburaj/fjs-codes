public class Task17 {
  public static void main(String[] args) {
    int[] num ={2,3,2,4,5};
    int lnum = num[0];
    for (int i = 0; i < num.length; i++) {
        if(num[i]>lnum){
            lnum =num[i];
        }
    }
     System.out.println("Largest number in the arra is:" +lnum);
  }  
}
