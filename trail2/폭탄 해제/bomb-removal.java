import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        Mission mission = new Mission(uCode, lColor, time);

        System.out.printf("code : %s \ncolor : %c \nsecond : %d", mission.code, mission.color, mission.time);
    }
}

class Mission{
    String code;
    char color;
    int time;

    public Mission(String code, char color, int time){
        this.code = code;
        this.color = color;
        this.time = time;
    }
}