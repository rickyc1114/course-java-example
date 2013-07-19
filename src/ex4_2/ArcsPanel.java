package ex4_2;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;

// The class for drawing arcs on a panel
public class ArcsPanel extends JPanel {
  // Draw four blazes of a fan
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

    int x = xCenter - radius;
    int y = yCenter - radius;

    g.setColor(Color.red);
    g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
    g.setColor(Color.green);
    g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
    g.setColor(Color.blue);
    g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);
    g.setColor(Color.yellow);
    g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);
  }
}
