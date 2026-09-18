import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.

        Code code = new Code(sCode, mPoint, time);
        System.out.println("secret code : " + code.code);
        System.out.println("meeting point : " + code.point);
        System.out.println("time : " + code.time);
    }
}

class Code {
    String code;
    char point;
    int time;

    public Code(String code, char point, int time){
        this.code = code;
        this.point = point;
        this.time = time;
    }
}