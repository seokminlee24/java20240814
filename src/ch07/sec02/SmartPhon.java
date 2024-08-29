package ch07.sec02;

public class SmartPhon extends Phone {
    public boolean wifi;

    public SmartPhon(String model,String  color){
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경");
    }

    public  void  internet(){
        System.out.println("인터넷을 연결");
    }
}
