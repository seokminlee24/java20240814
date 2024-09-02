package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}

interface InterfaceA {
    void  methodA();
}

interface InterfaceB {
    void  methodB();
}

interface InterfaceC extends InterfaceA,InterfaceB{
    void methodC();
}

class InterfaceCImpl implements InterfaceC{
    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl.methodC");
    }

    @Override
    public void methodA() {
        System.out.println("InterfaceCImpl.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImpl.methodB");
    }
}