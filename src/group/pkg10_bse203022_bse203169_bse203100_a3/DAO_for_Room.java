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
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Saqi
 */
public class DAO_for_Room {
    
    public void insertDataIntoRoom(String RoomNumber,String RoomType,String RoomChange)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            Statement st = con.createStatement();
            String query = "INSERT INTO roomdetails(RoomNumber, RoomType, RoomChange)"
                            +"Values('"+RoomNumber+"','"+RoomType+"','"+RoomChange+"')";
            
            if(JOptionPane.showConfirmDialog(null, "Do You sure to Add Room", "Update form", JOptionPane.YES_OPTION) == JOptionPane.YES_NO_OPTION) 
            {
                JOptionPane.showMessageDialog(null, "Sucessfully added");
                st.executeUpdate(query);
            }    
            else
            {
                JOptionPane.showMessageDialog(null, "fail add");
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e){}
    }
    public void DeleteRowIntoRoom(String Value)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            
            String query = "DELETE FROM roomdetails WHERE RoomNumber = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Value);
            pst.executeUpdate();
            
        }catch(ClassNotFoundException | SQLException| ArrayIndexOutOfBoundsException e){e.getMessage();}
    }
     public List<RoomInformation> ShowDataIntoRoom()
    {
        List<RoomInformation> data = new ArrayList<>();
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            String query = "select * from roomdetails";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                String number = rs.getString("RoomNumber");
                String type = rs.getString("RoomType");
                String change = rs.getString("RoomChange");

                RoomInformation getdata = new RoomInformation();
                getdata.roomname(number);
                getdata.roomtype(type);
                getdata.roomchange(change);
                data.add(getdata); 
                return  data;
                
            }
            
        }catch(ClassNotFoundException | SQLException| ArrayIndexOutOfBoundsException e){e.getMessage();}
        return data;
    }
    
}
