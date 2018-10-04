import javax.swing.*;

    public class MyPoint1 {
        public static void main(String[] args) {
            MyPoint Point = new MyPoint();

            MyPoint Point1 = new MyPoint(2,5);

            JOptionPane.showMessageDialog(null, "Position Details: \n\n" + Point.toString());

            JOptionPane.showMessageDialog(null, "Position Details: \n\n" + Point1.toString());

            JOptionPane.showMessageDialog(null, "\nDistance from origin for point1 is: " + Point1.distanceFromOrigin());

            Point1.moveVertically(6);

            JOptionPane.showMessageDialog(null, "\nAfter moving point1 vertically 6 units its new position is " + Point1.toString());

            Point1.moveHorizontally(8);

            JOptionPane.showMessageDialog(null, "\nAfter moving point1 horizontally 8 units its new position is " + Point1.toString());

            Point1.translate(100, 100);

            JOptionPane.showMessageDialog(null, "\nAfter translating point1 its new position is " + Point1.toString());
}
    }
