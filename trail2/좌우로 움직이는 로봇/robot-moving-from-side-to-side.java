import java.util.Scanner;

public class Main {
    public static int T = 2000000;

    public static int[] aArr = new int [T+1];
    public static int[] bArr = new int [T+1];
    public static int aIdx = 1, bIdx = 1;

    public static void moveA(char d, int t){
        if(d == 'R'){
            for(int i = 0; i < t; i++){
                aArr[aIdx] = aArr[aIdx - 1] + 1;
                aIdx++;
            }
        }else{
            for(int i = 0; i < t; i++){
                aArr[aIdx] = aArr[aIdx - 1] - 1;
                aIdx++;
            }
        }
    }

    public static void moveB(char d, int t){
        if(d == 'R'){
            for(int i = 0; i < t; i++){
                bArr[bIdx] = bArr[bIdx - 1] + 1;
                bIdx++;
            }
        }else{
            for(int i = 0; i < t; i++){
                bArr[bIdx] = bArr[bIdx - 1] - 1;
                bIdx++;
            }
        }
    }

    public static void moreMove(int[] arr, int s, int l){

        //System.out.println("들어왔나?");
        for(int i = s ; i < l; i++){
            //System.out.println("i " + i);
            arr[i] = arr[i-1];
        }
    }

    public static void debug(int n){
        for(int i = 0; i <= n; i++){
            System.out.print(aArr[i] + " ");
        }
         System.out.println();
        for(int i = 0; i <= n; i++){
            System.out.print(bArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            moveA(d,t);
        }
        
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            moveB(d,t);
        }
        
        // Please write your code here.

        int maxIdx = Math.max(aIdx,bIdx);
        if(aIdx > bIdx) moreMove(bArr, bIdx, aIdx);
        else if (aIdx < bIdx) moreMove(aArr, aIdx, bIdx);


        // System.out.println(aIdx);
        // System.out.println(bIdx);
        int cnt = 0;
        for(int i = 1; i <= T; i++){
            if(i >= maxIdx && (aArr[i] == 0 && aArr[i] == 0 )) break;
            if(aArr[i-1] != bArr[i-1] && aArr[i] == bArr[i] )cnt++;
        }

        //debug(50);
        System.out.println(cnt);

    }
}