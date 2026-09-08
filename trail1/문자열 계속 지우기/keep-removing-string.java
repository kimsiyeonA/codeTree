import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();


        for(int i = 0; i < a.length() - b.length()+1; i++){
            int cnt = 0;
            //System.out.println(i);
            for(int j = 0; j < b.length(); j++){
                if(a.charAt(i+j) == b.charAt(j)){
                    //System.out.println(i + ": " + j +" a.charAt(i+j):"+ a.charAt(i+j)  + " b.charAt(j)" +b.charAt(j));
                    cnt++;
                }
                if(cnt == b.length()){
                    a =  a.substring(0,i) + a.substring(i + b.length()) ;
                    //System.out.println(i + ": " + j );
                    //System.out.println((j-b.length()+1)+ ": " + (j+1)  );
                    //System.out.println( a.substring(0,i) + ": " + a.substring(i+b.length())  );
                    //System.out.println(a);
                    i = -1;
                    break;
                }
            }
        }

        System.out.println(a);
    }
}