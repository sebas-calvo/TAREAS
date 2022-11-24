/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_03_1.vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sebas
 */
public class Ventana_tarea1 extends JFrame {

    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;

    public Ventana_tarea1(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarPanels() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.lightGray);
        this.jPanelList.get(1).setBackground(Color.BLACK);
        this.jPanelList.get(2).setBackground(Color.BLUE);
        this.jPanelList.get(3).setBackground(Color.CYAN);
        this.jPanelList.get(4).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(5).setBackground(Color.MAGENTA);
        this.jPanelList.get(6).setBackground(Color.YELLOW);

        this.jPanelList.get(0).setLayout(new GridLayout(3,1));
        this.jPanelList.get(1).setLayout(new GridLayout(1,1));
        this.jPanelList.get(2).setLayout(new GridLayout(1,3));
        this.jPanelList.get(6).setLayout(new GridLayout(1,1));
        
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        
        this.jPanelList.get(2).add(this.jPanelList.get(3));
        this.jPanelList.get(2).add(this.jPanelList.get(4));
        this.jPanelList.get(2).add(this.jPanelList.get(5));
        
        
    }
    
    public void iniciarJTextFields(){
        this.jLabelList = new ArrayList<>();
        
        this.jLabelList.add(new JLabel("Button 1"));
        this.jLabelList.add(new JLabel("Button 3"));
        this.jLabelList.add(new JLabel("2"));
        this.jLabelList.add(new JLabel("Button 5"));
        this.jLabelList.add(new JLabel("Long-named Button 4"));
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(3).add(this.jLabelList.get(1));
        this.jPanelList.get(4).add(this.jLabelList.get(2));
        this.jPanelList.get(5).add(this.jLabelList.get(3));
        this.jPanelList.get(6).add(this.jLabelList.get(4));
        
        
        
    }
}
