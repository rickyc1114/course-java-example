package ex4_2;

import javax.swing.JFrame;

public class DrawPolygon extends JFrame {
  public DrawPolygon() {
    setTitle("DrawPolygon");
    add(new PolygonsPanel());
  }

  /** Main method */
  public static void main(String[] args) {
    DrawPolygon frame = new DrawPolygon();
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 250);
    frame.setVisible(true);
  }
}


