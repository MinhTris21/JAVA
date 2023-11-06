/*
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //CREATE FRAME
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10, 10));
        //CREATE PANEL
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        //SETTING FOR EACH PANEL
        panel1.setBackground(new Color(0, 0, 250));
        panel2.setBackground(Color.CYAN);
        panel3.setBackground(Color.BLACK);
        panel4.setBackground(Color.YELLOW);
        panel5.setBackground(Color.GREEN);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 200));
        panel3.setPreferredSize(new Dimension(200, 100));
        panel4.setPreferredSize(new Dimension(200, 200));
        panel5.setPreferredSize(new Dimension(300, 200));
        //ADD EACH PANEL TO FRAME
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.SOUTH);


        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(new Color(0, 0, 250));
        panel7.setBackground(Color.PINK);
        panel8.setBackground(Color.ORANGE);
        panel9.setBackground(Color.BLACK);
        panel10.setBackground(Color.MAGENTA);

        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        panel2.setLayout(new BorderLayout());
        panel2.add(panel10, BorderLayout.CENTER);
        panel2.add(panel9, BorderLayout.WEST);
        panel2.add(panel8, BorderLayout.NORTH);
        panel2.add(panel7, BorderLayout.EAST);
        panel2.add(panel6, BorderLayout.SOUTH);


    }
}



import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {

        //BASIC METHOD TO CREATE FRAME
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));  //SET FLOWLAYOUT FOR FRAME.

        //BASIC METHOD TO CREATE PANEL
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(new Color(15,255,2));

        //METHOD TO OPTIMIZE THE PANEL'S LAYOUT WITH RESIZE
        panel.setLayout(new FlowLayout());
        //ADD BUTTON TO PANEL
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        frame.add(panel);
    }
}


import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //BASIC METHOD TO CREATE FRAME
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3,5,2,2));


        frame.add(new JButton("B1"));
        frame.add(new JButton("B2"));
        frame.add(new JButton("B3"));
        frame.add(new JButton("B4"));
        frame.add(new JButton("B5"));
        frame.add(new JButton("B6"));
        frame.add(new JButton("B7"));
        frame.add(new JButton("B8"));

    }
}



import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.CYAN);
        label.setBounds(50,50,200,200);
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.GREEN);
        label1.setBounds(100,100,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.RED);
        label2.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label, Integer.valueOf(3));
        layeredPane.add(label1, Integer.valueOf(2));
        layeredPane.add(label2, Integer.valueOf(1));

        JFrame frame = new JFrame("TestJFrame");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}



import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Useless infor","title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Warning Warning !!!","title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Error Error!!","ttiti",JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null,"Fuck you","title",JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(JOptionPane.showConfirmDialog(null,"Fuck you","title",JOptionPane.YES_NO_CANCEL_OPTION));

        String name = JOptionPane.showInputDialog("Who the fuk are you: ");
        System.out.println("Hello "+name);
        String[] responsive = {"No Doubt","NOPE","STFU"};
        JOptionPane.showOptionDialog(null,"Are you handsome?","best question",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,null,responsive,0);
    }
}
*/

import java.util.Random;
import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game");
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        System.out.println("Are you ready to begin the game");
        System.out.println("\t1. Yes, I am ready");
        System.out.println("\t2 No, let's wait");
        int Answer = scanner.nextInt();
        while (Answer != 1) {
            System.out.println("Are you ready to begin the game");
            System.out.println("\t1. Yes, I am ready");
            System.out.println("\t2 No, let's wait");
            Answer = scanner.nextInt();
        }
        Random random = new Random();
        boolean win = true;
        int x = random.nextInt(100);
        System.out.println("Please enter your guess number");
        int guessnumber = scanner.nextInt();
        if (guessnumber != x) {
            for (int i = 4; i > 0; i--) {
                System.out.println("You have "+ i +" times left to guess");
                guessnumber = scanner.nextInt();
                win = false;
                if (guessnumber == x){
                    win = true;
                    System.out.println("Your number is correct, Congratz!!!");
                    break;
                }
            }
        }else{
            System.out.println("You won the game with only one time guess");
        }
        if (!win)
        {
            System.out.println("You loose the game");
        }

    }
}
*/


//tinh da hinh, tinh dong goi, tinh ke thua, tinh truu tuong.