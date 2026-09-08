import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int num = str.indexOf("e");

        if(num == str.length()-1){
            str = str.substring(0, str.length()-2);
        }else{
            str = str.substring(0, num) + str.substring(num+1);
        }

        System.out.println(str);
    }
}