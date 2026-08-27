public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7, temp, temp2;

        // temp = b;
        // b = a;
        // temp2 = c;
        // c = temp;
        // a = temp2;

        temp = a;
        a = c;
        c = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}