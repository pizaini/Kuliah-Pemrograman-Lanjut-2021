package org.pizaini.javalanjut.gui.table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleTable1 {
    private JPanel rootPanel;
    private JTextField textNama;
    private JTextField textEmail;
    private JTextField textHp;
    private JButton buttonSave;
    private JTable tableBiodata;
    private DefaultTableModel tableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public ExampleTable1() {
        this.initComponents();
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String email = textEmail.getText();
                String hp = textHp.getText();
                if(nama.isBlank() || email.isBlank() || hp.isBlank()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data belum lengkap",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else{
                    tableModel.addRow(new Object[]{nama, email, hp});
                    //clear textfields
                    textNama.setText("");
                    textEmail.setText("");
                    textHp.setText("");
                }
            }
        });
    }

    private void initComponents(){
        Object[] tableColom = {
                "Nama",
                "Email",
                "HP"
        };
        Object[][] initData = {
                {"Andi", "andi@email.com", "08123456789"},
                {"Budi", "budi@email.com", "08987654321"},
        };
        tableModel = new DefaultTableModel(initData, tableColom);
        //set table model
        tableBiodata.setModel(tableModel);
        //menampilkan sorting di setiap colom
        tableBiodata.setAutoCreateRowSorter(true);
        // enable single selection
        tableBiodata.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
