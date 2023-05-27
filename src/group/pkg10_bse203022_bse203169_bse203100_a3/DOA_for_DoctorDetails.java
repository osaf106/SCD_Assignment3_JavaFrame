/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.pkg10_bse203022_bse203169_bse203100_a3;

import java.awt.HeadlessException;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
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
    
    public String[] DoctorGetEachData()
    {
//        ArrayList<String> ReturnList = new ArrayList<>();
         String ReturnForTable[] = null;
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            String query = "select * from doctor_details";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                 String DoctorID = rs.getString("DoctorID");
                String DoctorName =rs.getString("DoctorName");
                String FatherName =rs.getString("FatherName");
                String Email =rs.getString("Email");
                String contactno = String.valueOf(rs.getInt("ContactNo"));
                String Address =rs.getString("Address");
                String Qualification=rs.getString("Qualification");
                String Gender =rs.getString("Gender");
                String BloodGroup =rs.getString("BloodGroup");
                String DateOfJoining=rs.getString("DateOfJoining");
                
                  ReturnForTable = new String[]{DoctorID,DoctorName,FatherName,Email,contactno,Address,Qualification,Gender,BloodGroup,DateOfJoining};
//                 ReturnList.add(DoctorID);
//                 ReturnList.add(DoctorName);
//                 ReturnList.add(FatherName);
//                 ReturnList.add(Email);
//                 ReturnList.add(contactno);
//                 ReturnList.add(Address);
//                 ReturnList.add(Qualification);
//                 ReturnList.add(Gender);
//                 ReturnList.add(BloodGroup);
//                 ReturnList.add(DateOfJoining);
//                 List add = Arrays.asList(ReturnForTable);
                 rs.next();
                
                
            }
           return ReturnForTable;
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            e.getMessage();
        }
        return ReturnForTable;
    }
    public void DeleteRow(String Value)
    {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            
            String query = "DELETE FROM doctor_details WHERE DoctorID="+Value;
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeQuery();   
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            e.getMessage();
        }
    }
}
