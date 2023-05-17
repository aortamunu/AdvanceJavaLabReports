import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo {
    public static void main(String[] args) {
        // Create a new JFrame with a FlowLayout
        JFrame frame = new JFrame("Button Demo");
        frame.setLayout(new FlowLayout());

        // Create a new button
        JButton button = new JButton("Click me!");

        // Add an ActionListener to the button that changes its color
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color currentColor = button.getBackground();
                Color newColor = (currentColor == Color.RED) ? Color.BLUE : Color.RED;
                button.setBackground(newColor);
            }
        });

        // Add the button to the JFrame
        frame.add(button);

        // Set the size of the JFrame and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
