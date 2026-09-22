import java.util.Scanner;
public class Main {
    public static final int[] mDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String[] days = {"", "Mon", "Tue", "Wed", "Thu", "Fri" ,"Sat", "Sun"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int result = -1;

        if(m1 > m2 || (m1 == m2 && d1 > d2)){
            result = minus( m1,  d1,  m2,  d2);
        }else{
            result = plus( m1,  d1,  m2,  d2);
        }


        System.out.println(days[result]);
    }

    public static int plus (int m1, int d1, int m2, int d2){
        //System.out.println("plus in");
        int idx = 1;
        while(true){
            if(m1 == m2 && d1 == d2) break;
            
            d1++;

            if(d1 > mDays[m1]){
                m1++;
                d1 = 1;
                
            }

            idx++;
            if(idx > 7){
               idx = 1; 
            }
        }
        return idx;
    }

    public static int minus (int m1, int d1, int m2, int d2){
        int idx = 1;
        while(true){
            if(m1 == m2 && d1 == d2) break;
            
            d1--;

            if(d1 == 0){
                m1--;
                d1 = mDays[m1];
            }

            idx--;
            if(idx < 1){
               idx = 7; 
            }
        }
        return idx;
    }
}