package ch08.lectrue.p01interface;

public class C01Interface {

}

interface Aquatic1{}
interface Beast1{}

class Animal{}
class Fish1 extends Animal{}
class Shark1 extends Animal implements Aquatic1,Beast1{}
class Nimo1 extends Animal implements Aquatic1{}

class Mammal1 extends  Animal{}
class Tiger1 extends Animal implements Beast1{}
class Maltese1 extends Animal{}
class Whale1 extends Animal implements Aquatic1{}
