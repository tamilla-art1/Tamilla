import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Book {

    String author;
    int numberofPages;
    public Book(String author,int numberofPages) {
        this.author=author;
        this.numberofPages=numberofPages;
    }

    static Map<String, Book> booksearch = new HashMap<>();
    static {
        booksearch.put("Moon", new Book("Jack", 100));
        booksearch.put("Sun", new Book("Jack", 920));
        booksearch.put("Clock", new Book("Jack", 300));
        booksearch.put("Sunrise", new Book("Jack", 50));
        booksearch.put("At night", new Book("Mike", 60));
    }

    public static void main(String[] args) {
metod1();
        metod2();
    }

    public static void metod1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kitabin adini daxil et");
        String title = sc.nextLine();


Book b=booksearch.get(title);
if (b==null){
    System.out.println("Bele kitab mövcud deyil.");

}
else {
        System.out.println(b.author);

    }

}
public static void metod2() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Müəllif adini daxil et");
    String author = sc.nextLine();
    boolean a=false;
    for (Map.Entry<String, Book> entry : booksearch.entrySet()) {
        String title = entry.getKey();
        Book b = entry.getValue();
        if (author.equalsIgnoreCase(b.author)) {
            System.out.println(title);
            a=true;
        }

    }
if (a==false){
    System.out.println("Bele müəllif mövcud deyil");
}
}}
