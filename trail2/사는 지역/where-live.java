import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        String[] address = new String[n];
        String[] region = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            address[i] = sc.next();
            region[i] = sc.next();
        }

        Address[] addresses = new Address[n];
        for (int i = 0; i < n; i++) {
            addresses[i] = new Address(name[i], address[i], region[i]);
        }

        // Please write your code here.
        Arrays.sort(name);

        int idx = 0;
        for(int i = 0; i < n; i++){
            if(addresses[i].name.equals(name[n - 1])){
                System.out.printf("name %s \naddr %s \ncity %s", addresses[i].name, addresses[i].address, addresses[i].region);
                break;
            }
        }


    }
}

class Address {
    String name;
    String address;
    String region;

    public Address(String name, String address, String region){
        this.name = name;
        this.address = address;
        this.region = region;
    }
}