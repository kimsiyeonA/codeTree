import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] currArr = new int[n];
        int curr = n;
        int idx = 0;

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();    
        }

        while(curr != 0){
            int max = 0;
            for(int i = 0; i < curr; i++){
                if(max < arr[i]){
                    max = arr[i];
                }
                //System.out.println("max i:" + i + ", " +max);
            }

            for(int i = 0; i < curr; i++){
                if (max == arr[i]){
                    currArr[idx++] = (i+1);
                    curr = i;
                    // System.out.println("currArr idx:" + idx + ", " );
                    // System.out.println("currArr i:" +curr);
                    // System.out.println(Arrays.toString(currArr));
                    break;
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(currArr[i] == 0) break;
            System.out.print(currArr[i]+ " ");
        }

        
    }
}