package ch06.sec08.exam03;

public class Car {
    //필드선언
    int gas;

    //리턴값이 없는 메소드을 받아서 gas 필드값 변경
    void setGas(int gas) {
        this.gas = gas;
    }

    //리턴값이 boolean인 메소드로 gas 필드값이 0이면 f,0이 아니면 t을 리턴
    boolean isLeft() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    //리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드 종료
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량:" + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량:" + gas + ")");
                return;//메소드 종료
            }
        }
    }
}
