package org.pizaini.javalanjut.gui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class RunFormBiodata {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }

        URL url = RunFormBiodata.class.getResource("/icon.png");

        ImageIcon icon = null;
        if (url != null) {
            icon = new ImageIcon(url.getPath());
        }

        JFrame jFrame = new JFrame("Form Biodata");
        jFrame.setIconImage(icon.getImage());
        jFrame.setContentPane(new FormBiodata().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
    }
}
