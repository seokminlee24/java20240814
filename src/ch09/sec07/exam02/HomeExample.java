package ch09.sec07.exam02;

public class HomeExample {
    public static void main(String[] args) {
        Home home = new Home();

        home.use1();

        home.use2();

        home.use3(new RemoteControl() {
            @Override
            public void ternOn() {
                System.out.println("난방을 킵니다");
            }

            @Override
            public void ternOff() {
                System.out.println("난방을 끕니다.");
            }
        });
    }
}
