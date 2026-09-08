import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = Integer.toString(num);
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            sum += Integer.parseInt(""+str.charAt(i));
        }

        System.out.println(sum);
    }
}