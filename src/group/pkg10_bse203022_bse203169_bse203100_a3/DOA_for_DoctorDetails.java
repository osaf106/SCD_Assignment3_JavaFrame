/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.pkg10_bse203022_bse203169_bse203100_a3;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Osaf Ahmed
 */
public class DOA_for_DoctorDetails {
    
    public void DoctorDetailsInsert(String DoctorID,String DoctorName,String FatherName,String Email,int ContactNo,String Address,String Qualification,String Gender,String BloodGroup,String DateOfJoining)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            Statement st = con.createStatement();
            String query = "Insert into doctor_details(DoctorID,DoctorName,FatherName,Email,ContactNo,Address,Qualification,Gender,BloodGroup,DateOfJoining)"
                            +"Values('"+DoctorID+"','"+DoctorName+"','"+FatherName+"','"+Email+"','"+ContactNo+"','"+Address+"','"+Qualification+"','"+Gender+"','"+BloodGroup+"','"+DateOfJoining+"')";
            
            if(JOptionPane.showConfirmDialog(null, "Do You sure to register Yur Details", "Registratoin form", JOptionPane.YES_OPTION) == JOptionPane.YES_NO_OPTION) 
            {
                JOptionPane.showMessageDialog(null, "Sucessfully Register");
                st.executeUpdate(query);
            }    
            else
            {
                JOptionPane.showMessageDialog(null, "fail Register");
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            e.getMessage();
        }
        
    }
    
}
