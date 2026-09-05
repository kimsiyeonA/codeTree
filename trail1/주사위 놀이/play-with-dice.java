import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] countArr = new int[7];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            countArr[arr[i]]++;
            // System.out.println(i + " - " + Arrays.toString(countArr));
        }

        for(int i = 1; i < 7; i++){
            System.out.println(i + " - " + countArr[i]);
        }
    }
}