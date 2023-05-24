 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.pkg10_bse203022_bse203169_bse203100_a3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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
        JPanel panel1,panel2;
        public Doctor_Details()
        {
            try
            {
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800,800);
            frame.setLocationRelativeTo(null);
            
            
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
            
            DocId = new JTextField(15);
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
            
            panel1 = new JPanel();
            panel1.setSize(500, 800);
           
            panel1.add(LabelId);
            panel1.add(DocId);
            
            panel1.add(Labelname);
            panel1.add(FullName);
            
            panel1.add(Labelfather);
            panel1.add(FatherName);
            
            panel1.add(Labelemail);
            panel1.add(Email);
            
            panel1.add(Labelnumber);
            panel1.add(contact);
            
            panel1.add(Labeladdress);
            panel1.add(Address);
            
            panel1.add(Labelqualification);
            panel1.add(Qualif);
            
            panel1.add(Labelgender);
            panel1.add(genderData);
            
            panel1.add(LabelbloodGroup);
            panel1.add(bloodData);
            
            panel1.add(LabelDateOfJoining);
            panel1.add(Joining);
            panel1.add(LabeldatePatt);
            
            frame.add(panel1,BorderLayout.CENTER);
            frame.setVisible(true);
            }catch(Exception e)
            {
                System.out.print(e.getMessage());
            }
           }
        
}
