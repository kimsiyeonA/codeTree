import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        Game game1 = new Game();
        Game game2 = new Game(id, level);

        System.out.println("user " + game1.id + " lv " + game1.level);
        System.out.println("user " + game2.id + " lv " + game2.level);
    }
}

class Game{
    String id;
    int level;

    public Game() {
        this.id = "codetree";
        this.level = 10;
    }

    public Game(String id, int level){
        this.id = id;
        this.level = level;
    }

}