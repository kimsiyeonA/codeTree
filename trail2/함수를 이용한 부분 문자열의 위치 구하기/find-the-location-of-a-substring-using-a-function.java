import java.util.Scanner;
public class Main {

    public static String gText = "";
    public static String gPattern = "";

    public static int isContine(){
        return gText.indexOf(gPattern);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
        gText = text;
        gPattern = pattern;
        System.out.println(isContine());

    }
}