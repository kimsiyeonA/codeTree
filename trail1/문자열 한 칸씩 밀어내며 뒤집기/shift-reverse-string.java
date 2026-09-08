import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int q = sc.nextInt();

        for(int i = 0; i < q; i++){
            int mainQ = sc.nextInt();

            if(mainQ == 1){
                str = str.substring(1) + str.substring(0,1);
                System.out.println(str);
            }else if(mainQ == 2){
                str = str.substring(str.length()-1,str.length()) + str.substring(0,str.length()-1);
                System.out.println(str);                
            }else{
                char[] strarr = str.toCharArray();
                char[] newarr = new char[str.length()];

                for(int j = 0; j < str.length(); j++){
                    newarr[j] = strarr[str.length()-j-1];
                }

                str = String.valueOf(newarr);
                System.out.println(str);
            }
        }
    }
}