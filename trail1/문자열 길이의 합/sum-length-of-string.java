import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        int cnt = 0, len = 0;

        for(int i = 0; i < n; i++ ){
            str[i] = sc.next();
            len += str[i].length();
        }

        for(int i = 0; i < str.length; i++){
            if(str[i].charAt(0) == 'a') cnt++;
        }

        System.out.println(len + " " + cnt);

    }
}