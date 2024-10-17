
import javax.swing.*;
import java.awt.*;

public class q1 {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("College Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a label with the specified text
        JLabel label = new JLabel("Dr. D Y Patil College", SwingConstants.CENTER);
        
        // Set the background color to red
        label.setOpaque(true);  // JLabel by default is not opaque, so we need to enable it
        label.setBackground(Color.RED);
        
        // Set the font size to 20
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        
        // Add the label to the frame
        frame.add(label);
        
        // Set the frame layout and make it visible
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
    }
}
