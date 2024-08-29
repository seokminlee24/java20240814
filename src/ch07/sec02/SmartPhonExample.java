package ch07.sec02;

public class SmartPhonExample {
    public static void main(String[] args) {
        SmartPhon myPhon = new SmartPhon("갤럭시","은색");

        System.out.println("모델 = " + myPhon.model);
        System.out.println("색상 = " + myPhon.color);

        System.out.println("와이파이 상태 = " + myPhon.wifi);

        myPhon.bell();
        myPhon.sendVoice("여보세요");
        myPhon.receiveVoice("안녕하세요 저는 홍길동인데요");
        myPhon.sendVoice("아~ 네 반갑습니다.");
        myPhon.hangUp();

        myPhon.setWifi(true);
        myPhon.internet();
    }
}
