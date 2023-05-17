import javax.swing.*;
import java.awt.*;

public class LabelDemo {
    public static void main(String[] args) {
        // Create a new JFrame with a GridBagLayout
        JFrame frame = new JFrame("Label Demo");
        frame.setLayout(new GridBagLayout());

        // Create a new label with italic font, custom font size, and custom color
        JLabel label = new JLabel("Hello, world!");
        label.setFont(new Font("Serif", Font.ITALIC, 30));
        label.setForeground(new Color(65, 13, 160));

        // Create GridBagConstraints for the label
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);

        // Add the label to the JFrame
        frame.add(label, c);

        // Set the size of the JFrame and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
