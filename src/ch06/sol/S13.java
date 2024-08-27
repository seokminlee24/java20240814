package ch06.sol;

public class S13 {
    public static void main(String[] args) {
        Member member = new Member();
        member.Name = "이석민";
        System.out.println("member.Name = " + member.Name);
        member.id= "hong";
        System.out.println("member.id = " + member.id);
        member.password = "1234";
        System.out.println("member.password = " + member.password);
        member.age = 10;
        System.out.println("member.age = " + member.age);
    }
}
class Member{
    String Name;
    String id;
    String password;
    int age;
}
