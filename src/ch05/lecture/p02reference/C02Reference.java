package ch05.lecture.p02reference;

public class C02Reference {
    public static void main(String[] args) {
        int[] arr = new int[]{7,8};
        int[] brr = {7,8};
        int[] crr = arr;

        arr[0] = 71;
        brr[0] = 72;
        crr[0] = 73;



        System.out.println("arr[7] = " + arr[0]);//73
        System.out.println("brr[7] = " + brr[0]);//72
        System.out.println("crr[7] = " + crr[0]);//73
    }
}
