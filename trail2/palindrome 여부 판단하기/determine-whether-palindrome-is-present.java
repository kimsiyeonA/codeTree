import java.util.Scanner;
public class Main {

    public static String palindrome(String value){
        char[] arr = new char [value.length()];
        for(int i = 0; i < value.length(); i++){
            arr[i] = value.charAt(value.length()-1-i);
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        String output = palindrome(input);
        //System.out.println(output);
        System.out.println(input.equals(output)? "Yes" : "No");
    }
}