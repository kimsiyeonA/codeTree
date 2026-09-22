import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int idx = 1;
        Num[] nums = new Num[n];

        for(int i = 0; i < n; i++){
            nums[i] = new Num(sc.nextInt(),i+1);
        }

        int[] index = new int [n];
        Num[] newNums = new Num[n]; //  기존
        for(int i = 0; i < n ; i++){
            newNums[i] =  new Num( nums[i].num ,i+1);
        }
        Arrays.sort(nums);

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j ++){
                if(newNums[i].num == nums[j].num && newNums[i].idx == nums[j].idx){
                    //System.out.println(newNums[i].num  + "...." + nums[j].num + " " + j);
                    index[i] = j+1;
                }  
            }
        }

        // System.out.println(Arrays.toString(index));
        for(int i = 0; i < n; i++){
            System.out.print(index[i] + " ");
        }

    }
}

class Num implements Comparable<Num>{
    int num, idx;

    public Num(int num, int idx){
        this.num = num;
        this.idx = idx;
    }

    @Override
    public int compareTo(Num numF){
        return this.num - numF.num;
    }
}