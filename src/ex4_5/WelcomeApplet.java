package ex4_5;

// WelcomeApplet.java: Applet for displaying a message
import javax.swing.*;

public class WelcomeApplet extends JApplet {
  /** Construct the applet */
  JLabel jlb;
  
  public WelcomeApplet() {
    jlb = new JLabel("Welcome to Java", JLabel.CENTER);
	add(jlb);
	repaint();
	System.out.println("Construct...");
  }

  public void init() {
	//jlb.setText("Init...");
	System.out.println("Init...");
  }

  public void start() {
	//jlb.setText("Start...");
	System.out.println("Start...");
  }

  public void stop() {
	//jlb.setText("Stop...");
	System.out.println("Stop...");
  }

  public void destroy() {
	//jlb.setText("Destory...");
	System.out.println("Destory...");
  }

}
