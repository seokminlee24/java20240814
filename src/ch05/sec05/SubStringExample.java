package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstName =ssn.substring(0,6);
        System.out.println(firstName);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
