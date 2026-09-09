import java.util.Scanner;
public class Main {

    public static boolean haveDay(int m, int d){
        if (m <= 7){
            if(checkH1Day(m, d)) return true;
        } else if( 8 <= m && m <= 12) {
            if(checkH2Day(m, d)) return true;
        }
        return false;
    }

    public static boolean checkH1Day(int m, int d){
        if(m==2){
            if (1 <= d && d <= 28){
                return true;
            }
        }else{
            if(m % 2 != 0 && (1 <= d && d <= 31)){
                return true;
            }else if(m % 2 == 0 && (1 <= d && d <= 30)){
                return true;
            }
        }
        return false;
    }
    
    
    public static boolean checkH2Day(int m, int d){
        if(m % 2 != 0 && (1 <= d && d <= 30)){
            return true;
        }else if(m % 2 == 0 && (1 <= d && d <= 31)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if(haveDay(m, d))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}