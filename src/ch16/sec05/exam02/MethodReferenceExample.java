package ch16.sec05.exam02;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();{
            //compareToIgnoreCase : 대소문자를 무시하고 비교
            //person.ordering((a, b) -> a.compareToIgnoreCase(b));
            person.ordering(String::compareToIgnoreCase);
        }
    }
}
