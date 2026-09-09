import java.util.Scanner;
public class Main {

    public static boolean isSameValue(int a, int b){
        if(a == b) return true;
        return false;
    }

    public static boolean isSameCnt(int a, int b){
        if(a == b) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.

        int cnt = 0;

        for(int i = 0; i <= a.length - b.length; i++){
            for(int j = 0; j < b.length; j++){
                if(isSameValue(a[i+j],b[j])) cnt++;
            } 
            if(isSameCnt(cnt , b.length)) break;
            cnt = 0;
        }

        if(isSameCnt(cnt , b.length)) System.out.println("Yes");
        else System.out.println("No");

        
    }
}