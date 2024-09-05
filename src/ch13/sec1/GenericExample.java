package ch13.sec1;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println("str = " + str);

        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        int Value = box2.content;
        System.out.println("Value = " + Value);
    }
}
