package ch09.sec07.exam02;

public class Home {
    RemoteControl rc = new RemoteControl() {
        @Override
        public void ternOn() {
            System.out.println("Tv를 킵니다.");
        }

        @Override
        public void ternOff() {
            System.out.println("Tv를 끕니다.");
        }
    };
    public void use1(){
        rc.ternOn();
        rc.ternOff();
    }

    public void use2(){
        RemoteControl rc = new RemoteControl() {
            @Override
            public void ternOn() {
                System.out.println("에어컨을 켭니다.");
            }

            @Override
            public void ternOff() {
                System.out.println("에어콘을 끕니다.");
            }
        };
        rc.ternOn();
        rc.ternOff();
    }

    public void use3(RemoteControl rc){
        rc.ternOn();
        rc.ternOff();
    }
}

