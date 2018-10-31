
/*
 * Java
 */
package uppgift3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Julia
 */
public class SpelCentral extends JFrame implements ActionListener{

    JFrame frame = new JFrame();
    JPanel totalP = new JPanel();
    JPanel again = new JPanel();
    JPanel pane;
    JButton shuffle = new JButton("Nytt spel");
    JButton[][] button = null;
    
    public SpelCentral(int n){
        button = ButtonSpel.createButton(n);
        totalP.setLayout(new BorderLayout());
        again.setLayout(new FlowLayout());
        again.add(shuffle);
        pane = PanelSpel.cratePanel(n);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                pane.add(button[i][j]);
            }
        }      
        do{
            ButtonSpel.blandButton(button);
        } while((!ButtonSpel.isSolvable(button)) || ButtonSpel.winButton(button));
              
        pane = PanelSpel.orderPanel(pane, n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                button[i][j].addActionListener(this);
            }
        }
        
        shuffle.addActionListener(onceagain ->{   //Lamda
            do{
                ButtonSpel.blandButton(button);
            } while((!ButtonSpel.isSolvable(button)) || ButtonSpel.winButton(button));
            pane.setVisible(true);
        });
        
        pane.setPreferredSize(new Dimension(500, 500));
        totalP.add(pane, BorderLayout.CENTER);
        totalP.add(again, BorderLayout.WEST);
        frame.add(totalP);
        frame.pack();
        frame.setLocation(600, 50);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }   //konstruktur
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getSource().toString();
        System.out.println(s);
        s = s.substring(20, 23);
        int n = Integer.parseInt(s);
        int m =0;
        int upp=0;
        int ner=0;
        int left=0;
        int right=0;
        if(n>=100 && n<500){
            for(int i=0; i<button.length; i++){
                for(int j=0; j<button.length; j++){
                    if(button[i][j].getText().equals("")){
                        m = Integer.parseInt(button[i][j].getName());
                        left = Integer.parseInt(button[i][0].getName());
                        right = Integer.parseInt(button[i][button.length-1].getName());
                        while(n>=left && n<m){
                            button[i][j].setText(button[i][--j].getText());
                            button[i][j].setText("");
                            n++;
                        }
                        while(n>m && n<=right){
                            button[i][j].setText(button[i][++j].getText());
                            button[i][j].setText("");
                            n--;
                        }
                        if(n>right){
                            for(int k=i+1; k<button.length; k++){
                                ner=Integer.parseInt(button[k][j].getName()); 
                                if(n==ner){
                                    for(int p=i; p<k; p++){
                                        button[p][j].setText(button[p+1][j].getText());
                                        button[p+1][j].setText("");
                                    }
                                }
                            }
                        }
                        if(n<left){
                            for(int k=i-1; k>=0; k--){
                                upp=Integer.parseInt(button[k][j].getName()); 
                                if(n==upp){
                                    for(int p=i; p>k; p--){
                                        button[p][j].setText(button[p-1][j].getText());
                                        button[p-1][j].setText("");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(ButtonSpel.winButton(button)){
            JOptionPane.showMessageDialog(null, "Grattis, du vann!");
            pane.setVisible(false);
        }
    }
}
