import javax.swing.*;
public class Book1 {
    public static void main(String[] args) {
        Book Book1 = new Book();
        Book Book2 = new Book();

        String title1, title2, isbn1, isbn2, price1AsString, price2AsString, page1AsString, page2AsString;
        double price1, price2;
        int page1, page2;

        title1= JOptionPane.showInputDialog("Please Enter the first book's title: ");

        price1AsString = JOptionPane.showInputDialog("Please Enter the first book's price: ");
        price1 = Double.parseDouble(price1AsString);

        page1AsString = JOptionPane.showInputDialog("Please Enter the first book's number of pages: ");
        page1 = Integer.parseInt(page1AsString);

        isbn1 = JOptionPane.showInputDialog("Please Enter the first book's isbn: ");


        title2= JOptionPane.showInputDialog("Please Enter the second book's title: ");

        price2AsString = JOptionPane.showInputDialog("Please Enter the second book's price: ");
        price2 = Double.parseDouble(price2AsString);

        page2AsString = JOptionPane.showInputDialog("Please Enter the second book's number of pages: ");
        page2 = Integer.parseInt(page2AsString);

        isbn2 = JOptionPane.showInputDialog("Please Enter the second book's isbn: ");




        Book1.setTitle(title1);
        Book1.setPrice(price1);
        Book1.setNumPages(page1);
        Book1.setIsbn(isbn1);

        Book2.setTitle(title2);
        Book2.setPrice(price2);
        Book2.setNumPages(page2);
        Book2.setIsbn(isbn2);

        JOptionPane.showMessageDialog(null,"Book 1\nBook Title: " + Book1.getTitle() + "\nBook Price: " + Book1.getPrice() + "\nNumber Of Pages: " + Book1.getNumPages() + "\nISBN: " + Book1.getIsbn() + "\n\nBook 2\nBook Title: " + Book2.getTitle() + "\nBook Price: " + Book2.getPrice() + "\nNumber Of Pages: " + Book2.getNumPages() + "\nISBN: " + Book2.getIsbn());
    }
}









