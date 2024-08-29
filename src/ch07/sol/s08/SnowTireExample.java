package ch07.sol.s08;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = new SnowTire();

        snowTire.run();
        tire.run();

        Tire tire1 = new Tire();
        tire1.run();
    }
}
