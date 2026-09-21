import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] height = new int[n];
        int[] weight = new int[n];
        Student[] students = new Student[n];
        int idx = 1;

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            students[i] = new Student(height[i], weight[i], idx++);
        }
        // Please write your code here.
        Arrays.sort(students);

        for(int i = 0; i < n; i++){
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].index);
        }

    }
}

class Student implements Comparable<Student>{
    int height, weight, index;

    public Student(int height, int weight, int index){
        this.height = height;
        this.weight = weight;
        this.index = index;
    }

    @Override
    public int compareTo(Student student){
        if(this.height == student.height){
            if(this.weight == student.weight)
                return this.index - student.index;
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }
}