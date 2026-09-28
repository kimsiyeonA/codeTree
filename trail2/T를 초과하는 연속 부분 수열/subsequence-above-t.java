import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int ans = 0, cnt = 0;
        for(int i = 0; i < n; i++){
            if(i >= 1 && t < arr[i] && t < arr[i-1]) cnt++;
            else if (t < arr[i]) cnt = 1;
            else cnt = 0;
            //System.out.println(i + "...." + arr[i] + "......" + cnt);
            ans = Math.max(ans,cnt);
        }

        System.out.println(ans);
    }
}