import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] scores = new double[n];
        double score = 0.0;

        for(int i = 0; i < n; i++){
            scores[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++){
            score += scores[i];
        }

        score /= n;

        System.out.printf("%.1f\n",score);
        if(score >= 4.0){
            System.out.println("Perfect");
        }else if(score >= 3.0){
            System.out.println("Good");
        }else{
            System.out.println("Poor");
        }
    }
}