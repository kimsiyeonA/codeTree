import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();
        char[] arr = s.toCharArray();

        for(int i = 0; i < q; i++){
            int mainQ = sc.nextInt();

            if(mainQ == 1){
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                char temp = arr[num1-1];
                arr[num1-1] = arr[num2-1];
                arr[num2-1] = temp;

                System.out.println(s = String.valueOf(arr));
            }else{ // 2일때
  
                char str1 = sc.next().charAt(0);
                char str2 = sc.next().charAt(0);

                for(int j = 0; j < arr.length; j++){
                    if(arr[j] == str1){
                        arr[j] = str2;
                    }
                }

                System.out.println(s = String.valueOf(arr));
            }
    
        }
    }
}