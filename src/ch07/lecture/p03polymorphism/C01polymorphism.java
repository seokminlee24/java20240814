package ch07.lecture.p03polymorphism;

public class C01polymorphism {
    Parent01 o1 = new Parent01();//ok
    Parent01 o2 = o1;//ok
    Parent01 o3 = new Child011();//ok
    Parent01 o4 = new Child012();//ok
    //Child012 o5 = new Child011();
}

class Parent01{

}

class Child011 extends Parent01{

}

class Child012 extends Parent01{

}
