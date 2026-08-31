import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int midExam = sc.nextInt();
        int finalExeam = sc.nextInt();

        // if (midExam >= 90 && finalExeam >= 95){
        //     System.out.println(100000);
        // }
        // if (midExam >= 90 && (95 > finalExeam &&finalExeam >= 90)){
        //     System.out.println(50000);
        // }
        // if (midExam < 90 || (95 > finalExeam &&finalExeam > 90)){
        //     System.out.println(0);
        // }

        if (midExam < 90 || finalExeam < 90){
            System.out.println(0);
        } else if (finalExeam >= 95){
            System.out.println(100000);
        } else {
            System.out.println(50000);
        } 

    }
}