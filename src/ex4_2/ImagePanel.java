package ex4_2;

import javax.swing.*;
import java.awt.*;

// Define the panel for showing an image
public class ImagePanel extends JPanel {

    ImageIcon imageIcon = new ImageIcon("image/us.gif");
    Image image = imageIcon.getImage();

    /** Draw image on the panel */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            //g.drawImage(image, 0, 0, this);
        }
        
    }
}
