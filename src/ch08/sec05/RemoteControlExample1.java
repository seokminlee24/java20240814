package ch08.sec05;

public class RemoteControlExample1 {
    public static void main(String[] args) {
        RemoteControl1 rc1;
        rc1 = new Television1();
        rc1.turnOn();
        rc1.turnOff();
        rc1.setVolume(5);

        rc1.setMute(true);
        rc1.setMute(false);

        rc1 = new Audio1();
        rc1.turnOn();
        rc1.turnOff();
        rc1.setVolume(5);

        rc1.setMute(true);
        rc1.setMute(false);

        System.out.println();

        RemoteControl1.changeBattery();
    }
}

interface RemoteControl1{
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute){
        if (mute){
            System.out.println("무음 처리");
        }else {
            System.out.println("무음 처리 해제");
        }
    }

    static void changeBattery(){
        System.out.println("리모콘 배터리 교체");
    }
}

class Television1 implements RemoteControl1 {
    private int volume;
    //private String volume;

    @Override
    public void turnOn() {
        System.out.println("Television.turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Television.turnOff");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨 = " + this.volume);
    }
}

class Audio1 implements RemoteControl1{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio.turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio.turnOff");
    }

    @Override
    public void setVolume(int volume) {
        if (volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 = " + volume);
    }
    private int memoryVolume;

    @Override
    public void setMute(boolean mute) {
        if (mute){
            this.memoryVolume = this.volume;
            System.out.println("무음처리");
            setVolume(this.memoryVolume);
        }else {
            System.out.println("무음 해제");
            setVolume(this.memoryVolume);
        }
    }
}

