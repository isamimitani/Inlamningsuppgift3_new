
package uppgift3;
import javax.swing.*;

/**
 *Nu börjar jag seperat olika klasser
 * @author julia
 */
public class Uppgift3 {
    public Uppgift3(){

        int row = Integer.parseInt(JOptionPane.showInputDialog("How many rows?"));
        SpelCentral sc = new SpelCentral(row);
    }
        

        

    
    public static void main(String[] args) {
//        BildSpel bs = new BildSpel();
        Uppgift3 play = new Uppgift3();
    }

}
