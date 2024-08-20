package ch03.soultion;

public class S03 {
    public static void main(String[] args) {
        //학생 30명 과 연필 534자루 변수선언
        int pencils = 534;
        int stuents = 30;

        //학생 한면이 가지는 연필의 수
        int pencilsPerStuents = (534 / 30); //17
        System.out.println("학생 한면이 가지는 연필 : = " + pencilsPerStuents);
        
        //남은 연필의 수
        int pencilsLeft= (534 % 30); //24
        System.out.println("남은 연필 : " + pencilsLeft);
    }
}
