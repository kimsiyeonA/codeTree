import java.util.*;
public class Main {

    public static int max(int[] arr, int n){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.

        int[] sumNums = new int[n];
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            sumNums[i] = nums[i] + nums[(2*n)-1-i];
        }

        System.out.println(max(sumNums,n));
    }
}