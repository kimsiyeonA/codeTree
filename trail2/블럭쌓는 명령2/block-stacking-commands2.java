import java.util.*;
public class Main {
    public static int N;
    public static int[] range;

    public static void addArea(int a, int b){
        for(int i = a; i <= b; i++){
            range[i] += 1;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        range = new int [N + 1];

        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            addArea(A,B);
        }

        int max = 0;
        for(int i = 0; i < N + 1; i++)
            if(max < range[i]) max = range[i];
        // Please write your code here.

        System.out.println(max);
    }
}