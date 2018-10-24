/*
 * Java
 */
package uppgift3;

import java.awt.GridLayout;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Julia
 */
public class BildSpel extends JFrame implements ActionListener{
    JFrame f = new JFrame();
    JPanel pnum = new JPanel();
    JPanel pimg = new JPanel();
    
    ImageIcon imgsrc1 = new ImageIcon("src\\imgs\\num1.jpg");
    int himg = 200;
    int wimg = 200;
    Image im1 = imgsrc1.getImage();
    Image imnew1 = im1.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img1 = new ImageIcon(imnew1);
    
    ImageIcon imgsrc2 = new ImageIcon("src\\imgs\\num2.jpg");
    Image im2 = imgsrc2.getImage();
    Image imnew2 = im2.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img2 = new ImageIcon(imnew2);
    ImageIcon imgsrc3 = new ImageIcon("src\\imgs\\num3.png");
    Image im3 = imgsrc3.getImage();
    Image imnew3 = im3.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img3 = new ImageIcon(imnew3);
    ImageIcon imgsrc4 = new ImageIcon("src\\imgs\\num4.png");
    Image im4 = imgsrc4.getImage();
    Image imnew4 = im4.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img4 = new ImageIcon(imnew4);
    ImageIcon imgsrc5 = new ImageIcon("src\\imgs\\num5.png");
    Image im5 = imgsrc5.getImage();
    Image imnew5 = im5.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img5 = new ImageIcon(imnew5);
    ImageIcon imgsrc6 = new ImageIcon("src\\imgs\\num6.png");
    Image im6 = imgsrc6.getImage();
    Image imnew6 = im6.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img6 = new ImageIcon(imnew6);
    ImageIcon imgsrc7 = new ImageIcon("src\\imgs\\num7.png");
    Image im7 = imgsrc7.getImage();
    Image imnew7 = im7.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img7 = new ImageIcon(imnew7);
    ImageIcon imgsrc8 = new ImageIcon("src\\imgs\\num8.jpg");
    Image im8 = imgsrc8.getImage();
    Image imnew8 = im8.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img8 = new ImageIcon(imnew8);
    ImageIcon imgsrc9 = new ImageIcon("src\\imgs\\num9.png");
    Image im9 = imgsrc9.getImage();
    Image imnew9 = im9.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img9 = new ImageIcon(imnew9);
    ImageIcon imgsrc10 = new ImageIcon("src\\imgs\\num10.jpg");
    Image im10 = imgsrc10.getImage();
    Image imnew10 = im10.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img10 = new ImageIcon(imnew10);
    ImageIcon imgsrc11 = new ImageIcon("src\\imgs\\num11.png");
    Image im11 = imgsrc11.getImage();
    Image imnew11 = im11.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img11 = new ImageIcon(imnew11);
    ImageIcon imgsrc12 = new ImageIcon("src\\imgs\\num12.jpg");
    Image im12 = imgsrc12.getImage();
    Image imnew12 = im12.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img12 = new ImageIcon(imnew12);
    ImageIcon imgsrc13 = new ImageIcon("src\\imgs\\num13.png");
    Image im13 = imgsrc13.getImage();
    Image imnew13 = im13.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img13 = new ImageIcon(imnew13);
    ImageIcon imgsrc14 = new ImageIcon("src\\imgs\\num14.png");
    Image im14 = imgsrc14.getImage();
    Image imnew14 = im14.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img14 = new ImageIcon(imnew14);
    ImageIcon imgsrc15 = new ImageIcon("src\\imgs\\num15.png");
    Image im15 = imgsrc15.getImage();
    Image imnew15 = im15.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img15 = new ImageIcon(imnew15);
    ImageIcon imgsrc16 = new ImageIcon("src\\imgs\\num16.png");
    Image im16 = imgsrc16.getImage();
    Image imnew16 = im16.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img16 = new ImageIcon(imnew16);
    
    JLabel number1 = new JLabel("1");
    JLabel number2 = new JLabel("2");
    JLabel number3 = new JLabel("3");
    
    JButton pic1 = new JButton(img1);
    JButton pic2 = new JButton(img2);
    JButton pic3 = new JButton(img3);
    JButton pic4 = new JButton(img4);
    JButton pic5 = new JButton(img5);
    JButton pic6 = new JButton(img6);
    JButton pic7 = new JButton(img7);
    JButton pic8 = new JButton(img8);
    JButton pic9 = new JButton(img9);
    JButton pic10 = new JButton(img10);
    JButton pic11 = new JButton(img11);
    JButton pic12 = new JButton(img12);
    JButton pic13 = new JButton(img13);
    JButton pic14 = new JButton(img14);
    JButton pic15 = new JButton(img15);
    JButton pic16 = new JButton(img16);
    
