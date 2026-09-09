import java.util.Scanner;
public class Main {

    public static boolean isEven(int n){
        boolean yn = false;
        if(n % 2 ==0){
            yn = true;
        }
        return yn;
    }

    public static boolean isMult5(int n){
        boolean yn = false;
        int sum = 0;
        //System.out.println(sum + " " + n);
        while( n > 0){
            sum += n%10;
            n /= 10;
            //System.out.println(sum + " " + n);
        }
        if(sum % 5 == 0){
            yn = true;
        }
        return yn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        if(isMult5(n) && isEven(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}