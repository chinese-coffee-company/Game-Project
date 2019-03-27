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
	        f.setSize(600, 600);
		f.setResizable(false);
	        f.setVisible(true);
	        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      }
	    } );
	
	
	
	}
}
