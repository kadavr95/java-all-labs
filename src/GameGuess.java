/**
 * Created by Yaskovich Dmitry on 27/12/2016.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class GameGuess extends JFrame
{
    final Random random = new Random();
    int secretNumber;
    int tryCount=0;
    JTextField jta1 = new JTextField(10);
    JButton button = new JButton("Guess number from 0 to 20");
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    GameGuess()
    {
        secretNumber=random.nextInt(21);
        //super("Example");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(new JLabel("Your answer is: "));
        add(jta1);
        add(button);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    tryCount++;
                    int answer = Integer.parseInt(jta1.getText().trim());
                    if (answer==secretNumber)
                    {
                        JOptionPane.showMessageDialog(null, "You win. Answer is "+secretNumber,"Alert",JOptionPane.INFORMATION_MESSAGE);
                        secretNumber=random.nextInt(21);
                        tryCount=0;
                    }
                    else
                    {
                        if (answer>20||answer<0)
                        {
                            tryCount--;
                            JOptionPane.showMessageDialog(null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                        }
                        else
                        {
                            if (tryCount == 3) {
                                JOptionPane.showMessageDialog(null, "You lose. Answer was " + secretNumber, "Alert", JOptionPane.INFORMATION_MESSAGE);
                                secretNumber = random.nextInt(21);
                                tryCount = 0;
                            } else {
                                if (answer > secretNumber)
                                    JOptionPane.showMessageDialog(null, "Your answer is bigger than number to guess", "Alert", JOptionPane.INFORMATION_MESSAGE);
                                else
                                    JOptionPane.showMessageDialog(null, "Your answer is smaller than number to guess", "Alert", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }

                }
                catch(Exception e)
                {
                    tryCount--;
                    JOptionPane.showMessageDialog(null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new GameGuess();
    }
}