package uppgift3;

import java.awt.Font;
import java.util.Random;
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
                if(!(i== n-1 && j == n-1)){
                    button[i][j] = new JButton(ss);
                    button[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
                } else {
                    button[i][j] = new JButton("");
                    button[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
                }
                
            }
        }
        return button;
    }
    public static void blandButton(JButton[][] button){
        Random rani = new Random();
        JButton tmp = new JButton("tmp");

        for(int i=0; i<button.length; i++){
            int raninum = rani.nextInt(button.length);
            for(int j=0; j<button.length; j++){
                int ranjnum = rani.nextInt(button.length);
                if(i==raninum && j==ranjnum)
                    continue;

                tmp.setText(button[i][j].getText());
                button[i][j].setText(button[raninum][ranjnum].getText());
                button[raninum][ranjnum].setText(tmp.getText());
            }
        }          
    }
    public static boolean winButton(JButton[][] button){
        int total= 0;
        int number=0;        
        for(int i=0; i<button.length; i++){
            for(int j=0; j<button.length; j++){
                number++;
                String str = "" + number;
                if(button[i][j].getText().equals(str))
                    total++;
            }
            if(total == button.length*button.length -1){
                return true;
            }
        }
        return false;
    }
}
