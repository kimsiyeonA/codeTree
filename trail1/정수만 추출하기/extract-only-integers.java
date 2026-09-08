import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(); 
        String str2 = sc.next(); 

        System.out.print(change(str1)+change(str2));
    }

    public static int change(String value){
        String str = "";
    
        for(int i = 0; i < value.length(); i++){
            if('0'<= value.charAt(i) && value.charAt(i) <= '9'){
                str += value.charAt(i);
            }else{
                break;
            }
        }

        return Integer.parseInt(str);
        
    }
}