package ex4_2;

import javax.swing.*;

public class TestPanelDrawing extends JFrame {
  public TestPanelDrawing() {
    add(new NewPanel());
  }

  public static void main(String[] args) {
    TestPanelDrawing frame = new TestPanelDrawing();
    frame.setTitle("TestPanelDrawing");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 100);
    frame.setVisible(true);
  }
}


