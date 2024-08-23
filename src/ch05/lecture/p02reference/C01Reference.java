package ch05.lecture.p02reference;

public class C01Reference {
    public static void main(String[] args) {
        int a; //
        int [] arr;

        a=3;
        arr = new int[]{5,6};

        System.out.println("a = " + a);
        System.out.println("arr = " + arr);
        System.out.println(System.identityHashCode(arr));

        int b = a;
        System.out.println(b);

        a = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int[]brr;
        brr = arr;

        System.out.println("arr[0] = " + arr[1]);
        System.out.println("brr[0] = " + brr[0]);
    }
}
