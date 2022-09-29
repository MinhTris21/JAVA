import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(500,500));
        this.setLayout(null);
        this.setVisible(true);
        this.addKeyListener(this);
        label = new JLabel();
        label.setBackground(Color.CYAN);
        label.setOpaque(true);
        label.setBounds(0,0,100,100);
        this.add(label);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode())
        {
            case 37: label.setLocation(label.getX()-10,label.getY());
                break;
            case 39: label.setLocation(label.getX()+10,label.getY());
                break;
            case 38: label.setLocation(label.getX(),label.getY()-10);
                break;
            case 40: label.setLocation(label.getX(),label.getY()+10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You reLeased " + e.getKeyChar());
        System.out.println("Key code: "+e.getKeyCode());
    }
}
