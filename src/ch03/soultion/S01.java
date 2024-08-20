package ch03.soultion;

public class S01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        //int z = (++x) + (y--); //y를 사용안해서 적용x
        ++x;
        int z = x + y;
        y--;
        System.out.println("z = " + z); //31
    }
}
