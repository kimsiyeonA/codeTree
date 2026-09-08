import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String order = sc.next();

        for(int i = 0; i < order.length(); i++){
            char c = order.charAt(i);

            if(c == 'L'){
                a = a.substring(1) + a.substring(0,1);
            }else{
                a = a.substring(a.length()-1, a.length()) + a.substring(0,a.length()-1);
            }
        }
        
        System.out.println(a);

    }
}