import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int odd = 0, even = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            if(i%2 == 0){
                odd += arr[i];
            }else{
                even += arr[i];
            }
        }

        System.out.print(odd > even ? odd-even : even-odd);
    }
}