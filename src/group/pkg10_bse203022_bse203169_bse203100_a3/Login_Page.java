/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.pkg10_bse203022_bse203169_bse203100_a3;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Osaf Ahmed
 */
public class Login_Page {
        JFrame frame =  new JFrame("Login");
        JPanel pane = new JPanel();
        JLabel user = new JLabel();
        JLabel Pass = new JLabel();
        JTextField UserName ;
        JPasswordField Password ;
        JButton btn = new JButton();
        
        public Login_Page()
        {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400,200);
            frame.setLocationRelativeTo(null);
            
            
            user.setText("UserName");
            user.setBounds(10,50,100,20);
            user.setHorizontalAlignment(JButton.CENTER);
            
            UserName = new JTextField(25);
            UserName.setBounds(10 , 100 , 100 ,20 );
            
             
            Pass.setText("Password");
            Pass.setHorizontalAlignment(JButton.CENTER);
            
            Password = new JPasswordField(25);

            btn.setText("Login");
            btn.setHorizontalAlignment(JButton.CENTER);
            btn.setSize(30,20);
                               
            pane.add(user);
            pane.add(UserName);
            pane.add(Pass);
            pane.add(Password);
            pane.add(btn);
            
            frame.add(pane);
            frame.setVisible(true);
        
        }
     
    
}
