package two.two;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this(name, authors, price, 1);
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + getAuthorNames() +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames() {
        StringBuilder sb = new StringBuilder("[");
        int n = authors.length;
        for (int i=0; i<n-1; i++) {
            sb.append(authors[i].getName()+ ", ");
        }
        return sb.append(authors[n-1].getName()+"]").toString();
    }
}
