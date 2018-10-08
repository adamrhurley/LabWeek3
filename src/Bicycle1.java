import javax.swing.*;

public class Bicycle1 {
        public static void main(String[] args) {
            Bicycle bicycle = new Bicycle();

            String name, make, valueAsString;
            double value;

            JOptionPane.showMessageDialog(null, "Bicycle Details: \n" + bicycle.toString());

            name = JOptionPane.showInputDialog("Please enter your name:");

            valueAsString = JOptionPane.showInputDialog("Please the value:");
            value = Double.parseDouble(valueAsString);

            make = JOptionPane.showInputDialog("Please enter the make:");

            Bicycle bicycle1 = new Bicycle(name, value, make);


            JOptionPane.showMessageDialog(null, "Bicycle Details: \n" + bicycle1.toString());
}
}

