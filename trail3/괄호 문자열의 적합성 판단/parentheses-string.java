import java.util.Scanner;
import java.util.Stack;
public class Main {

    public static String str;
    public static Stack<Character> stack = new Stack<>();

    public static void close(char c){
        stack.push(c);
    }

    public static boolean open(){
        if(stack.isEmpty()) return false;
        if(stack.peek() != ')') return false;

        stack.pop();
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        boolean right = true;

        for(int i = str.length() - 1; i >= 0; i--){
            char c = str.charAt(i);
            
            if (c == ')'){
                close(c);
            }else{
                right = open();
                if (!right) break;
            }
        }

        if(right && stack.empty()) System.out.println("Yes");
        else System.out.println("No");
    }
}