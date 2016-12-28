import java.awt.*;
import javax.swing.*;

public class GraphApp   {
    public static void main (String[] args)   {
        JFrame frame = new JFrame ("GraphApp");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon ("dimini.png");

        JLabel label1, label2, label3;

        label1 = new JLabel ("look on the left", icon, SwingConstants.CENTER);

        label2 = new JLabel ("this is right", icon, SwingConstants.CENTER);
        label2.setHorizontalTextPosition (SwingConstants.LEFT);
        label2.setVerticalTextPosition (SwingConstants.BOTTOM);
        label3 = new JLabel ("you lose", icon, SwingConstants.CENTER);
        label3.setHorizontalTextPosition (SwingConstants.CENTER);
        label3.setVerticalTextPosition (SwingConstants.BOTTOM);

        JPanel mainpanel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        panel1.setBackground (Color.white);
        panel2.setBackground (Color.white);
        panel3.setBackground (Color.white);
        panel1.setPreferredSize (new Dimension (300, 200));
        panel2.setPreferredSize (new Dimension (300, 200));
        panel3.setPreferredSize (new Dimension (300, 200));
        panel1.add (label1);
        panel2.add (label2);
        panel3.add (label3);

        mainpanel.add(panel1);
        mainpanel.add(panel2);
        mainpanel.add(panel3);
        frame.getContentPane().add(mainpanel);
        frame.pack();
        frame.setVisible(true);
    }
}
