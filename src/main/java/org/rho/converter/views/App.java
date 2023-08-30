package org.rho.converter.views;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Currency;

public class App extends JFrame {
    private JPanel contentPane;
    private JPanel main;
    private  Sidebar sidebar;
    private CurrencyView currencyView;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    App frame = new App();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public App() {
        setTitle("Rho Converter");
        initializeUI();
    }

    private void initializeUI() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 800, 500);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/assets/icon2.png")));

        contentPane = new JPanel();
        contentPane.setBackground(UIManager.getColor("Button.highlight"));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        main = new JPanel();
        main.setBackground(UIManager.getColor("Button.highlight"));
        main.setBounds(222, 0, 579, 472);
        contentPane.add(main);
        main.setLayout(null);
        setMain(main);

        setCurrencyView(new CurrencyView());

        sidebar = new Sidebar(this);
        sidebar.setBackground(UIManager.getColor("Button.highlight"));
        contentPane.add(sidebar);
    }

    public CurrencyView getCurrencyView() {
        return this.currencyView;
    }
    public void setCurrencyView(CurrencyView currencyView) {
        this.currencyView = currencyView;
    }
    public JPanel getMain() {
        return this.main;
    }
    public void setMain(JPanel main) {
        this.main = main;
    }
}