    JButton[] allButton = {pic1, pic2, pic3, pic4, pic5, pic6, pic7, pic8, pic9,
        pic10, pic11, pic12, pic13, pic14, pic15, pic16};
    
    
    
    BildSpel(){
        
        
        pnum.setLayout(new GridLayout(1, 3));
        pnum.add(number1);
        pnum.add(number2);
        pnum.add(number3);
        
        pimg.setLayout(new GridLayout(4, 4));
        pimg.add(pic1);
        pimg.add(pic2);
        pimg.add(pic3);
        pimg.add(pic4);
        pimg.add(pic5);
        pimg.add(pic6);
        pimg.add(pic7);
        pimg.add(pic8);
        pimg.add(pic9);
        pimg.add(pic10);
        pimg.add(pic11);
        pimg.add(pic12);
        pimg.add(pic13);
        pimg.add(pic14);
        pimg.add(pic15);
        pimg.add(pic16);
        pic1.addActionListener(this);
        pic2.addActionListener(this);
        pic3.addActionListener(this);
        pic4.addActionListener(this);
        pic5.addActionListener(this);
        pic6.addActionListener(this);
        pic7.addActionListener(this);
        pic8.addActionListener(this);
        pic9.addActionListener(this);
        pic10.addActionListener(this);
        pic11.addActionListener(this);
        pic12.addActionListener(this);
        pic13.addActionListener(this);
        pic14.addActionListener(this);
        pic15.addActionListener(this);
        pic16.addActionListener(this);
        pimg.getComponent(0).setName("11");
        pimg.getComponent(1).setName("12");
        pimg.getComponent(2).setName("13");
        pimg.getComponent(3).setName("14");
        pimg.getComponent(4).setName("21");
        pimg.getComponent(5).setName("22");
        pimg.getComponent(6).setName("23");
        pimg.getComponent(7).setName("24");
        pimg.getComponent(8).setName("31");
        pimg.getComponent(9).setName("32");
        pimg.getComponent(10).setName("33");
        pimg.getComponent(11).setName("34");
        pimg.getComponent(12).setName("41");
        pimg.getComponent(13).setName("42");
        pimg.getComponent(14).setName("43");
        pimg.getComponent(15).setName("44");


//        pimg.add(pnum);
        f.add(pimg);
        f.pack();
        f.setLocation(600, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getSource().toString();
        s = s.substring(20, 22);
        int n = Integer.parseInt(s);
        int m =0;
        int upp=0;
        int ner=0;
        int left=0;
        int right=0;
        for(int i=0; i<16; i++){
            if((allButton[i].getIcon().toString()).equals(img16.toString())){
                m = Integer.parseInt(allButton[i].getName());
                upp = m - 10;
                ner = m + 10;
                left = m - 1;
                right = m + 1;
                if(allButton[i].getName().startsWith("4")){
                    if(n==left || n==right){
                        allButton[i].setIcon(allButton[n-29].getIcon());
                        allButton[n-29].setIcon(img16);
                    }
                    if(n==upp){
                        allButton[i].setIcon(allButton[n-23].getIcon());
                        allButton[n-23].setIcon(img16);
                    }
                }
                if(allButton[i].getName().startsWith("3")){
                    if(n==left || n==right){
                        allButton[i].setIcon(allButton[n-23].getIcon());
                        allButton[n-23].setIcon(img16);
                    }
                    if(n==upp){
                        allButton[i].setIcon(allButton[n-17].getIcon());
                        allButton[n-17].setIcon(img16);
                    }
                    if(n==ner){
                        allButton[i].setIcon(allButton[n-29].getIcon());
                        allButton[n-29].setIcon(img16);
                    }
                }
                if(allButton[i].getName().startsWith("2")){
                    if(n==left || n==right){
                        allButton[i].setIcon(allButton[n-17].getIcon());
                        allButton[n-17].setIcon(img16);
                    }
                    if(n==upp){
                        allButton[i].setIcon(allButton[n-11].getIcon());
                        allButton[n-11].setIcon(img16);
                    }
                    if(n==ner){
                        allButton[i].setIcon(allButton[n-23].getIcon());
                        allButton[n-23].setIcon(img16);
                    }
                }
                if(allButton[i].getName().startsWith("1")){
                    if(n==left || n==right){
                        allButton[i].setIcon(allButton[n-11].getIcon());
                        allButton[n-11].setIcon(img16);
                    }
                    if(n==ner){
                        allButton[i].setIcon(allButton[n-17].getIcon());
                        allButton[n-17].setIcon(img16);
                    }
                }
            }
        }
    
    }
    
    
}
    

