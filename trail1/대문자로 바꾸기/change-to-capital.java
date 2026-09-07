import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr2d = new char[5][3];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                arr2d[i][j] = sc.next().charAt(0);
            }
        }

        // System.out.println((int)'A');
        // System.out.println((int)'a');
        // System.out.println((char)('a' - 32));

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                System.out.print((char)(arr2d[i][j] - 32) + " ");
            }
            System.out.println();
        }

    }
}