
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umme Habiba
 */

    import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class New_Employee extends JFrame implements ActionListener{
    // seven label 
    // 1. Name
    //2.Gender as a choice
    //3. Address
    //4.State
    //5.City
    //6.Email
    //7.Phone
    JLabel l1,l2,l3,l4,l5,l6,l7;// 7 label
    JTextField t1,t2,t3,t4,t5,t6,t7;// 7 seven text fiels
    JButton b1,b2;// two buttons for submit and canceal
    Choice c1;// choice for gender
    
    New_Employee(){
        
        super("New Employee");
        
        setSize(600,650);
        setLocation(600,200);
        getContentPane().setBackground(Color.WHITE); // make background
        
        JPanel p1= new JPanel();
        p1.setBackground(Color.WHITE);
      
        p1.setLayout(new GridLayout(8,2,10,40)); // in full frame 8 rows ,2 columns
        l1 = new JLabel("Name");
        t1 = new JTextField(15);
        p1.add(l1); // add in pannel
        p1.add(t1);
       
        c1 = new Choice();
        c1.add("Male");
        c1.add("Female");
       
        l2 = new JLabel("Gender");
        p1.add(l2);
        p1.add(c1);
        l3 = new JLabel("Address");
        t3 = new JTextField(15);
        p1.add(l3);
        p1.add(t3);
        l4 = new JLabel("State");
        t4 = new JTextField(15);
        p1.add(l4);
        p1.add(t4); 
        l5 = new JLabel("City");
        t5 = new JTextField(15);
        p1.add(l5);
        p1.add(t5);
        l6 = new JLabel("Email");
        t6 = new JTextField(15);
        p1.add(l6);
        p1.add(t6);
        l7 = new JLabel("Phone");
        t7= new JTextField(15);
        p1.add(l7);
        p1.add(t7);
        b1 =new JButton("Submit");
        b2 = new JButton("Cancel");
        p1.add(b1);
        p1.add(b2);
       
        
       
        // for submit button
        b1.addActionListener(this);
        // make button background black
        b1.setBackground(Color.BLACK);
        // make font colour white
        b1.setForeground(Color.WHITE);
        // make canceal button
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
       
       public static void main(String[] args){
        new New_Employee();
    }
    
    }
    

    

