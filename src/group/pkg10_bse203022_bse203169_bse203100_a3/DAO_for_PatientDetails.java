/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.pkg10_bse203022_bse203169_bse203100_a3;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Osaf Ahmed
 */
public class DAO_for_PatientDetails {
    
   public void PatientDetailsInsert(String PatientID,String PatientName,String FatherName,String Email,int ContactNo,String Address,int Age,String Gender,String BloodGroup,String Infromation)
   {
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            Statement st = con.createStatement();
            String query = "Insert into patientdetails(PatientID,PatientName,FatherName,Email,ContactNo,Address,Age,Gender,BloodGroup,Infromation)"
                            +"Values('"+PatientID+"','"+PatientName+"','"+FatherName+"','"+Email+"','"+ContactNo+"','"+Address+"','"+Age+"','"+Gender+"','"+BloodGroup+"','"+Infromation+"')";
            
            if(JOptionPane.showConfirmDialog(null, "Do You sure to register Yur Details", "Registratoin form", JOptionPane.YES_OPTION) == JOptionPane.YES_NO_OPTION) 
            {
                JOptionPane.showMessageDialog(null, "Sucessfully Register");
                st.executeUpdate(query);
            }    
            else
            {
                JOptionPane.showMessageDialog(null, "fail Register");
            }
           
       }catch(Exception e)
       {
           e.getMessage();
       }
       
   }
}
