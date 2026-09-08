import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.print(count(str,"ee") + " " + count(str,"eb"));
    }

    
    public static int count(String str, String value){
        
        int cnt = 0;

        for(int i = 0; i < str.length() - 1 ; i++){
            if(str.charAt(i)== value.charAt(0) && str.charAt(i+1)== value.charAt(1) ){
                cnt++;
            }
        }
        return cnt;

    }
}
