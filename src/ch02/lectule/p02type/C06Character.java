package ch02.lectule.p02type;

public class C06Character {
    public static void main(String[] args){
        //char (2byte)
        //문자하나
        //unicode
        char a = 'a';
        char b = '가';
        char c = '한';
        char d = '8';
        //char e = 'gk' //x

        char f = 65;
        System.out.println("f = " + f);
        char g = 45206;
        System.out.println("g = " + g);
        char h =3743;
        System.out.println("h = " + h);
        char i = '\u0e9f';
        System.out.println("i = " + i);
        //char k = '' 컴파일에러 혹은 공백 포함하면 초기화
    }
}
