import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();

        while(true){
            if(str.length() == 1) break;
            
            int num = sc.nextInt();

            if(num >= str.length()) {
                str = str.substring(0,str.length()-1);
            }else {
                str = str.substring(0,num) + str.substring(num+1);
            }

            System.out.println(str);
        }
    }
}