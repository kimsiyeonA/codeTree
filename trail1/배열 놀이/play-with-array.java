import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] nArr = new int [n];

        for(int i = 0; i < n; i++){
            nArr[i] = sc.nextInt();
        }

        // System.out.println(Arrays.toString(nArr));
        for(int i = 0; i < q; i++){
            int mainQ = sc.nextInt();
            // System.out.println(i + " : " + mainQ);

            if(mainQ == 1){
                int data = sc.nextInt();
                // System.out.println(i + " : " + data);
                System.out.println(nArr[data-1]);
                
            }else if(mainQ == 2){
                int data = sc.nextInt();
                int idx = -1;

                for(int j = 0; ; j++){
                    //System.out.println(j + " : " + nArr[j]);
                    if(j == n) break;
                    if(data == nArr[j]){
                        idx = j+1;
                        //System.out.println(j + " : " + idx);
                        break;
                    } 
                }

                if(idx == -1){
                    System.out.println(0);
                }else{
                    System.out.println(idx);
                }

            }else{
                int start = sc.nextInt();
                int end = sc.nextInt();

                for(int j = start-1; j <= end-1; j++){
                    System.out.print(nArr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}