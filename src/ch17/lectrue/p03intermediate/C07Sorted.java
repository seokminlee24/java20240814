package ch17.lectrue.p03intermediate;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class C07Sorted {
    public static void main(String[] args) {
        List<Book> list = List.of(
                new Book("java", 500),
                new Book("git", 300),
                new Book("css",700),
                new Book("spring", 600),
                new Book("react", 400)
        );

        //출력
        list.stream()
                .forEach(System.out::println);
        System.out.println();

        //순
        list.stream()
                .sorted((a,b) -> a.getPrice() - b.getPrice())
                .forEach(System.out::println);
        System.out.println();

        //역순
        list.stream()
                .sorted(comparingInt(Book::getPrice))
                .forEach(System.out::println);
        System.out.println();

        //순
        list.stream()
                .sorted((a,b) -> a.getTitle().compareTo(b.getTitle()))
                .forEach(System.out::println);
        System.out.println();

        //역순
        list.stream()
                .sorted(comparing(Book::getTitle))
                .forEach(System.out::println);
        System.out.println();
    }
}

class Book{
    private String title;
    private int price;

    //생성자,getter ,toString


    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
