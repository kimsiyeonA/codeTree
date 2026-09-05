import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anum = sc.nextInt();
        int bnum = sc.nextInt();

        int[] aArr = new int[anum];
        int[] bArr = new int[bnum];

        for(int i = 0; i < anum; i++){
            aArr[i] = sc.nextInt();
        }

        for(int i = 0; i < bnum; i++){
            bArr[i] = sc.nextInt();
        }

        boolean have = false;

        for(int i = 0; i < anum; i++){
            int cnt = 0;

            if(aArr[i] == bArr[0]){
                cnt++;
                for(int j = 1; j < bnum; j++){
                    if (i+j == anum) break;
                    if (aArr[i+j] == bArr[j]) cnt++;
                }
            }

            if(cnt == bnum){
                have = true;
                System.out.println("Yes");
                break;
            }
        }
        if(have == false){
            System.out.println("No");
        }
        
    }
}