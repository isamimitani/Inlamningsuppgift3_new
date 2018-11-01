package uppgift3;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for show different images
 * @author isami
 */
public class ImagePlayer extends SwingWorker{
    
    JPanel imagePanel = new JPanel();
    ImageIcon icon;
    List<ImageIcon> imageicons = new ArrayList<>();
    JLabel imagelabel;
    int count = 0;

    public ImagePlayer(){
        
        Image image;
        
        Scanner sc = null;
        try {
            sc = new Scanner(new File("src\\uppgift3\\image_url.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImagePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(sc.hasNextLine()){           
            try {
                URL url = new URL(sc.nextLine());
                icon = new ImageIcon(url);
                image = icon.getImage().getScaledInstance(500, 150, Image.SCALE_SMOOTH);
                icon = new ImageIcon(image);
                imageicons.add(icon);
            } catch (MalformedURLException ex) {
                Logger.getLogger(ImagePlayer.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }

        imagelabel = new JLabel(imageicons.get(0));
        imagePanel.add(imagelabel);
        count++;
    }
    
    @Override
    protected Object doInBackground() throws Exception {
        int delay = 3000; //milliseconds

        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(count%imageicons.size() == 0)
                    count = 0;
                imagelabel.setIcon(imageicons.get(count));
                count++;
            }
        };
        new Timer(delay, taskPerformer).start();
        return "";
    }
    
}
