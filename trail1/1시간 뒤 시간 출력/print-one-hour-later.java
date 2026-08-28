import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] strArray = s.split(":");
        System.out.println((Integer.parseInt(strArray[0])+1) + ":" + strArray[1]);
        
    }
}