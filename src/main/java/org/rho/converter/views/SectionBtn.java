package org.rho.converter.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SectionBtn extends JButton {
    private String name;
    public SectionBtn(String name, int y, Section section, JPanel parent) {
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setForeground(new Color(0,0,255));
        setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
        setBorderPainted(false);
        this.name = name;
        setText(getName());
        setBounds(6, y, 210, 50);
        setBackground(UIManager.getColor("Button.highlight"));

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeSection(section, parent);
            }
        });
    }
    public String getName() {
        return this.name;
    }
    private void changeSection(Section section, JPanel parent) {
        parent.removeAll();
        parent.add(section);
        parent.revalidate();
        parent.repaint();
    }
}
