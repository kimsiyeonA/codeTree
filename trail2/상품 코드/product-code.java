import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        Product p1 = new Product();
        Product p2 = new Product(id2, code2);

        System.out.printf("product %d is %s\n", p1.code, p1.id);
        System.out.printf("product %d is %s\n", p2.code, p2.id);
    }
}

class Product{
    String id;
    int code;

    public Product(){
        this.id = "codetree";
        this.code = 50;
    }

    public Product(String id, int code){
        this.id = id;
        this.code = code;
    }
}