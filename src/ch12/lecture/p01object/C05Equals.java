package ch12.lecture.p01object;

import java.util.Objects;

public class C05Equals {

}

class MyClass5 {
    private String name;
    public int age;
    private String address;


    //인텔리제이 도구활용
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass5 myClass6 = (MyClass5) o;
        return age == myClass6.age && Objects.equals(name, myClass6.name) && Objects.equals(address, myClass6.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }
}
