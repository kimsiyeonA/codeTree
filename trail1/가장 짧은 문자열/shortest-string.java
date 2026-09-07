import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next(), s2 = sc.next(), s3 = sc.next();
        int s1len = s1.length(), s2len = s2.length(), s3len = s3.length();

        int min = s1len < s2len ? (s1len < s3len ? s1len : s3len) : (s2len < s3len ? s2len : s3len); 
        int max = s1len > s2len ? (s1len > s3len ? s1len : s3len) : (s2len > s3len ? s2len : s3len);

        System.out.println(max - min);
    }
}