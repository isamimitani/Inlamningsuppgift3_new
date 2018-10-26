/*
 * Java
 */
package uppgift3;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author Julia
 */
public class SpelCentral extends JFrame{
    public SpelCentral(int n){
        JFrame fram = new JFrame();
//        JPanel totalP = new JPanel();
        JPanel pane = PanelSpel.cratePanel(n);
        pane.setPreferredSize(new Dimension(500, 500));
//        JButton sizebig = new JButton("+");
//        JButton sizesmall = new JButton("-");
        JButton[][] button = ButtonSpel.createButton(n);
        button[n-1][n-1].setText("");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                pane.add(button[i][j]);
            }
        }
        fram.add(pane);
        fram.pack();
        fram.setLocation(600, 50);
        fram.setVisible(true);
        fram.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }   //konstruktur
}
