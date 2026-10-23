import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList();
        // Please write your code here.
        while(n-->0){
            String c = sc.next();

            switch (c) {
                case "push":
                    queue.add(sc.nextInt());
                    break;
                case "pop":
                    System.out.println(queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    int result = queue.isEmpty() ? 1 : 0;
                    System.out.println(result);
                    break;
                case "front":
                    System.out.println(queue.peek());
                    break;    
                default:
                    break;
            }
        }
    }
}