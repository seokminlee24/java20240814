package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바","011225-1234567");

        System.out.println("k1.nation = " + k1.nation);
        System.out.println("k1.name = " + k1.name);
        System.out.println("k1.ssn = " + k1.ssn);
        System.out.println();
    }
}
class Korean{
    String nation = "대한한국";
    String name;
    String ssn;
    
    public Korean(String n, String s){
        name = n;
        ssn = s;
    }
}
