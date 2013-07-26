import java.awt.*;
import javax.swing.*;

 public class test {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Simple GUI");
    frame.setUndecorated(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();

    
    frame.setSize(800, 600);
    frame.setLocationRelativeTo(null);

    frame.getContentPane().setBackground(Color.BLACK);

    Container container = frame.getContentPane();
    container.setLayout(new BorderLayout());
    container.add(new JLabel(new ImageIcon("test.png")), BorderLayout.CENTER);

    frame.setVisible(true);
  }

  public static int GetScreenWorkingWidth() {
    return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
  }

  public static int GetScreenWorkingHeight() {
    return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
  }
 }