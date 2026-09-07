import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(str.length() % 2 == 0){
            for(int i = str.length() - 1; i >= 0; i-=2){
                System.out.print(str.charAt(i));
            }
        }else{
            for(int i = str.length() - 2; i >= 0; i-=2){
                System.out.print(str.charAt(i));
            }
        }
    }
}