import java.util.Scanner;
public class Main {
    public static int[] range = new int [100 + 1];

    public static void pointCheck(int start, int end){
        for(int i = start; i <= end; i++){
            range[i]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            pointCheck(start, end);
        }

        int max = 0;
        for(int i = 0; i < range.length; i++)
            if(max < range[i]) max = range[i];

        System.out.println(max);
        // Please write your code here.
    }
}