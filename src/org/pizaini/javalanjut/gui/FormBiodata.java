package org.pizaini.javalanjut.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelHasil;

    public FormBiodata() {
        buttonSave.addActionListener(e -> {
            //Mengambil data dari textNama
            String nama = textNama.getText();
            //Mengambil data dari textNim
            String nim = textNim.getText();
            //Diproses
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNama(nama);
            mhs.setNim(nim);
            //Tampilkan output ke FORM
            labelHasil.setText(mhs.toString());
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
