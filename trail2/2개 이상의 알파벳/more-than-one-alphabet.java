import java.util.Scanner;
public class Main {
    public static int isIn(String A){
        int[] arr = new int [26];
        int cnt = 0;
        for(int i = 0; i < A.length(); i++){
            arr[(int)A.charAt(i) - 97]++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) cnt++;
        }

        return cnt;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        String result = isIn(A) >= 2 ? "Yes" : "No";
        System.out.println(result);
    }
}