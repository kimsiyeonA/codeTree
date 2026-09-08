import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sArr = new String[200];
        int idx = 0, sum = 0;

        while(true){
            String str = sc.next();
            if(str.equals("0")) break;
            sArr[idx++] = str;
        }

        System.out.println(idx);
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] == null) break;
            if(i%2 == 0){
                System.out.println(sArr[i]);
            }
        }
    }
}