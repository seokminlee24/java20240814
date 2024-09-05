package ch13.lectrue.po1generic;

public class C01Generic {
    public static void main(String[] args) {
        StringContainer1 container = new StringContainer1();
        container.setItem("java");
        String s = container.getItem();
        System.out.println("s = " + s);;

        IntegerContainer1 container1 = new IntegerContainer1();
        container1.setItem(5);
        int n = container1.getItem();
        System.out.println("n = " + n);
    }
}

class StringContainer1{
    private String item;

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}

class IntegerContainer1{
    private int item;

    public void setItem(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }
}

