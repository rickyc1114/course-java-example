package ex4_2;

import javax.swing.JLabel;
import java.awt.Graphics;

public class NewLabel extends JLabel {
  public NewLabel(String text) {
    super(text);
  }

    @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawLine(0, 0, 50, 50);
  }
}