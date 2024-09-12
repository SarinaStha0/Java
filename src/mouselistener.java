import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;

public class mouselistener implements   MouseListener {
    Label l;
    mouselistener()
    {
        Frame f= new Frame();
        l=new Label();
        l.setBounds(20,50,100,20);
        f.add(l);
        f.addMouseListener(this);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
       
         l.setText("Mouse Clicked");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        
        l.setText("Mouse Pressed");
       
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Event");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    public static void main(String[] args) throws Exception{
        new mouselistener();
        
    }
}
