package ch2.sec2;

public class ByteExample {
    public static void main(String[] args){
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        //byte var6 = 128; //java: incompatible types: possible lossy conversion from int to

        System.out.println(var1); //-128
        System.out.println(var2); //-30
        System.out.println(var3); //0
        System.out.println(var4); //30
        System.out.println(var5); //127
    }
}
