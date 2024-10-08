package ch12.lecture.p05reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class C02Reflection {
    public static void main(String[] args) {
        Class o1 = MyClass2.class;
        Field[] fileds = o1.getDeclaredFields();//필드 정보 얻기
        Constructor[] constructors = o1.getDeclaredConstructors();//생성자 정보 얻기
        Method[] methods = o1.getDeclaredMethods();//메소드 정보 얻기

        System.out.println("fileds = " + fileds.length);
        System.out.println("constructors = " + constructors.length);
        System.out.println("methods = " + methods.length);
    }
}

class MyClass2{
    //필드
    private  int age;
    private  String name;
    private  String email;

    //생성자

    public MyClass2(){

    }

    public MyClass2(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    //메소드
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MyClass2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyClass2 myClass2)) return false;
        return age == myClass2.age && Objects.equals(name, myClass2.name) && Objects.equals(email, myClass2.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, email);
    }
}