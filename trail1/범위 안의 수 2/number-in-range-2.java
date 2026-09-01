import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int sum = 0;
       int cnt = 0;

       for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            if(0 <= num && num <= 200){ 
                sum += num;
                cnt++;
            }   
       }
       
       System.out.printf("%d %.1f",sum,sum/(double)cnt);
    }
}