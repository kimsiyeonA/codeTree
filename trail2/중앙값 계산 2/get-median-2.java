import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Please write your code here.
       
        for(int i = 1; i <= arr.length; i++){
            if(i % 2 != 0){
                int[] newarr = Arrays.copyOf(arr,i);
                Arrays.sort(newarr, 0, i);
                System.out.print(newarr[(i/2)]+ " ") ;
                //System.out.println(i + "...." + (i/2) + "...." +Arrays.toString(newarr));
            }
        }
        
    }
}