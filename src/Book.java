public class Book {
    private int bookNum;
    private String title;
    private int numPages;
    private String isbn;
    private double price;


    //constructor (no-arg)

    public Book()
    {
        this.title = "No title";
        this.numPages = 0;
        this.isbn = "No ISBN";
        this.price = 0.0;
    }

    public Book(String title,int numPages,String isbn,double price)
    {
        setTitle(title);//mutators are called here to initialise attributes
        setNumPages(numPages);
        setIsbn(isbn);
        setPrice(price);
        /*this.title = title;
        this.numPages = numPages;
        this.isbn = isbn;
        this.price = price;*/

    }
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
        //returjning object state directly via attributes
       return "\n\nBook "+ bookNum + "\nBook Title: " + title +
                "\nBook Price: " + price + "\nNumber Of Pages: " + numPages +
                "\nISBN: " + isbn;

        //returning object state indirectly via the accessors
        /* return "\n\nBook "+ getBookNum() + "\nBook Title: " + getTitle() +
                 "\nBook Price: " + getPrice() + "\nNumber Of Pages: " + getNumPages() +
                 "\nISBN: " + getIsbn();*/
    }
}
