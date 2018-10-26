/*
 * Java
 */
package uppgift3;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Julia
 */
public class SpelCentral extends JFrame implements ActionListener{
    JFrame fram = new JFrame();
    JPanel totalP = new JPanel();
    JPanel again = new JPanel();
    JButton bland = new JButton("once again");
    JButton[][] button =null;
    public SpelCentral(int n){
        button = ButtonSpel.createButton(n);
        totalP.setLayout(new BorderLayout());
        again.setLayout(new FlowLayout());
        again.add(bland);
        JPanel pane = PanelSpel.cratePanel(n);
        button[n-1][n-1].setText("");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                pane.add(button[i][j]);
            }
        }
        ButtonSpel.blandB(button);
        pane = PanelSpel.orderPanel(pane, n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                button[i][j].addActionListener(this);
            }
        }
        bland.setName("999");
        bland.addActionListener(this);
        pane.setPreferredSize(new Dimension(500, 500));
        totalP.add(pane, BorderLayout.CENTER);
        totalP.add(again, BorderLayout.WEST);
        fram.add(totalP);
        fram.pack();
        fram.setLocation(600, 50);
        fram.setVisible(true);
        fram.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }   //konstruktur
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getSource().toString();
        s = s.substring(20, 23);
        int n = Integer.parseInt(s);
        int m =0;
        int upp=0;
        int ner=0;
        int left=0;
        int right=0;
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
        if(n>=100 && n<500){
            for(int i=0; i<button.length; i++){
                for(int j=0; j<button.length; j++){
                    if(button[i][j].getText().equals("")){
                        m = Integer.parseInt(button[i][j].getName());
                        left = m - 1;
                        right = m + 1;
                        if(n==left){
                            button[i][j].setText(button[i][j-1].getText());
                            button[i][j-1].setText("");
                        }
                        if(n==right){
                            button[i][j].setText(button[i][j+1].getText());
                            button[i][j+1].setText("");
                        }
                        if(i>0 && i<button.length-1 && n!=left && n!=right){
                            upp = Integer.parseInt(button[i-1][j].getName());
                            ner = Integer.parseInt(button[i+1][j].getName());
                            if(n==ner){
                                button[i][j].setText(button[i+1][j].getText());
                                button[i+1][j].setText("");
                            }
                            if(n==upp){
                                button[i][j].setText(button[i-1][j].getText());
                                button[i-1][j].setText("");
                            }
                        }
                        if(i==0 && n!=left && n!=right){
                            ner = Integer.parseInt(button[i+1][j].getName());
                            if(n==ner){
                                button[i][j].setText(button[i+1][j].getText());
                                button[i+1][j].setText("");
                            }
                        }
                        if(i==button.length-1 && n!=left && n!=right){
                            upp = Integer.parseInt(button[i-1][j].getName());
                            if(n==upp){
                                button[i][j].setText(button[i-1][j].getText());
                                button[i-1][j].setText("");
                            }
                        }
                    }
                }
            }
        }
        if(n==999){
            ButtonSpel.blandB(button);        
        }
    }
}
