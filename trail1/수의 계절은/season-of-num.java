import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        if(2 >= m || m == 12){
            System.out.println("Winter");
        } else if(3 <= m && m <= 5){
            System.out.println("Spring");
        } else if (m <= 8){
            System.out.println("Summer");
        } else {
            System.out.println("Fall");
        } 

    }
}