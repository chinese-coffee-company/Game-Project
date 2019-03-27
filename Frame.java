import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.EventQueue;

class Frame extends JFrame  {
	
	
	public static void main( String[] args ) {
	    EventQueue.invokeLater( new Runnable() {
	      @Override
	      public void run() {
	        JFrame f = new JFrame("Hello World");
	        f.getContentPane().setBackground(Color.BLACK);
	        f.setSize(400, 400);
	        f.setVisible(true);
	        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      }
	    } );
	
	
	
	}
}
