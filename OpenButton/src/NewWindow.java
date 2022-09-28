import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("CYKA");

    NewWindow(){
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null, Font.BOLD,20));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300,500);
        frame.setVisible(true);
        frame.add(label);
    }


}
