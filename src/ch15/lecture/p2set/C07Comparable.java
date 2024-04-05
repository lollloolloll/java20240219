import java.util.*;

public class C07Comparable {
    public static void main(String[] args) {

        var set = new TreeSet<C07Book>();
        set.add(new C07Book("git", 6000));
        set.add(new C07Book("모두의 자바다", 8000));
        set.add(new C07Book("react", 9000));

        System.out.println(set);

    }
}

class C07Book implements Comparable<C07Book> {
    private String title;
    private Integer price;

    public C07Book(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C07Book c07Book = (C07Book) o;
        return Objects.equals(title, c07Book.title) && Objects.equals(price, c07Book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "C07Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(C07Book o) {
        return this.price.compareTo(o.price);
    }
}
