import java.util.Scanner;
public class Main {
    public static final int OFFSET = 100;
    public static final int[] range = new int [OFFSET * 2 + 1];

    public static void pointCheck (int x1, int x2){
        for(int i = x1; i < x2; i++){
            range[i]++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

            pointCheck(x1[i]+OFFSET, x2[i]+OFFSET);
        }

        int max = 0;
        for(int i = 0; i < range.length;i++){
            if(max < range[i]) max = range[i];
        }

        System.out.println(max);
        // Please write your code here.
    }
}