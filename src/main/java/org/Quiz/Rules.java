package org.Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    JButton Start;
    JButton Back;
    String userName;
    Rules(String name){
        this.userName = name;

        getContentPane().setBackground(new Color(55, 126, 158));
        setLayout(null);


        JLabel welcomeText = new JLabel("Welcome< " + name + " >to QuizzBuzz");
        welcomeText.setBounds(500,100,500,40);
        welcomeText.setFont(new Font("Poppins",Font.BOLD,30));
        welcomeText.setForeground(new Color(221, 230, 235));
        add(welcomeText);

        JLabel heading = new JLabel("Rules To Remember");
        heading.setBounds(550,150,500,40);
        heading.setFont(new Font("Poppins",Font.BOLD,30));
        heading.setForeground(new Color(221, 230, 235));
        add(heading);

        JLabel rules = new JLabel("Rules To Remember");
        rules.setBounds(60,200,500,350);
        rules.setFont(new Font("Poppins",Font.PLAIN,20));
        rules.setForeground(new Color(221, 230, 235));
        rules.setText(
                "<html>"+
                        "1. Answer point to point." + "<br><br>" +
                        "2. Do not copy from others." + "<br><br>" +
                        "3. You have 10 questions to answer." + "<br><br>" +
                        "4. You have only 4 options to chose your answer." + "<br><br>" +
                        "5. After you finish answering click on submit." +"<br><br>"+
                "<html>"
        );
        add(rules);

        Start =new JButton("Start");
        Start.setBounds(1050,500,90,30);
        Start.setForeground(Color.white);
        Start.setBackground(new Color(13, 52, 79));
        Start.addActionListener(this);
        add(Start);

        Back = new JButton("Back");
        Back.setBounds(900,500,90,30);
        Back.setForeground(Color.white);
        Back.setBackground(new Color(13, 52, 79));
        Back.addActionListener(this);
        add(Back);

        setSize(1400,750);
        setLocation(50,50);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Rules("User");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == Start){
            setVisible(false);
            new Start(userName);
        } else if (ae.getSource() == Back) {
            setVisible(false);
            new Login();
        }

    }
}
