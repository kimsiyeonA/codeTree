import java.util.Scanner;
public class Main {

    // 윤년?
    public static boolean yunYear(int y){
        if(y % 4 == 0 && y % 100 == 0 &&  y % 400 == 0) return true;
        else if(y % 4 == 0 && y % 100 != 0) return true;
        return false;
    }

    // 있는 날짜인지 확인
    public static boolean haveDay(boolean yunYear, int m, int y){
        //System.out.println(yunYear);
        if(yunYear){ // 윤년일때
            if(m == 2 && 1 <= y && y <= 29) return true;
            else if(m != 2 && m <= 7){
                if(m % 2 != 0 && 1 <= y && y <= 31)return true;
                else if(m % 2 == 0 && 1 <= y && y <= 30)return true;
            }
            else if(m >= 8){
                if(m % 2 != 0 && 1 <= y && y <= 30)return true;
                else if(m % 2 == 0 && 1 <= y && y <= 31)return true;
            }
        }else{
            if(m == 2 && 1 <= y && y <= 28) return true;
            else if(m != 2 && m <= 7){
                if(m % 2 != 0 && 1 <= y && y <= 31)return true;
                else if(m % 2 == 0 && 1 <= y && y <= 30)return true;
            }
            else if(m >= 8){
                if(m % 2 != 0 && 1 <= y && y <= 30)return true;
                else if(m % 2 == 0 && 1 <= y && y <= 31)return true;
            }
        }
        return false;
    }

    // 월별 날짜 판별
    public static String season (int m){
        String result = "";
        if(3 <= m && m <= 5) return "Spring";
        else if(6 <= m && m <= 8) return "Summer";
        else if(9 <= m && m <= 11) return "Fall";
        else return "Winter";

    }

    public static String season(int y, int m, int d){
        boolean yunYear = yunYear(y);
        boolean haveDay = haveDay(yunYear,m,d);

        if (haveDay) return season(m); 
        else return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        // 해당 계절 츌력
        System.out.println(season(y,m,d));

    }
}