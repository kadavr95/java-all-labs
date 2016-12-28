/**
 * Created by Yaskovich Dmitry on 27/12/2016.
 */
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

class LayoutApp extends JFrame
{
    JButton btnWest =new JButton("jihad");
    JButton btnEast =new JButton("abha");
    JButton btnSouth =new JButton("dahran");
    JButton btnNorth =new JButton("also empty");
    JButton btnCenter =new JButton("");
    public LayoutApp()
    {
        setLayout(new BorderLayout());
        InnerListener listener = new InnerListener();
        add(btnWest,BorderLayout.WEST);
        add(btnEast,BorderLayout.EAST);
        add(btnSouth,BorderLayout.SOUTH);
        add(btnNorth,BorderLayout.NORTH);
        add(btnCenter,BorderLayout.CENTER);
        btnWest.addMouseListener(listener);
        btnEast.addMouseListener(listener);
        btnSouth.addMouseListener(listener);
        btnNorth.addMouseListener(listener);
        btnCenter.addMouseListener(listener);
        setSize(800,500);

    }
    class InnerListener implements MouseListener
    {
        public void mouseExited(MouseEvent a){}
        public void mouseClicked(MouseEvent a) {}
        public void mouseEntered(MouseEvent a) {
            if (a.getSource()==btnWest)
                JOptionPane.showMessageDialog(null, "welcome to jihad", "Alert", JOptionPane.INFORMATION_MESSAGE);
            if (a.getSource()==btnEast)
                JOptionPane.showMessageDialog(null, "welcome to abha", "Alert", JOptionPane.INFORMATION_MESSAGE);
            if (a.getSource()==btnSouth)
                JOptionPane.showMessageDialog(null, "welcome to dahran", "Alert", JOptionPane.INFORMATION_MESSAGE);
            if (a.getSource()==btnNorth)
                JOptionPane.showMessageDialog(null, "welcome to also empty", "Alert", JOptionPane.INFORMATION_MESSAGE);
            if (a.getSource()==btnCenter)
                JOptionPane.showMessageDialog(null, "welcome to ", "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
        public void mouseReleased(MouseEvent a) {}
        public void mousePressed(MouseEvent a) {}
    }
    public static void main(String[]args)
    {
        new LayoutApp().setVisible(true);
    }
}
