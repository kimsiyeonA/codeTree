import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static String a;
    public static char[] arr;

    // 2진수 -> 10진수
    public static int findNum(){
        int num = 0; // 최종 값 
        int pow = 1; // 1부터 시작해서 자리수가 변경될때마다 곱해짐
        for(int i = arr.length - 1; i >= 0; i--){ // 끝에서 부터 숫자 나옴
            if(arr[i] == '1'){ // 숫자가 1 일경우 곱하지는 pow값을 더함
                num += pow;
            }
            pow *= 2; // 자리가 바뀔때 마다 2를 곱해 으로 만듬 제곱...
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1010 과 같은 2진법 문자 받기
        a = sc.next();
        // 받은 문자를 char array로 변경 -> 0이면 1로 바꾸어 조작해서 최종값을 낼 예정
        arr = a.toCharArray();

        // 101 111 일 경우 -> 다른값 -> max로 나온 값 
        // 111 111 일 경우 -> 같은값 -> 0 초기 값 a 의 원래 값을 찾아놔야함
        // a의 변경전 처음 값 
        int aOrigin = findNum();

        int max = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '0'){
                arr[i] = '1';

                max = Math.max(max, findNum());

                arr[i] = '0';
            }
            
        }

         
       // System.out.println(max + " .. " + aOrigin);
       // System.out.println(Arrays.toString(arr));
        
        int result = max == 0 ? aOrigin-1 : max;
        System.out.println(result);



    }
}