public class Book {
    private int bookNum;
    private String title;
    private int numPages;
    private String isbn;
    private double price;

// accessor and mutator methods

    // accessor method
    public String getTitle() {
        return title;
    }

    //mutator method


    public void setBookNum(int bookNum) { this.bookNum = bookNum; }

    public int getBookNum() {return bookNum;}

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

     @Override
    public String toString() {
        return "\n\nBook "+ bookNum + "\nBook Title: " + title +
                "\nBook Price: " + price + "\nNumber Of Pages: " + numPages +
                "\nISBN: " + isbn;
    }
}
