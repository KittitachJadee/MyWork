import javax.swing.JOptionPane;  
import java.util.GregorianCalendar;
public class JOptionPaneTest {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        String message = new String();
        message = message.format("Today is %tc", date);
        JOptionPane.showMessageDialog( null, "Hello World!!" );
        JOptionPane.showMessageDialog( null, message);
    }
}