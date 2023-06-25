package org.Quiz;

    import java.awt.*;
    import javax.swing.*;
    import java.awt.event.*;

    public class Score extends JFrame implements ActionListener {

        Score(String name, int score) {
            //setBounds(400, 150, 750, 550);
            setTitle("Score Board");
            getContentPane().setBackground(Color.black);
            setLayout(null);

            JLabel heading = new JLabel("Thankyou " + name + " for playing QuizzBuzz");
            heading.setBounds(500, 30, 700, 30);
            heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
            heading.setForeground(Color.white);
            add(heading);

            JLabel lblscore = new JLabel(" "+score);
            lblscore.setBounds(690, 470, 300, 30);
            lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
            lblscore.setForeground(Color.white);
            add(lblscore);

            JButton submit = new JButton("Play Again");
            submit.setBounds(650, 600, 120, 30);
            submit.setBackground(Color.white);
            submit.setForeground(Color.black);
            submit.addActionListener(this);
            add(submit);

            JLabel image1 = new JLabel();
            image1.setIcon(new ImageIcon("icons/score.gif"));
            image1.setBounds(150,0,1400,750);
            add(image1);

            setSize(1400,750);
            setLocation(50,50);
            setVisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            new Login();
        }

        public static void main(String[] args) {
            new Score("User", 0);
        }
    }

