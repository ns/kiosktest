import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;

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

    // Transparent 16 x 16 pixel cursor image.
    BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
    // Create a new blank cursor.
    Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
        cursorImg, new Point(0, 0), "blank cursor");
    // Set the blank cursor to the JFrame.
    frame.getContentPane().setCursor(blankCursor);

    frame.setVisible(true);
  }

  public static int GetScreenWorkingWidth() {
    return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
  }

  public static int GetScreenWorkingHeight() {
    return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
  }
 }