/*
 * Java
 */
package uppgift3;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
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
    
    static ImageIcon imgsrc12 = new ImageIcon("src\\imgs\\num12.jpg");
    static Image im12 = imgsrc12.getImage();
    static int wwimg = 200;
    static int hhimg = 200;
    static Image imnew12 = im12.getScaledInstance(wwimg, hhimg, SCALE_SMOOTH);
    static ImageIcon img12 = new ImageIcon(imnew12);  
    static JButton testbb = new JButton(img12);
    

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
        button[n-1][n-1].setText("");        
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
        while(ButtonSpel.blandAgain(button)==true){
            blandB(button);     //recursion
        }        
    }
    public static void winButton(JButton[][] button){
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
                JOptionPane.showMessageDialog(null, "YOU WIN!!!!");
            }
        }           
    }
    public static boolean blandAgain(JButton[][] button){
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
    public static void blandBPar(JButton[] button){
        Random rani = new Random();
        for(int i=0; i<button.length; i++){
            int raninum = rani.nextInt(button.length);
                if(i==raninum)
                    continue;
                testbb.setIcon(img12);
                testbb.setIcon(button[i].getIcon());
                button[i].setIcon(button[raninum].getIcon());
                button[raninum].setIcon(testbb.getIcon());
                testbb.setIcon(img12);
        }
    }     
}    

