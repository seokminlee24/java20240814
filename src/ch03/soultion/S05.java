package ch03.soultion;

public class S05 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        //(윗변 + 아랫변) * 높이 / 2
        double area =(double) (lengthTop+lengthBottom)*height/2;
        System.out.println("area = " + area); //52.5
    }
}
