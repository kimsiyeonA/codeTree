import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Score[] scores = new Score[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            scores[i] = new Score(name, score1, score2, score3);
        }
        // Please write your code here.

        Arrays.sort(scores);

        for(int i = 0; i < n; i++){
            System.out.println(scores[i].name + " " + scores[i].score1 + " " + scores[i].score2 + " " + scores[i].score3);
        }
    }
}

class Score implements Comparable<Score>{
    String name;
    int score1, score2, score3;

    public Score(String name, int score1, int score2, int score3){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    @Override
    public int compareTo(Score score){
        return (this.score1 + this.score2 + this.score3) - (score.score1 + score.score2 + score.score3); 
    }


}