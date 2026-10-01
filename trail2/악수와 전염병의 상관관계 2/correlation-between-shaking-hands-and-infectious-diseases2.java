import java.util.*;
public class Main {

    public static int N, K, P, T ;

    public static int[] NArr ; // 사람 수, 감염 표시
    public static int[] KArr ; // 사람당 할 수 감염시킬 수 있는 회수 넣기

    public static void fullK(int k){
        for(int i = 0; i < KArr.length; i++){
            KArr[i] = k;
        }
    }

    public static boolean haveInfect(int n){
        return NArr[n] == 1; 
    }

    public static boolean haveNum(int n){
        return KArr[n] > 0; 
    }

    public static void print(){
        for(int i = 1; i < NArr.length; i++){
            System.out.print(NArr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 개발자 사람수
        K = sc.nextInt(); // 횟수 -> 감염된 사람당 감염, 감염 가능성 넣어두기
        NArr = new int[N + 1]; // 사람 수, 감염 표시
        KArr = new int[N + 1]; // 사람당 할 수 감염시킬 수 있는 회수 넣기
        fullK(K); // KArr에 k채우기

        P = sc.nextInt(); // 감염된 개발자

        NArr[P] = 1; // 김염된 개발자 표시

        T = sc.nextInt(); // 악수 기록 횟수

        Shake[] shakes = new Shake[T];
        for (int i = 0; i < T; i++) {
            shakes[i] = new Shake(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        // int[][] shakes = new int[T][3];
        // for (int i = 0; i < T; i++) {
        //     shakes[i][0] = sc.nextInt();
        //     shakes[i][1] = sc.nextInt();
        //     shakes[i][2] = sc.nextInt();
        // }
        // Please write your code here.

        Arrays.sort(shakes);

        for(int i = 0; i < T; i++){
            // 감염확인
            boolean x = haveInfect(shakes[i].x);
            boolean y = haveInfect(shakes[i].y);

            // 감염 수 확인
            boolean xhave = haveNum(shakes[i].x);
            boolean yhave = haveNum(shakes[i].y);

            // x가 감염자이고, 감염수를 가지고 있으며 y가 감염자가 아닐때
            if(x && xhave && (y==false)){
                // x 감염자 감염 가능 수 빼기
                KArr[shakes[i].x]--;
                // y 감염자 감염
                NArr[shakes[i].y] = 1;

            // y가 감염자이고, 감염수를 가지고 있으며 x가 감염자가 아닐때
            }else if(y && yhave && (x==false)){
                // y 감염자 감염 가능 수 빼기
                KArr[shakes[i].y]--;
                // x 감염자 감염
                NArr[shakes[i].x] = 1;

            // 둘다 감염자일 때 빼기
            }else if(y && x){
                // 감염자 감염 가능 수 빼기
                KArr[shakes[i].y]--;
                KArr[shakes[i].x]--;

            }


        }

        /*
        1. x 개발자 감염확인
        2. y 개발자 감염확인
        3. 둘중에 하나가 감염이고 하나는 감염이 아니면 실행
        4. 감염된 애의 k이가 남아있는지 확인
            3-1 이미 감염된 애는 k 작게 만들기
            3-2 감염될 애는 감염되었다고 표시
        5. 둘다 감염자일 때 감염 가능 수 빼기
        */


        print();



    }
}
 
class Shake implements Comparable<Shake>{
    int t; // 초 
    int x; // 1번
    int y; // 2 번
    public Shake(int t, int x, int y){
        this.t = t;
        this.x = x;
        this.y = y;
    }

    public int compareTo(Shake shake){
        return this.t - shake.t;
    }

    
}