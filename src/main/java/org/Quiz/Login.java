package org.Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton Continue;
    JButton Rules;
    JLabel Name;
    JTextField nameInput;
    Login(){
        setTitle("Quiz Application");
        getContentPane().setBackground(new Color(55, 126, 158)); // for color we need awt package
        setLayout(null);

        JLabel image1 = new JLabel();
        image1.setIcon(new ImageIcon("icons/Quizzbuzz.png"));
        image1.setBounds(0,0,750,750);
        add(image1);


        JLabel heading = new JLabel("Give us your name");
        heading.setBounds(850,100,400,200);
        heading.setFont(new Font("Poppins",Font.BOLD,30));
        heading.setForeground(new Color(221, 230, 235));
        add(heading);

        Name = new JLabel("Name: ");
        Name.setBounds(800,300,100,30);
        Name.setFont(new Font("Poppins",Font.BOLD,24));
        Name.setForeground(new Color(221, 230, 235));
        add(Name);

        nameInput = new JTextField();
        nameInput.setBounds(900,300,250,30);
        nameInput.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(nameInput);

        Rules =new JButton("Rules");
        Rules.setBounds(920,400,90,30);
        Rules.setForeground(Color.white);
        Rules.setBackground(new Color(13, 52, 79));
        Rules.addActionListener(this);
        add(Rules);

        Continue =new JButton("Continue ");
        Continue.setBounds(1050,400,90,30);
        Continue.setForeground(Color.white);
        Continue.setBackground(new Color(13, 52, 79));
        Continue.addActionListener(this);
        add(Continue);

        setSize(1400,750);
        setLocation(50,50);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Rules){

            String name = nameInput.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource()== Continue){
            String name = nameInput.getText();
            setVisible(false);
            new Rules(name);
        }

    }
    public static void main(String[] args) {
        new Login(); // Anonymous object
    }
}
