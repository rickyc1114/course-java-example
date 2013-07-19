package ex4_2;

import javax.swing.*;

public class TestPaintComponent extends JFrame {

    public TestPaintComponent() {
        add(new NewLabel("Banner"));
    }

    public static void main(String[] args) {
        TestPaintComponent frame = new TestPaintComponent();
        frame.setTitle("TestPaintComponent");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}


