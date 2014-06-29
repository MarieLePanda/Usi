/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swingtrain;

import java.awt.GridBagConstraints;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author MKSJ
 */
public class MyFrame extends JFrame{
    
    private JPanel menuLeft;
    private JButton button;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPlus, buttonMoins, buttonDiv, buttonMult, buttonEg;
    private JPanel myJPanel;
    
    
    public MyFrame(){
        GridBagConstraints layout = new GridBagConstraints();
        myJPanel = new JPanel();
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonDiv = new JButton("/");
        buttonEg = new JButton("=");
        buttonMoins = new JButton("-");
        buttonMult = new JButton("*");
        buttonPlus = new JButton("+");
        
        this.add(myJPanel);
        //myJPanel.ad

    }
}
