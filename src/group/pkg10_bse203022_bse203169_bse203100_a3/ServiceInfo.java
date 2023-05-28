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

public class ServiceInfo extends JFrame {
    private JTextField serviceNameField;
    private JTextField serviceDateField;
    private JTextField patientIDField;
    private JTextField patientNameField;
    private DefaultTableModel tableModel;

    public ServiceInfo() {
        setTitle("Service Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(800, 400));

        // Panel 1: Services Info
        JPanel panel1 = new JPanel(new GridBagLayout());
        panel1.setBorder(BorderFactory.createTitledBorder("Services Info"));
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);

        JLabel serviceNameLabel = new JLabel("Service Name:");
        serviceNameField = new JTextField(15);
        JLabel serviceDateLabel = new JLabel("Service Date:");
        serviceDateField = new JTextField(15);
        JLabel patientIDLabel = new JLabel("Patient ID:");
        patientIDField = new JTextField(15);
        JLabel patientNameLabel = new JLabel("Patient Name:");
        patientNameField = new JTextField(15);
        JLabel serviceChargesLabel = new JLabel("Service Charges:");
        JTextField serviceChargesField = new JTextField(15);

        c.gridx = 0;
        c.gridy = 0;
        panel1.add(serviceNameLabel, c);

        c.gridx = 1;
        panel1.add(serviceNameField, c);

        c.gridx = 0;
        c.gridy = 1;
        panel1.add(serviceDateLabel, c);

        c.gridx = 1;
        panel1.add(serviceDateField, c);

        c.gridx = 0;
        c.gridy = 2;
        panel1.add(patientIDLabel, c);

        c.gridx = 1;
        panel1.add(patientIDField, c);

        c.gridx = 0;
        c.gridy = 3;
        panel1.add(patientNameLabel, c);

        c.gridx = 1;
        panel1.add(patientNameField, c);

        c.gridx = 0;
        c.gridy = 4;
        panel1.add(serviceChargesLabel, c);

        c.gridx = 1;
        panel1.add(serviceChargesField, c);

        // Panel 2: Buttons
        JPanel panel2 = new JPanel(new GridBagLayout());
        panel2.setBorder(BorderFactory.createTitledBorder(""));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        JButton newButton = new JButton("New");
        JButton saveButton = new JButton("Save");
        JButton deleteButton = new JButton("Delete");
        JButton BackButton = new JButton("Back");
        JButton getDataButton = new JButton("Get Data");

        newButton.setPreferredSize(new Dimension(100, 40));
        saveButton.setPreferredSize(new Dimension(100, 40));
        deleteButton.setPreferredSize(new Dimension(100, 40));
        BackButton.setPreferredSize(new Dimension(100, 40));
        getDataButton.setPreferredSize(new Dimension(100, 40));

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String patientID = patientIDField.getText();
                String patientName = patientNameField.getText();
                tableModel.addRow(new Object[]{patientID, patientName});
            }
        });
        BackButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                ServiceInfo si = new ServiceInfo();
                MainPage mn = new MainPage();
                si.setVisible(false);
                mn.setVisible(true);
                dispose();
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel2.add(newButton, gbc);

        gbc.gridy = 1;
        panel2.add(saveButton, gbc);

        gbc.gridy = 2;
        panel2.add(deleteButton, gbc);

        gbc.gridy = 3;
        panel2.add(BackButton, gbc);

        gbc.gridy = 4;
        panel2.add(getDataButton, gbc);

        // Panel 3: Display Data
        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.setBorder(BorderFactory.createTitledBorder(""));

        JTable dataTable = new JTable();
        tableModel = new DefaultTableModel(new Object[]{"Patient ID", "Patient Name"}, 0);
        dataTable.setModel(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(dataTable);

        panel3.add(tableScrollPane, BorderLayout.CENTER);

        // Adding panels to the main frame
        add(panel1, BorderLayout.WEST);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.EAST);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ServiceInfo();
            }
        });
    }
}
