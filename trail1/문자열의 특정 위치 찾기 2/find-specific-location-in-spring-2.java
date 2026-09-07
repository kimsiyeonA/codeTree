import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] str = new String[] {"apple", "banana", "grape", "blueberry", "orange"};
        char c = sc.next().charAt(0);
        int cnt = 0;

        for(int i = 0; i < str.length; i++){
            if(str[i].charAt(2) == c|| str[i].charAt(3) == c){
                System.out.println(str[i]);
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}