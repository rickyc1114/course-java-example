package ex4_2;

import javax.swing.JFrame;

public class DrawArcs extends JFrame {
  public DrawArcs() {
    setTitle("DrawArcs");
    add(new ArcsPanel());
  }

  /** Main method */
  public static void main(String[] args) {
    DrawArcs frame = new DrawArcs();
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(250, 300);
    frame.setVisible(true);
  }
}

