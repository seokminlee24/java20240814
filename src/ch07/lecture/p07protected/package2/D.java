package ch07.lecture.p07protected.package2;

import ch07.lecture.p07protected.package1.A;

public class D extends A{
// publicMethod
    // protectedMethd
    // packagePrivateMethod

    public void someMethod() {
        publicMethod(); // ok
        protectedMethod(); // ok
//        packagePrivateMethod(); // x
    }
}
