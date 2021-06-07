package org.pizaini.javalanjut.gui.sort;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class ExampleSorting {
    private JTextField textField1;
    private JButton button1;
    private JTable tableData;
    private JPanel rootPanel;
    private DefaultTableModel tableModel;

    public ExampleSorting(){
        createUIComponents();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableModel.addRow(new Object[]{"sdsfsfsf", "sdfsffsfffffff"});
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createUIComponents() {
        String[] tableCol = {"Nama", "Email"};
        Object[][] initData = {
                {"Budi", "budi@domain.com"},
                {"Budi2", "budi2@domain.com"},
                {"Budi3", "budi3@domain.com"},
        };
        tableModel = new DefaultTableModel(initData, tableCol);
        tableData.setModel(tableModel);
        tableData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableData.setAutoCreateRowSorter(true);
        tableData.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int rowIndex = tableData.getSelectedRow();
                if(rowIndex < 0){
                    JOptionPane.showMessageDialog(rootPanel, "No selected data");
                }else{
                    Object col1 = tableModel.getValueAt(rowIndex, 0);
                    Object col2 = tableModel.getValueAt(rowIndex, 1);
                    System.out.println(col1.toString()+"=="+col2.toString());
                }
            }
        });
    }
}
