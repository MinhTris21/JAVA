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



