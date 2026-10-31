import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int n = A.length();

        int count = 0;
        for(int i = 1; i < n - 3; i++){

            for(int j = i + 1; j < n - 1; j++ ){
                boolean start = A.charAt(i-1) == '(' &&  A.charAt(i)  == '(';
                boolean end = A.charAt(j) == ')' &&  A.charAt(j+1)  == ')';
                if(start && end){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}