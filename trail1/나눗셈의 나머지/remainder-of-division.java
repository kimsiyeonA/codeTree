import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        while(true){
            arr[a % b]++;
            a = a / b;
            if(a <= 1) break;
        }
        //System.out.println(Arrays.toString(arr));

        for(int i = 0; i < 10; i++){
            sum = sum + (arr[i] * arr[i]);
            //System.out.println(i + " : " +sum);
        }

        System.out.println(sum);
    }
}