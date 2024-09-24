package ch12.lecture.p08enum;

public class C01Enum {
    public static void main(String[] args) {
        int season = Enum1.SPRING;

        switch (season){
            case Enum1.SPRING -> {}
            case Enum1.SUMMER -> {}
            case Enum1.FALL -> {}
            case Enum1.WINTER -> {}

        }
    }
}

class Enum1{
    public static final int SPRING = 1;
    public static final int SUMMER = 2;
    public static final int FALL = 3;
    public static final int WINTER = 4;
}
