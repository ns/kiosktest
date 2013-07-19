import java.awt.*;
import javax.swing.*;

 public class test {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Simple GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    
    frame.setSize(800, 600);
    frame.setLocationRelativeTo(null);

    frame.getContentPane().setBackground(Color.RED);

    frame.setVisible(true);
  } 
 } 