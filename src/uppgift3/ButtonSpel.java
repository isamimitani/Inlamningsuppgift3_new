package uppgift3;

import java.awt.Color;
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
                    button[i][j].setFont(new Font("Arial", Font.PLAIN, 20));
                } else {
                    button[i][j] = new JButton("");
                    button[i][j].setFont(new Font("Arial", Font.PLAIN, 20));
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
    
    public static boolean isSolvable(JButton[][] button){
        int parity = 0;
        int gridWidth = button.length;
        int row = 0;
        int blankRow = 0;
        
        JButton[] bArray = new JButton[gridWidth*gridWidth];
        int count=0;
        for(int i=0; i<gridWidth; i++){
            for(int j=0; j<gridWidth; j++){
                bArray[count] = button[i][j];
                count++;
            }
        }
         
        for(int i=0; i<bArray.length; i++){
            if(i%gridWidth == 0){
                row++;
            }
            if(bArray[i].getText().equals("")){
                blankRow = row;
                continue;
            }
            for(int j=i+1; j<bArray.length; j++){
                if(bArray[i].getText().compareTo(bArray[j].getText()) > 0 
                        && !bArray[j].getText().equals("")){
                    parity++;
                }
            } 
        }
        
        if(gridWidth % 2 == 0){
            if(blankRow % 2 == 0){
                return parity % 2 == 0;
            } else {
                return parity % 2 != 0;
            }
        } else {
            return parity % 2 == 0;
        }

    }
    
    public static void changeColor(JButton[][] button){
        Random rand = new Random();
        Color newColor;
        newColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
        for(int i=0; i<button.length; i++){
            for(int j=0; j<button.length; j++){
                button[i][j].setBackground(newColor);
            }
        }
    }
}
