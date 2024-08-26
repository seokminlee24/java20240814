package ch05.lecture.p04string;

public class Co4IsEmpty {
    public static void main(String[] args) {
        //isEmpty : 긱이가 0일 때만 트루

        String a = "";
        String b = "";
        String c = "a";
        String d = "abc";

        System.out.println(a.isEmpty());//t
        System.out.println(b.isEmpty());//t
        System.out.println(c.isEmpty());//f
        System.out.println(d.isEmpty());//f
    }
}
