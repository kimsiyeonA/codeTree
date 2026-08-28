import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String phoneNumber = sc.next();
        String[] phoneNumberArr = phoneNumber.split("-");
        
        System.out.println(phoneNumberArr[0] + "-" + phoneNumberArr[2] + "-" + phoneNumberArr[1]);
    }
}