/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.pkg10_bse203022_bse203169_bse203100_a3;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

/**
 *
 * @author Osaf Ahmed
 */
public class DAO_for_PatientUpdateOrDelete {
      public void PatientUpdateOrDeleteInsert(String PatientID,String PatentName,String Gender,String BloodGroup,String Disease,String RoomNo,String DoctorId,String DoctorName,String DischargeDate, String AdmintDate, String RoomNumber, String NoOfDetails, String TotalRoomCharges, int ServiceCharges, String BillDate, String PaymentMode, int TotalCharges, String BillNumber)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            Statement st = con.createStatement();
            String query = "INSERT INTO `patientupdateordelete`(`PatientID`, `PatentName`, `Gender`, `BloodGroup`, `Disease`, `RoomNo`, `DoctorId`, `DoctorName`, `DischargeDate`, `AdmintDate`, `RoomNumber`, `NoOfDetails`, `TotalRoomCharges`, `ServiceCharges`, `BillDate`, `PaymentMode`, `TotalCharges`, `BillNumber`)"
                            +"Values('"+PatientID+"','"+PatentName+"','"+Gender+"','"+BloodGroup+"','"+Disease+"','"+RoomNo+"','"+DoctorId+"','"+DoctorName+"','"+BloodGroup+"','"+DischargeDate+"','"+AdmintDate+"','"+RoomNumber+"','"+NoOfDetails+"','"+TotalRoomCharges+"','"+ServiceCharges+"','"+BillDate+"','"+PaymentMode+"','"+TotalCharges+"','"+BillNumber+"')";
            
            if(JOptionPane.showConfirmDialog(null, "Do You sure to Update Yur Details", "Update form", JOptionPane.YES_OPTION) == JOptionPane.YES_NO_OPTION) 
            {
                JOptionPane.showMessageDialog(null, "Sucessfully Update");
                st.executeUpdate(query);
            }    
            else
            {
                JOptionPane.showMessageDialog(null, "fail Update");
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            e.getMessage();
        }
        
    }
     public List<PatientUpdateOrDelete> PatientUpdateOrDeleteGetData()
     {
         List<PatientUpdateOrDelete> getCollection = new ArrayList();
         
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            String query = "select PatientID, PatentName ,ServiceCharges from patientupdateordelete";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                String id = rs.getString("PatientID");
                String name = rs.getString("PatentName");
                int Service = rs.getInt("ServiceCharges");

                PatientUpdateOrDelete data = new PatientUpdateOrDelete();
                data.PatientUpdateOrDeleteOfID(id);
                data.PatientUpdateOrDeleteOfName(name);
                data.PatientUpdateOrDeleteOfService(Service);
                getCollection.add(data); 
                return getCollection;
                
            }
        }catch(Exception e){e.getMessage();}
         
          return getCollection;
     }
      
}
