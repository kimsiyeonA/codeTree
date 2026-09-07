import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[] arr = new int[10];
        int[] min500 = new int[10];
        int[] max500 = new int[10];
        int minidx = 0;
        int maxidx = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            if(arr[i] < 500) min500[minidx++] = arr[i];
            else max500[maxidx++] = arr[i];
        }

        int max = min500[0];

        for(int i = 0; i < minidx; i++){
            if(max < min500[i]) max = min500[i];
        }

        int min = max500[0];

        for(int i = 0; i < maxidx; i++){
            if(min > max500[i]) min = max500[i];
        }

        System.out.println(max + " " + min);
    }
}