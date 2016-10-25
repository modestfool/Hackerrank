package ui;

import java.awt.*;
import java.applet.*;
/**
 *
 * @author ravit
 */
public class FloatingText extends Applet
{
    /**
     * @param args the command line arguments
     */
    private static int size = 10;
    public Image img;
    static Thread tt;

    public void init()
    {
        new Thread(new Runnable() {
            public void run()
            {
                do
                {
                    try
                    {
                        Thread.sleep(500);
                        size++;
                        if(size==40)
                            size=12;
                        repaint();
                        System.out.println("Thread running");
                    }
                    catch(InterruptedException ie)
                    {
                        System.out.println ("Thread Exception");
                    }
                }while(true);
            }
        }).start();
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial",Font.BOLD,size));
        g.drawImage( img, size,size ,this);
        g.drawString("I am growing ",100,100);
    }

    @SuppressWarnings("deprecation")
    public void destroy()
    {
        System.out.print("finished");

    }
}