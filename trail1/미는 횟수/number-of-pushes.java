import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        int cnt = 0;

        for(int i = 0; i < str1.length(); i++){
            str1 = str1.substring(str1.length()-1,str1.length()) + str1.substring(0,str1.length()-1);
            cnt++;
            if(str1.equals(str2)) break;
        }

        if(cnt == str1.length()){
            System.out.println(-1);
        }else{
            System.out.println(cnt);
        }

    }
}