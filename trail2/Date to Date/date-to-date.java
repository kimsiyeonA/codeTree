import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int runday = 1;
        int[] ofDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0}; 
        while(true){
            if(m1 == m2 && d1 == d2) {
                break;
            }

            if(ofDays[m1] < d1){
                //runday++;
                m1++;
                d1 = 1;
            }else{
                runday++;
                d1++;
            }
            //System.out.println(m1 + " ... " + d1 + " " +runday);
        }

        System.out.println(runday);
    }
}