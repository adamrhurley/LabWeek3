import javax.swing.*;
public class Book1 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        String title1, title2, isbn1, isbn2, price1AsString, price2AsString, page1AsString, page2AsString, book1NumAsString, book2NumAsString;
        double price1, price2;
        int page1, page2, book1Num, book2Num;

        book1NumAsString = JOptionPane.showInputDialog("Please enter the book number: ");
        book1Num = Integer.parseInt(book1NumAsString);



        title1= JOptionPane.showInputDialog("Please Enter the first book's title: ");

        price1AsString = JOptionPane.showInputDialog("Please Enter the first book's price: ");
        price1 = Double.parseDouble(price1AsString);

        page1AsString = JOptionPane.showInputDialog("Please Enter the first book's number of pages: ");
        page1 = Integer.parseInt(page1AsString);

        isbn1 = JOptionPane.showInputDialog("Please Enter the first book's isbn: ");

        book2NumAsString = JOptionPane.showInputDialog("Please enter the book number: ");
        book2Num = Integer.parseInt(book2NumAsString);

        title2= JOptionPane.showInputDialog("Please Enter the second book's title: ");

        price2AsString = JOptionPane.showInputDialog("Please Enter the second book's price: ");
        price2 = Double.parseDouble(price2AsString);

        page2AsString = JOptionPane.showInputDialog("Please Enter the second book's number of pages: ");
        page2 = Integer.parseInt(page2AsString);

        isbn2 = JOptionPane.showInputDialog("Please Enter the second book's isbn: ");



        book1.setBookNum(book1Num);
        book1.setTitle(title1);
        book1.setPrice(price1);
        book1.setNumPages(page1);
        book1.setIsbn(isbn1);

        book2.setBookNum(book2Num);
        book2.setTitle(title2);
        book2.setPrice(price2);
        book2.setNumPages(page2);
        book2.setIsbn(isbn2);

         JOptionPane.showMessageDialog(null,book1.toString() + book2.toString());}
}









