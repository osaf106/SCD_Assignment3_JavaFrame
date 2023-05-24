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
public class Doctor_Details {
        JFrame frame = new JFrame("Doctor Details");
        JLabel title = new JLabel();
        JLabel LabelId,Labelname,Labelfather,Labelemail,Labelnumber,Labeladdress,Labelqualification,Labelgender,LabelbloodGroup,LabelDateOfJoining,LabeldatePatt;
        JTextField DocId,FullName,FatherName,Email,contact,Address,Qualif,Joining;
        JComboBox genderData,bloodData;
        JButton save,update,delete,New,GetData;
        
        public Doctor_Details()
        {
            
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 550);
            frame.setLocationRelativeTo(null);
             frame.setResizable(false);
            
            
            
            LabelId = new JLabel();
            Labelname = new JLabel();
            Labelfather = new JLabel();
            Labelemail = new JLabel();
            Labelnumber = new JLabel();
            Labeladdress = new JLabel();
            Labelqualification = new JLabel();
            Labelgender = new JLabel();
            LabelbloodGroup = new JLabel();
            LabelDateOfJoining = new JLabel();
            LabeldatePatt = new JLabel();
            
            LabelId.setText("Doctor ID");
            LabelId.setBounds(20, 20, 80, 25);
            
            Labelname.setText("Full Name");
            Labelfather.setText("Father's Name");
            Labelemail.setText("Email-id");
            Labelnumber.setText("Contact no");
            Labeladdress.setText("Address");
            Labelqualification.setText("Qualification");
            Labelgender.setText("Gender");
            LabelbloodGroup.setText("Blood Group");
            LabelDateOfJoining.setText("Date Of Joining");
            LabeldatePatt.setText("YYYY-MM-DD");
            
            DocId = new JTextField();
            DocId.setBounds(140, 20, 200, 25);
            FullName = new JTextField(15);
            FatherName = new JTextField(15);
            Email = new JTextField(15);
            contact = new JTextField(15);
            Address = new JTextField(15);
            Qualif = new JTextField(15);
            Joining = new JTextField(15);
            
            genderData = new JComboBox();
            genderData.addItem("M");
            genderData.addItem("F");
            genderData.addItem("O");
            
            bloodData = new JComboBox();
            bloodData.addItem("A+");
            bloodData.addItem("A-");
            bloodData.addItem("B+");
            bloodData.addItem("B-");
            bloodData.addItem("AB+");
            bloodData.addItem("AB-");
            bloodData.addItem("O+");
            bloodData.addItem("O-");
            
            
            
            save= new JButton("Save");
            update = new JButton("Update");
            delete = new JButton("Delete");
            New = new JButton("New");
            GetData = new JButton("GetData");
            
            frame.getContentPane().setLayout(null);
            frame.getContentPane().add(LabelId);
            frame.getContentPane().add(DocId);
            frame.setVisible(true);
            
           }
        
}
