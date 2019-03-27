import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;

class Main extends JFrame {

    private JLabel t1;
    
    public Main() {
    super("Test Title");
    setLayout(new FlowLayout);
    
    t1 = new JLabel("Testing 123");
    t1.setToolTipText("blah");
    add(t1);
    
    }
  








}
