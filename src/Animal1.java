import javax.swing.*;

public class Animal1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal("Aquatic", "Europe", 20.6, 17);

        JOptionPane.showMessageDialog(null, "Animal Details: \n\n" + animal.toString());

        JOptionPane.showMessageDialog(null, "Animal Details: \n\n" + animal1.toString());
    }
}
