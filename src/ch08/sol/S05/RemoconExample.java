package ch08.sol.S05;

public class RemoconExample {
    public static void method(Remocon remocon){
        System.out.println(remocon.powerOn());
    }
    public static void main(String[] args) {
        //Remocon r = new Tv();
        //r.powerOn();
        method(new Tv());
    }
}

interface Remocon{
    //void powerOn();
    String  powerOn();
}
class Tv implements Remocon{
    @Override
    public String powerOn() {
        //System.out.println("TV를 켯습니다.");
        return "TV를 켯습니다.";
    }
}

