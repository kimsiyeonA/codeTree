import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = 0;
        int[] arr = new int[n];
        int[] numCount = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        for(int i = 0 ; i < n; i++){
            if(i != 0 && arr[i] != arr[i-1]){
                 idx++;
                 numCount[idx]++;
            }else numCount[idx]++;
            //System.out.println(Arrays.toString(numCount));
        }

        int max = 1;
        for(int i = 0; i < n; i++){
            if (max < numCount[i]) max = numCount[i];
        }

        System.out.println(max);
    }
}