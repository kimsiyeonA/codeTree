import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean have = false;

        for(int i = 2; i < n ; i++){
            if(n % i == 0) have = true;
        }

        System.out.println(have == true ? "C" : "N");
    }
}