package ch12.lecture.p01object;

import java.util.Objects;

public class C06Hashcode {
    public static void main(String[] args) {
        MyClass06 o1 =new MyClass06("this is java");
        MyClass06 o2 =new MyClass06("this is java");

        boolean r1 = o1.equals(o2);
        System.out.println(r1);
    }
}

//equals 가 true 면 hashcod 값은 같아야함
class MyClass06{
    private String title;

    public MyClass06(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyClass06 other) {
            return title.equals(other.title);
        }
        return false;
    }

    //equals가 true면 hashcode 도 같아야함
    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}
