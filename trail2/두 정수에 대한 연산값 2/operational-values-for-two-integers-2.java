import java.util.Scanner;

class IntWrapper{
    int value;

    public IntWrapper(int value){
        this.value = value;
    }

}

public class Main {
    public static void change(IntWrapper a, IntWrapper b){
        if (a.value > b.value){
            b.value += 10;
            a.value *= 2;
        }else{
            a.value += 10;
            b.value *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());
        // Please write your code here.

        change(a,b);
        System.out.println(a.value + " " + b.value);
    }
}