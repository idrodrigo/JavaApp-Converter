package org.rho.converter.views;

import javax.swing.*;
import java.awt.*;

public class Sidebar extends JPanel {
    private SectionBtn currencyBtn;
    private SectionBtn tempBtn;
    private SectionBtn dataBtn;
    private SectionBtn weightBtn;
    private SectionBtn lengthBtn;
    private SectionBtn cryptoBtn;

    public Sidebar(App app) {
        setBackground(new Color(255, 255, 255));
        setBounds(0, 0, 222, 472);
        setLayout(null);

        JPanel parent = app.getMain();
        add(currencyBtn = new SectionBtn("Currency", 100, app.getCurrencyView(), parent));
        add(tempBtn = new SectionBtn("Temperature", 160, new TempView(), parent));
        add(dataBtn = new SectionBtn("Data", 220, new DataView(), parent));
        add(weightBtn = new SectionBtn("Weight", 280, new WeightView(), parent));
        add(lengthBtn = new SectionBtn("Length", 340, new LengthView(), parent));
        add(cryptoBtn = new SectionBtn("Crypto", 400, new CryptoView(), parent));

        JLabel lblNewLabel = new JLabel("Converter");
        lblNewLabel.setIcon(new ImageIcon(Sidebar.class.getResource("/assets/icon2.png")));
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 26));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(6, 32, 210, 50);
        add(lblNewLabel);
    }
}
