/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaform;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JavaUi{
    public static void createUI(){

    }
}


public class JavaForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Form app");

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        // Create labels and text fields
        JLabel numberLabel = new JLabel("Number:");
        JTextField numberField = new JTextField(15);

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(15);

        JButton submitButton = new JButton("Submit");

        // Add action listener to the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve the text from the fields
                String number = numberField.getText();
                String username = usernameField.getText();
                String email = emailField.getText();

                // Print the inputs
                System.out.println("Number: " + number);
                System.out.println("Username: " + username);
                System.out.println("Email: " + email);
            }
        });

        // Add content to the panel
        panel.add(numberLabel);
        panel.add(numberField);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(new JLabel());  // empty cell for layout
        panel.add(submitButton);

        // Add the panel to the frame
        frame.add(panel);

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
    }
    
}
