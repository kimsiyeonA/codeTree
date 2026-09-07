import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] cArr = new char[1000];
        int[] nArr = new int[1000];
        int cidx = 0;
      
        
        cArr[cidx] = s.charAt(0);
        nArr[cidx] = 1;
        for(int i = 1; i < s.length(); i++){
            if(cArr[cidx] == s.charAt(i)){
                nArr[cidx]++;
                continue;
            }else{
                cArr[++cidx] = s.charAt(i);
                nArr[cidx]++;
            }
        }

        String str = "";


        for(int i = 0; ;i++){
            if(nArr[i] == 0) break;
            str += cArr[i]+""+nArr[i];
        }

        System.out.println(str.length());
        System.out.println(str);
        // System.out.println(Arrays.toString(cArr));
        // System.out.println(Arrays.toString(nArr));
    }
}