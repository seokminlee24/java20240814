package ch12.lecture.p06annotation;

public class C06Element {
    @MyAnnotation6(name = "hello",age = 30)
    int a;

    @MyAnnotation6(name = {"world","java","css"},age = 40)
    int b;

    @MyAnnotation6(name = {"spring"},age = 50)
    int c;
}

@interface MyAnnotation6{
    //elements
    String[] name();
    int age();
}
