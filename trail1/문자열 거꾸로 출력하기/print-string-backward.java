import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String str = sc.next();
            if(str.equals("END")) break;
            for(int i = 0; i < str.length(); i++){
                System.out.print(str.charAt(str.length()-i-1));
            }
            System.out.println();
        }
    }
}