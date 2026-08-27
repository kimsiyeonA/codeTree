public class Main {
    public static void main(String[] args) {
        double oneFt = 30.48, oneMi = 160934;
        double ft = 9.2, mi = 1.3;
        System.out.printf("%.1fft = %.1fcm \n", ft, (ft*oneFt));
        System.out.printf("%.1fmi = %.1fcm", mi, (mi*oneMi));
    }
}