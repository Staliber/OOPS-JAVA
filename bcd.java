import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
/*<applet code="bcd" width="400" height="250"></applet>*/

public class bcd extends Applet implements MouseListener, MouseMotionListener
{
    int mx = 0;
    int my = 0;
    String msg = "";

    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent me)
    {
        mx = 20;
        my = 40;
        msg = "Mouse Clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent me)
    {
        mx = 40;
        my = 80;
        msg = "Mouse Entered";  
        repaint();
    }

    public void mouseExited(MouseEvent me)   
    {
        mx = 40;
        my = 80;
        msg = "Mouse Exited";
        repaint();
    }

    public void mousePressed(MouseEvent me)  
    {
        msg = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent me) 
    {
        msg = "Mouse Released";
        repaint();
    }

    public void mouseDragged(MouseEvent me)
    {
        mx = me.getX();
        my = me.getY();
        showStatus("Currently mouse at " + mx + " and " + my);
        repaint();
    }

    public void mouseMoved(MouseEvent me)
    {
        mx = me.getX();
        my = me.getY();
        showStatus("Currently mouse at " + mx + " and " + my);
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString("Handling Mouse Events", 30, 20);
        g.drawString(msg, 60, 40);
    }
}

