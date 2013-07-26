import java.awt.*;
import javax.swing.*;

 public class test {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Simple GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    
    frame.setSize(GetScreenWorkingWidth(), GetScreenWorkingHeight());
    frame.setLocationRelativeTo(null);

    frame.getContentPane().setBackground(Color.RED);

    frame.setVisible(true);
  }

  public static int GetScreenWorkingWidth() {
    return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
  }

  public static int GetScreenWorkingHeight() {
    return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
  }
 }