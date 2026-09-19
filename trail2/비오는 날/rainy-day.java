import java.util.*;
public class Main {
    public static int findDay(int n, String[] dates, Weather[] weathers){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(dates[i].equals(weathers[j].date) && "Rain".equals(weathers[j].weather)){
                    // System.out.println(dates[i]+ ".... " + weathers[j].date);
                    return j;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] weathers = new Weather[n];
        String[] dates = new String[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            dates[i] = date;
            weathers[i] = new Weather(date, day, weather);
            // Please write your code here.
        }

        Arrays.sort(dates);
        // System.out.println(Arrays.toString(dates));

        int idx = findDay(n, dates, weathers);
        System.out.println(weathers[idx].date + " " + weathers[idx].day + " " + weathers[idx].weather);

    }
}
class Weather{
    String date;
    String day;
    String weather;

    public Weather(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}