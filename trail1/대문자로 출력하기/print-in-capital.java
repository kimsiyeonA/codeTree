import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();
        int idx = 0;
        char[] newArr = new char [arr.length];

        for(int i = 0; i < arr.length; i++){
            if('A' <= arr[i] && arr[i] <= 'Z'){
                newArr[idx++] = arr[i];
            }else if('a' <= arr[i] && arr[i] <= 'z'){
                char upper = (char)((int)arr[i] - 32);
                newArr[idx++] = upper;
            }
        }

        for(int i = 0; i < idx; i++){
            System.out.print(newArr[i]);
        }
    }
}