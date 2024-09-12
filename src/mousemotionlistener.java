import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.*;
import java.awt.event.*;

public class mousemotionlistener implements MouseMotionListener{
    Frame f;
    {
     f= new Frame();
     f.addMouseMotionListener(this);
     f.setSize(300,300);
     f.setLayout(null);
     f.setVisible(true);
    }
    public void mouseDragged(MouseEvent e){
        Graphics g=f.getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    @Override
    public void mouseMoved(MouseEvent e){}
    public static void main(String[] args)throws Exception {
        new mousemotionlistener();
    }
    
}
