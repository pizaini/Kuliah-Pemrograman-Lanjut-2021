package org.pizaini.javalanjut.gui.table;

import org.pizaini.javalanjut.gui.FormBiodata;
import org.pizaini.javalanjut.gui.RunFormBiodata;

import javax.swing.*;
import java.net.URL;

public class RunExampleTable1 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        /**
         * Set image icon
         */
        ImageIcon imageIcon = new ImageIcon("res/icon.png");
        JFrame jFrame = new JFrame("Form Biodata with Table");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new ExampleTable1().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
