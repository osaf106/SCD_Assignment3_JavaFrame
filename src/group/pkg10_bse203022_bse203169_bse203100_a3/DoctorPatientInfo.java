/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.pkg10_bse203022_bse203169_bse203100_a3;

/**
 *
 * @author danish
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoctorPatientInfo extends JFrame {
    private DefaultTableModel doctorTableModel;
    private DefaultTableModel patientTableModel;
    private JTable doctorTable;
    private JTable patientTable;
    private JTextField patientIDField;
    private JTextField patientNameField;
    private JTextField genderField;
    private JTextField bloodGroupField;
    private JTextField diseaseField;
    private JTextField admitDateField;
    private JTextField roomNoField;
    private JTextField doctorIDField;
    private JTextField doctorNameField;
    private JTextField remarksField;
    private JButton newButton;
    private JButton saveButton;
    private JButton deleteButton;
    private JButton updateButton;
    private JButton getDataButton;

    public DoctorPatientInfo() {
        setTitle("Doctor Patient App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel(new GridLayout(10, 2));
        panel1.setBorder(BorderFactory.createTitledBorder("Patient Info"));

        panel1.add(new JLabel("Patient ID:"));
        patientIDField = new JTextField();
        panel1.add(patientIDField);

        panel1.add(new JLabel("Patient Name:"));
        patientNameField = new JTextField();
        panel1.add(patientNameField);

        panel1.add(new JLabel("Gender:"));
        genderField = new JTextField();
        panel1.add(genderField);

        panel1.add(new JLabel("Blood Group:"));
        bloodGroupField = new JTextField();
        panel1.add(bloodGroupField);

        panel1.add(new JLabel("Disease:"));
        diseaseField = new JTextField();
        panel1.add(diseaseField);

        panel1.add(new JLabel("Admit Date:"));
        admitDateField = new JTextField();
        panel1.add(admitDateField);

        panel1.add(new JLabel("Room No:"));
        roomNoField = new JTextField();
        panel1.add(roomNoField);

        panel1.add(new JLabel("Doctor ID:"));
        doctorIDField = new JTextField();
        panel1.add(doctorIDField);

        panel1.add(new JLabel("Doctor Name:"));
        doctorNameField = new JTextField();
        panel1.add(doctorNameField);

        panel1.add(new JLabel("Remarks:"));
        remarksField = new JTextField();
        panel1.add(remarksField);

        JPanel panel2 = new JPanel(new GridLayout(5, 1));
        panel2.setBorder(BorderFactory.createTitledBorder(""));

        newButton = new JButton("New");
        panel2.add(newButton);

        saveButton = new JButton("Save");
        panel2.add(saveButton);

        deleteButton = new JButton("Delete");
        panel2.add(deleteButton);

        updateButton = new JButton("Update");
        panel2.add(updateButton);

        getDataButton = new JButton("Get Data");
        panel2.add(getDataButton);

        JPanel panel3 = new JPanel();
        panel3.setBorder(BorderFactory.createTitledBorder(""));
        panel3.setPreferredSize(new Dimension(200, 100));
        doctorTable = new JTable();
        doctorTable.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Doctor ID", "Doctor Name"}
        ));
        JScrollPane doctorScrollPane = new JScrollPane(doctorTable);
        doctorScrollPane.setPreferredSize(new Dimension(180, 80));
        panel3.add(doctorScrollPane);

        JPanel panel4 = new JPanel();
        panel4.setBorder(BorderFactory.createTitledBorder(""));
        panel4.setPreferredSize(new Dimension(300, 100));
        patientTable = new JTable();
        patientTable.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Patient ID", "Patient Name", "Gender", "Blood Group"}
        ));
        JScrollPane patientScrollPane = new JScrollPane(patientTable);
        patientScrollPane.setPreferredSize(new Dimension(280, 80));
        panel4.add(patientScrollPane);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);

        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveData();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteData();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateData();
            }
        });

        getDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayData();
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    private void clearFields() {
        patientIDField.setText("");
        patientNameField.setText("");
        genderField.setText("");
        bloodGroupField.setText("");
        diseaseField.setText("");
        admitDateField.setText("");
        roomNoField.setText("");
        doctorIDField.setText("");
        doctorNameField.setText("");
        remarksField.setText("");
    }

    private void saveData() {
        String patientID = patientIDField.getText();
        String patientName = patientNameField.getText();
        String gender = genderField.getText();
        String bloodGroup = bloodGroupField.getText();
        String doctorID = doctorIDField.getText();
        String doctorName = doctorNameField.getText();

        DefaultTableModel patientModel = (DefaultTableModel) patientTable.getModel();
        patientModel.addRow(new Object[]{patientID, patientName, gender, bloodGroup});

        DefaultTableModel doctorModel = (DefaultTableModel) doctorTable.getModel();
        doctorModel.addRow(new Object[]{doctorID, doctorName});
    }

    private void deleteData() {
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
            model.removeRow(selectedRow);
        }
    }

    private void updateData() {
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow != -1) {
            String patientID = patientIDField.getText();
            String patientName = patientNameField.getText();
            String gender = genderField.getText();
            String bloodGroup = bloodGroupField.getText();

            DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
            model.setValueAt(patientID, selectedRow, 0);
            model.setValueAt(patientName, selectedRow, 1);
            model.setValueAt(gender, selectedRow, 2);
            model.setValueAt(bloodGroup, selectedRow, 3);
        }
    }

    private void displayData() {
        DefaultTableModel patientTableModel = (DefaultTableModel) patientTable.getModel();
        int rowCount = patientTableModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            String patientID = patientTableModel.getValueAt(i, 0).toString();
            String patientName = patientTableModel.getValueAt(i, 1).toString();
            String gender = patientTableModel.getValueAt(i, 2).toString();
            String bloodGroup = patientTableModel.getValueAt(i, 3).toString();
            System.out.println("Patient ID: " + patientID + ", Patient Name: " + patientName
                    + ", Gender: " + gender + ", Blood Group: " + bloodGroup);
        }

        DefaultTableModel doctorTableModel = (DefaultTableModel) doctorTable.getModel();
        int doctorRowCount = doctorTableModel.getRowCount();
        for (int i = 0; i < doctorRowCount; i++) {
            String doctorID = doctorTableModel.getValueAt(i, 0).toString();
            String doctorName = doctorTableModel.getValueAt(i, 1).toString();
            System.out.println("Doctor ID: " + doctorID + ", Doctor Name: " + doctorName);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DoctorPatientInfo().setVisible(true);
            }
        });
    }
}
