/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.pkg10_bse203022_bse203169_bse203100_a3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Osaf Ahmed
 */
public class DAO_for_Room {
    
    public void insertDataIntoRoom(String RoomNumber,String RoomType,String RoomChange)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            Statement st = con.createStatement();
            String query = "INSERT INTO patientupdateordelete(RoomNumber, RoomNumber, RoomNumber)"
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
        }catch(Exception e){}
    }
    
}
