package lu7bugs;

import javax.swing.*;
import java.awt.event.*;

public class LU7Bugs implements ActionListener {
    JFrame frame1 = new JFrame("Log In");
    JLabel label1, label2;
    JTextField t1, t2;
    JButton b1;

    LU7Bugs() {
        // Initialize components
        label1 = new JLabel("User Name");
        label2 = new JLabel("Password");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("OK");

        // Configure frame
        frame1.setSize(300, 200);
        frame1.setLayout(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set component bounds
        label1.setBounds(10, 30, 100, 30);
        t1.setBounds(120, 30, 150, 30);
        label2.setBounds(10, 70, 100, 30);
        t2.setBounds(120, 70, 150, 30);
        b1.setBounds(100, 120, 100, 30);

        // Add components to frame
        frame1.getContentPane().add(label1);
        frame1.getContentPane().add(t1);
        frame1.getContentPane().add(label2);
        frame1.getContentPane().add(t2);
        frame1.getContentPane().add(b1);

        // Add action listener
        b1.addActionListener(this);

        // Set frame properties
        frame1.setLocationRelativeTo(null); // Center the frame
        frame1.setVisible(true);
    }
    
    public class Secon_JFrame extends JFrame {

    public Secon_JFrame() {
        // Set the title of the new frame
        super("Second Frame");
        
        // Set the size of the frame
        setSize(300, 200);
        
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set layout (optional, you can customize further)
        setLayout(null);
        
        // Make the frame visible
        setVisible(true);
        
        // Center the frame on the screen
        setLocationRelativeTo(null);
    }
}

    @Override
    public void actionPerformed(ActionEvent e) {
        frame1.dispose();

        // Assuming Secon_JFrame is another frame class you have defined elsewhere
        Secon_JFrame plne2 = new Secon_JFrame();
    }

    public static void main(String[] args) {
        LU7Bugs plne1 = new LU7Bugs();
    }
}
