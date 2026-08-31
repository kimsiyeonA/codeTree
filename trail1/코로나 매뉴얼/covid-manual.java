import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char aYN = sc.next().charAt(0);
        int aTemper = sc.nextInt();
        char bYN = sc.next().charAt(0);
        int bTemper = sc.nextInt();
        char cYN = sc.next().charAt(0);
        int cTemper = sc.nextInt();

        int count = 0;
        if (aYN == 'Y' && aTemper >= 37) count ++;
        if (bYN == 'Y' && bTemper >= 37) count ++;
        if (cYN == 'Y' && cTemper >= 37) count ++;
        
        if(count >= 2){
            System.out.println("E");
        }else{
            System.out.println("N");
        }
    }
}