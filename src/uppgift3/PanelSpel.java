/*
 * Java
 */
package uppgift3;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Julia
 */
public class PanelSpel extends JFrame{
    public static JPanel cratePanel(int n){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(n, n));
        return p;
    }
    
}
