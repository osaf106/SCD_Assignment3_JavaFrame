/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.pkg10_bse203022_bse203169_bse203100_a3;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Osaf Ahmed
 */
public class DAO_for_signup{
    
    public void SignupDetailsAndCOnnections(String name,String email,String username,String password,String Repassword)
    {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            Statement st= con.createStatement();
            if(JOptionPane.showConfirmDialog(null, "Do You sure to register", "Registratoin form", JOptionPane.YES_OPTION) == JOptionPane.YES_NO_OPTION) {
                           JOptionPane.showMessageDialog(null, "Sucessfully Register");
                           
                            st.executeUpdate("insert into signup(Name,Email,Username,Password,RePassword)"
                        + "Values('"+name+"','"+email+"','"+username+"','"+password+"','"+Repassword+"')");
                       } else {
                           JOptionPane.showMessageDialog(null, "Sucessfuuly Stop Register");
                       }
            
        }catch(Exception e)
        {
           throw new RuntimeException(e);
        }
    }
    
    public static void main(String []Args)
    {
        
    }
    
}
