package ch12.lecture.p03math;
//static import
import java.util.Arrays;

import static java.lang.Math.*;
public class StaticMember {
    public static void main(String[] args) {
        double p = PI; //static filed;

        int m = max(300,500); //static method;

        int[]a= {5,9,1};
        System.out.println(Arrays.toString(a));
        int b[] = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(b));
    }
}
