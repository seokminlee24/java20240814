package ch13.lectrue.po1generic;

public class C03Generic {
    public static void main(String[] args) {
        Container3<String> box1 = new Container3<String>();
        box1.setItem("java");
        String item1 = box1.getItem();
        System.out.println("item1 = " + item1);
    }
}

//<> : 타입 파라미터
//generic type : 타입파라밑가 있는 타입(클래스,인터페이스)
class Container3<T>{
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}