import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int change = 3;

        while(change <= n){
            System.out.print(change + " ");
            change = change + 3;
        }

    }
}