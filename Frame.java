import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;

class Frame extends JFrame {
	
	private static JLabel t1;
	

  public static void main(String[] args) {
	  Frame f = new Frame();
	  f.setTitle("Hello World");
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  f.setSize(400,400);
	  f.setVisible(true);
	  f.setResizable(true);
  
	  f.setLayout(new FlowLayout());
  
	  JLabel t1 = new JLabel("Testing 123");
  	  f.add(t1);
  



  }
}
