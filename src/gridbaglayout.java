//create simple login form using GRidBagLayout in java
import java.awt.*;
import javax.swing.*;


public class gridbaglayout {
    private JFrame f;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton LoginButton;
    private JButton resetButton;
    gridbaglayout(){
        f = new JFrame();
        f. setTitle("Login Form");
        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill =GridBagConstraints.HORIZONTAL;
    
        userLabel = new JLabel("UserName");
        gbc.gridx = 0;
        gbc.gridy = 0;
        f.add(userLabel,gbc);
    
        userText = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        f.add(userText,gbc);
    
        passwordLabel = new JLabel("Password");
        gbc.gridx = 0;
        gbc.gridy = 1;
        f.add(passwordLabel,gbc);
    
        passwordText = new JPasswordField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        f.add(passwordText,gbc);

        LoginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 2;
        f.add(LoginButton,gbc);
        
        resetButton = new JButton("Reset");
        gbc.gridx = 1;
        gbc.gridy = 2;
        f.add(resetButton,gbc);

        f.setSize(300,300);
        f.setVisible(true);
    }
    public static void main(String[] args) throws Exception{
        new gridbaglayout();
    }
        
    }
    
