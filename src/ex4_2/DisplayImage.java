package ex4_2;

import javax.swing.*;

public class DisplayImage extends JFrame {
  public DisplayImage() {
    add(new ImagePanel());
  }

  public static void main(String[] args) {
    JFrame frame = new DisplayImage();
    frame.setTitle("DisplayImage");
    frame.setSize(300, 300);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
