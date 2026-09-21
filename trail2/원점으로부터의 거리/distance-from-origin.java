import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] points = new int[n][2];
        Distance[] distances = new Distance[n];
        int idx = 1;
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();

            distances[i] = new Distance(points[i][0],points[i][1], idx++);
        }
        // Please write your code here.

        Arrays.sort(distances);

        for(int i = 0; i < n; i++){
            System.out.println(distances[i].idx);
        }
    }
}

class Distance implements Comparable<Distance> {
    int x, y, idx;
    
    public Distance(int x, int y, int idx){
        this.x = x;
        this.y = y;
        this.idx = idx;
    }

    @Override
    public int compareTo(Distance distance){
        int aX = 0 - this.x < 0 ? (0 - this.x) * -1 : (0 - this.x); 
        int aY = 0 - this.y < 0 ? (0 - this.y) * -1 : (0 - this.y); 
        int bX = 0 - distance.x < 0 ? (0 - distance.x) * -1 : (0 - distance.x); 
        int bY = 0 - distance.y < 0 ? (0 - distance.y) * -1 : (0 - distance.y); 

        return (aX + aY) - (bX + bY);
    }
}