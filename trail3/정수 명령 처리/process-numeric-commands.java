import java.util.Scanner;
import java.util.Stack;
public class Main {

    public static int MAX_N = 10000;

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 개수

        while(n-- > 0){
            String c = sc.next();

            switch (c) {
                case "push":
                    stack.push(sc.nextInt());
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    int result = stack.empty() ? 1 : 0;
                    System.out.println(result);
                    break;
                case "top":
                    System.out.println(stack.peek());
                    break;
                default:
                    break;
            }
        }


    }
}