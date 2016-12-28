/**
 * Created by Yaskovich Dmitry on 27/12/2016.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Created by liveuser on 21.10.16.
 */
public class ColorFrame extends JFrame{

    JFrame frame =new JFrame("Color");
    JButton btnRed =new JButton("Red");
    JButton btnWhite =new JButton("White");
    JButton btnBlue =new JButton("Blue");
    JButton btnGreen =new JButton("Green");

    public ColorFrame()
    {
        InnerListener listener = new InnerListener();
        btnRed.addActionListener(listener);
        btnWhite.addActionListener(listener);
        btnBlue.addActionListener(listener);
        btnGreen.addActionListener(listener);

        getContentPane().setBackground(new Color(0,0,0));
        setSize(200,200);
        setLayout(new FlowLayout());
        add(btnRed);
        add(btnWhite);
        add(btnBlue);
        add(btnGreen);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new ColorFrame();
    }

    class InnerListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource() == btnRed)
            {
                getContentPane().setBackground(new Color(255,0,0));
            }
            if(ae.getSource() == btnWhite)
            {
                getContentPane().setBackground(new Color(255,255,255));
            }
            if(ae.getSource() == btnBlue)
            {
                getContentPane().setBackground(new Color(0,0,255));
            }
            if(ae.getSource() == btnGreen)
            {
                getContentPane().setBackground(new Color(0,255,0));
            }
        }
    }

}



