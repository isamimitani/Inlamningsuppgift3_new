/*
 * Java
 */
package uppgift3;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Julia
 */
public class ButtonSpel extends JFrame{
    public static JButton[][] createButton(int n){
        JButton[][] button = new JButton[n][n];
        int tt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                tt++;
                String ss = "" + tt;
                button[i][j] = new JButton(ss);
            }
        }
        return button;
    }
}
