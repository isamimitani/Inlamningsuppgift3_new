/*
 * Java
 */
package uppgift3;
import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Julia
 */
public class ButtonSpel extends JFrame{
    public static JButton test = new JButton("test");

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
    public static void blandB(JButton[][] button){
            Random rani = new Random();
            Random ranj = new Random();
            for(int i=0; i<button.length; i++){
                int raninum = rani.nextInt(button.length);
                for(int j=0; j<button.length; j++){
                    int ranjnum = ranj.nextInt(button.length);
                    if(i==raninum && j==ranjnum)
                        continue;
                    test.setText("test");
                    test.setText(button[i][j].getText());
                    button[i][j].setText(button[raninum][ranjnum].getText());
                    button[raninum][ranjnum].setText(test.getText());
                    test.setText("test");
                }
            }          
    }
}
