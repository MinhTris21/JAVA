import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.util.Random;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGH = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_HEIGH*SCREEN_WIDTH)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int Snakebody = 6;
    int AppleAte;
    int AppleX;
    int AppleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGH));
        this.setBackground(Color.CYAN);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        GameStart();
    }
    public void GameStart()
    {
        CreateApple();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();

    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g)
    {
        if (running){
            for (int i = 0; i < SCREEN_HEIGH/UNIT_SIZE; i++)
            {
                g.drawLine(i*UNIT_SIZE,0,i*UNIT_SIZE,SCREEN_HEIGH);
                g.drawLine(0,i*UNIT_SIZE,SCREEN_WIDTH,i*UNIT_SIZE);
            }
                g.setColor(Color.ORANGE);
                g.fillOval(AppleX,AppleY,UNIT_SIZE,UNIT_SIZE);

            for (int i = 0; i  < Snakebody; i++)
            {
                if (i==0)
                {
                    g.setColor(Color.GREEN);
                    g.fillRect(x[i],y[i],UNIT_SIZE,UNIT_SIZE);
                }else{
                    g.setColor(Color.RED);
                    g.fillRect(x[i],y[i],UNIT_SIZE,UNIT_SIZE);
                }
            }
            g.setColor(Color.PINK);
            g.setFont(new Font("Arial",Font.BOLD,20));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: "+AppleAte,(SCREEN_WIDTH - metrics.stringWidth("Score: "+AppleAte))/2,g.getFont().getSize());
        }else{
            gameOver(g);
        }
    }
    public void SnakeMove(){
        for (int i = Snakebody;i>0;i--)
        {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        switch (direction)
        {
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
        }
    }
    public void CreateApple(){
        AppleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        AppleY = random.nextInt((int)(SCREEN_HEIGH/UNIT_SIZE))*UNIT_SIZE;
    }
    public void checkCollision(){
        //IF THE SNAKE HEAD TOUCH THE BODY ==> GAME OVER.
        for (int i = Snakebody; i >  0;i--)
        {
            if ((x[0] == x[i]) && (y[0] == y[i]))
            {
                running = false;        //COMMAND TO STOP THE RUNNING.
            }
        }
        //IF THE SNAKE HEAD TOUCH THE BORDER ==> GAME OVER.
        //CHECK THE LEFT BORDER
        if (x[0] < 0)
        {
            running = false;
        }
        //RIGHT BORDER
        if (x[0] > SCREEN_WIDTH)
        {
            running = false;
        }
        //IF THE SNAKE HEAD TOUCH THE TOP BORDER
        if (y[0] < 0)
        {
            running = false;
        }
        //IF THE SNAKE HEAD TOUCH THE BOTTOM BORDER
        if (y[0] > SCREEN_HEIGH)
        {
            running = false;
        }
        if (running ==false)
        {
            timer.stop();
        }
    }
    public void checkApple(){
        if ((x[0] == AppleX) && (y[0] == AppleY))
        {
            Snakebody++;
            AppleAte++;
            CreateApple();
        }
    }
    public void gameOver(Graphics g)
    {
        //SET GAME OVER TEXT
        g.setColor(Color.BLACK);
        g.setFont(new Font("Consolas",Font.BOLD,50));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Game Over",(SCREEN_WIDTH - metrics.stringWidth("Game Over"))/2,SCREEN_HEIGH/2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(running)
        {
            SnakeMove();
            checkApple();
            checkCollision();
        }
        repaint();
    }

public class MyKeyAdapter extends KeyAdapter{
    public void keyPressed(KeyEvent e)
        {
            switch(e.getKeyCode())
            {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R')
                    {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L'){
                        direction = 'R';}
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D')
                    {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U')
                    {
                        direction = 'D';
                    }
                    break;
            }
        }
    }



}