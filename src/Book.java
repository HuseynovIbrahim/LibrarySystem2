public class Book {

    private String name;
    private String author;
    private String janr;
    private String numberOfPage;
    private String language;
    private String price;
    private String numberOfBooks;

    public Book(){

    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getJanr() {
        return janr;
    }

    public String getNumberOfPage() {
        return numberOfPage;
    }

    public String getLanguage() {
        return language;
    }

    public String getPrice() {
        return price;
    }

    public String getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setJanr(String janr) {
        this.janr = janr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPage(String numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setNumberOfBooks(String numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", janr='" + janr + '\'' +
                ", numberOfPage='" + numberOfPage + '\'' +
                ", language='" + language + '\'' +
                ", price='" + price + '\'' +
                ", numberOfBooks='" + numberOfBooks + '\'' +
                '}';
    }
}
