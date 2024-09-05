import javax.swing.*;
import java.awt.*;

public class gridlayout {
    private JFrame f;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton,resetButton;
    gridlayout(){
        f=new JFrame();
        f.setTitle("Login form");
        f.setLayout(new GridLayout(4,2,10,10));

        userLabel = new JLabel("Username");
        userLabel.setHorizontalAlignment(JLabel.CENTER); //Optional
        f.add(userLabel);

        userText = new JTextField();
        f.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setHorizontalAlignment(JLabel.CENTER); //Optional
        f.add(passwordLabel);

        passwordText = new JPasswordField();
        f.add(passwordText);

        loginButton = new JButton("Login");
        f.add(loginButton);

        resetButton = new JButton("Reset");
        f.add(resetButton);

        f.setSize(300,300);
        f.setVisible(true);

    }
    public static void main(String[] args) throws Exception{
        new gridlayout();
    }
    }
    

