package ch13.so1.s03;

public class Container <T,U>{
    public T name;
    public U job;

    public void set(T name, U job) {
        this.name = name;
        this.job = job;
    }

    public T getName() {
        return name;
    }

    public U getJob() {
        return job;
    }
}
