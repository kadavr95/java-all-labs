/**
 * Created by Yaskovich Dmitry on 27/12/2016.
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Created by liveuser on 21.10.16.
 */
public class MatchFrame extends JFrame{

    int countMilan;
    int countReal;
    JFrame frame =new JFrame("Match");
    JButton btnMilan =new JButton("AC Milan");
    JButton btnReal=new JButton("Real Madrid");
    JLabel lblScore=new JLabel("Result: 0 x 0");
    JLabel lblScorer=new JLabel("Last Scorer: N/A");
    JLabel lblResult=new JLabel("Winner: DRAW");

    public MatchFrame()
    {
        countMilan=0;
        countReal=0;
        InnerListener listener = new InnerListener();
        btnMilan.addActionListener(listener);
        btnReal.addActionListener(listener);

        getContentPane().setBackground(new Color(200,200,200));
        setSize(200,200);
        setLayout(new FlowLayout());
        add(btnMilan);
        add(btnReal);
        add(lblScore);
        add(lblScorer);
        add(lblResult);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new MatchFrame();
    }

    class InnerListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource() == btnMilan)
            {
                countMilan++;
                lblScore.setText("Result: "+countMilan+" x "+countReal);
                lblScorer.setText("Last Scorer: AC Milan");
                if (countMilan>countReal)
                    lblResult.setText("Winner: AC Milan");
                else
                if (countMilan<countReal)
                    lblResult.setText("Winner: Real Madrid");
                else
                    lblResult.setText("Winner: Draw");
            }
            else
            {
                countReal++;
                lblScore.setText("Result: "+countMilan+" x "+countReal);
                lblScorer.setText("Last Scorer: Real Madrid");
                if (countMilan>countReal)
                    lblResult.setText("Winner: AC Milan");
                else
                if (countMilan<countReal)
                    lblResult.setText("Winner: Real Madrid");
                else
                    lblResult.setText("Winner: Draw");

            }
        }
    }

}

