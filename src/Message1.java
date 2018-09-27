import javax.swing.*;
public class Message1 {
    public static void main(String[] args) {
        Message message = new Message();

        String eMessage;

        eMessage = JOptionPane.showInputDialog("Enter your Message: ");

        message.setMessage(eMessage);

        JOptionPane.showMessageDialog(null,message.toString());
    }
}
