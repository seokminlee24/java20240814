package ch13.so1.s03;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<>();
        container1.set("홍길동","도적");
        String name1 = container1.getName();
        String job1 = container1.getJob();
        System.out.println(name1);
        System.out.println(job1);

        Container<String, Integer> container2 = new Container<>();
        container2.set("홍길동",35);
        String name2 = container1.getName();
        int job2 = container2.getJob();
        System.out.println(name2);
        System.out.println(job2);
    }
}
