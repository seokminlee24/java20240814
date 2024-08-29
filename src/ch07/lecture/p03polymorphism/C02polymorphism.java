package ch07.lecture.p03polymorphism;

public class C02polymorphism {
    Child02 o = new Child02();
    Parent02 p = o;
    ParentParent02 q = p;

    ParentParent02 r = new Child02();

    Parent02 a = new Chile03();
    Parent02 b = new Child02();

    //Child02 c = new Child03(); //x
   // Child03 d = new Child02(); //x
}
class ParentParent02{

}

class Parent02 extends ParentParent02{

}

class Child02 extends Parent02{

}
class Chile03 extends Parent02{

}