package org.Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame implements ActionListener {
    String[][] questions = new String[10][5];
    String[][] answers = new String[10][2];
    String[][] user_answers = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next;
    JButton submit, quit;

    public static int timer = 15;

    public static int ans_given = 0; // to check ans is given or not

    public static int count = 0; // for tracking question
    public static int score = 0;
    String user;
    JButton PreviousQ;
    JButton Quit;
    Start(String name){
        this.user = name;
        setTitle("QuizzBuzz");
        getContentPane().setBackground(new Color(55, 126, 158));
        setLayout(null);


        JLabel image1 = new JLabel();
        image1.setIcon(new ImageIcon("icons/user.png"));
        image1.setBounds(1100,100,48,48);
        add(image1);
        JLabel user = new JLabel( name );
        user.setBounds(1155,100,200,40);
        user.setFont(new Font("Poppins",Font.BOLD,30));
        user.setForeground(Color.black);
        add(user);

        qno = new JLabel();
        qno.setBounds(100, 200, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        qno.setForeground(new Color(221, 230, 235));
        add(qno);

        question = new JLabel();
        question.setBounds(150, 200, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        question.setForeground(new Color(221, 230, 235));
        add(question);

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "Select the valid statement.";
        questions[4][1] = "char[] ch = new char(5)";
        questions[4][2] = "char[] ch = new char[5]";
        questions[4][3] = "char[] ch = new char()";
        questions[4][4] = "char[] ch = new char[]";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Number of primitive data types in Java are?";
        questions[9][1] = "6";
        questions[9][2] = "9";
        questions[9][3] = "8";
        questions[9][4] = "3";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "char[] ch = new char[5]";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "8";

        opt1 = new JRadioButton();
        opt1.setBounds(170, 240, 700, 30);
        opt1.setBackground(new Color(55, 126, 158));
        opt1.setForeground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170, 280, 700, 30);
        opt2.setBackground(new Color(55, 126, 158));
        opt2.setForeground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 320, 700, 30);
        opt3.setBackground(new Color(55, 126, 158));
        opt3.setForeground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170, 360, 700, 30);
        opt4.setBackground(new Color(55, 126, 158));
        opt4.setForeground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("Next");
        next.setBounds(1100, 400, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(13, 52, 79));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);


        submit = new JButton("Submit");
        submit.setBounds(1100, 450, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(13, 52, 79));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        quit = new JButton("Quit");
        quit.setBounds(1100, 500, 200, 40);
        quit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        quit.setBackground(new Color(13, 52, 79));
        quit.setForeground(Color.WHITE);
        quit.addActionListener(this);
        add(quit);

        start(count);

        //side img
        JLabel userSide = new JLabel();
        userSide.setIcon(new ImageIcon("icons/user_side.png"));
        userSide.setBounds(1000,0,900,750);
        add(userSide);

        setSize(1400,750);
        setLocation(50,50);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                user_answers[count][0] = "";
            } else {
                user_answers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            if (count == 0) { // user on 9th ques
                next.setEnabled(true);
                submit.setEnabled(false);
            }
            if (count == 8) { // user on 9th ques
                next.setEnabled(false);
                submit.setEnabled(true);
            }


            count++;
            start(count);
        }
        else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                user_answers[count][0] = "";
            } else {
                user_answers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < user_answers.length; i++) {
                if (user_answers[i][0].equals(answers[i][1])) {
                    score += 10;
                }
            }
            setVisible(false);
           new Score(user, score);
        }
        else if (ae.getSource() == quit) {
            setVisible(false);
            new Login();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1060, 400);
        } else {
            g.drawString("Times up!!", 1060, 400);
        }

        timer--; // 14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                // checking if the user answered or nor
                if (groupoptions.getSelection() == null) { // no ans
                    user_answers[count][0] = "";
                } else { // ans given
                    user_answers[count][0] = groupoptions.getSelection().getActionCommand();
                }

                for (int i = 0; i < user_answers.length; i++) {
                    if (user_answers[i][0].equals(answers[i][1])) {
                        score += 10;
                    }
                }
                setVisible(false);
                new Score(user, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                    user_answers[count][0] = "";
                } else {
                    user_answers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }

    public static void main(String[] args) {
        new Start("User");
    }
}
