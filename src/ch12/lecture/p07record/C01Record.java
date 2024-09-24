package ch12.lecture.p07record;

public class C01Record {
    public static void main(String[] args) {
        Book1 book1 = new Book1("java","shin", 3000);
        Book1 book2 = new Book1("git","linus", 5000);
        Book1 book3 = new Book1("git","linus", 5000);

        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());
        System.out.println(book3.getTitle());
    }
}

// record 이전 시절...
class Book1{
    private String title;
    private String author;
    private int price;

    public Book1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
