package ch08.sol.S05;

public class RemoconExample {
    public static void main(String[] args) {
        Remocon r = new Tv();
        r.powerOn();
    }
}

interface Remocon{
    void powerOn();
}
class Tv implements Remocon{
    @Override
    public void powerOn() {
        System.out.println("TV를 켯습니다.");
    }
}

