import java.util.*;

public class Main {
    public static char[] d = new char[1000];
    public static int[] t = new int[1000];
    public static char[] d2 = new char[1000];
    public static int[] t2 = new int[1000];

    public static int OFFSET = 1000;
    public static int[] Aarr = new int[OFFSET * OFFSET + 1];
    public static int[] Barr = new int[OFFSET * OFFSET + 1];
    public static int AIDX = 1, BIDX = 1, cnt = 0;

    public static void moveA(char d, int t) {
        if (d == 'R') {
            for (int i = 1; i <= t; i++) {
                //System.out.println( (AIDX - 1) + "....." + Aarr[AIDX - 1] + "....." + (Aarr[AIDX - 1] + 1));
                Aarr[AIDX] = Aarr[AIDX - 1] + 1;
                AIDX++;
                cnt++;
            }

        } else {
            for (int i = 1; i <= t; i++) {
                Aarr[AIDX] = Aarr[AIDX - 1] - 1;
                AIDX++;
                cnt++;
            }
        }
    }

    public static void moveB(char d, int t) {
        if (d == 'R') {
            for (int i = 1; i <= t; i++) {
                //System.out.println( (AIDX - 1) + "....." + Aarr[AIDX - 1] + "....." + (Aarr[AIDX - 1] + 1));
                Barr[BIDX] = Barr[BIDX - 1] + 1;
                BIDX++;
            }

        } else {
            for (int i = 1; i <= t; i++) {
                Barr[BIDX] = Barr[BIDX - 1] - 1;
                BIDX++;
            }
        }
    }

    public static int sameTime() {
        int result = -1;
        for (int i = 1; i <= cnt; i++) {
            if (Aarr[i] == Barr[i]) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Aarr[0] = 0;
        for (int i = 0; i < n; i++) {
            d[i] = sc.next().charAt(0);
            t[i] = sc.nextInt();
            moveA(d[i], t[i]);
        }

        // System.out.println(Arrays.toString(Aarr));

        for (int i = 0; i < m; i++) {
            d2[i] = sc.next().charAt(0);
            t2[i] = sc.nextInt();
            moveB(d2[i], t2[i]);
        }

        // System.out.println(Arrays.toString(Aarr));
        // System.out.println(Arrays.toString(Barr));
        // Please write your code here.

        int ans = sameTime();

        System.out.println(ans);
    }
}
