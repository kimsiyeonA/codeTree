import java.util.Scanner;
public class Main {

    public static int[] sArr;
    public static int max(int n){
        if(n == 0) return sArr[n] ;
        
        int num = max(n-1);
        if(num > sArr[n]){
            return num;
        }
       
        return sArr[n];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sArr = arr;

        // Please write your code here.
        System.out.println(max(n-1));
    }
}