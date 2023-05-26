/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.pkg10_bse203022_bse203169_bse203100_a3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Osaf Ahmed
 */
public class DAO_for_LoginPage {
    public boolean LoginAccess(String username,String password)
    {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            Statement st= con.createStatement();
             String sql = "Select * from signup where username='"+username+"' AND password='"+password+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                 JOptionPane.showMessageDialog(null, "Login Sucessfully");
                 return true;
            }
        }catch(Exception e)
        {
           throw new RuntimeException(e);
        }
         return false;
    }
    
}
