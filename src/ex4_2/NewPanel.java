package ex4_2;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;

public class NewPanel extends JPanel {
    int x = 0;

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawLine(0, 0, 50, 50);
    g.setColor(Color.red);
    g.drawString("Banner " + x++, 0, 40);
    
  }
}