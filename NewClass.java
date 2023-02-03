
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public abstract class NewClass extends JFrame implements ActionListener {
    JLabel l1;
    JTextField t1;
    NewClass ()
    {
        super("New Employee");
        
        setSize(600,650);
        setLocation(600,200);
        getContentPane().setBackground(Color.WHITE); // make background
        
        JPanel p1= new JPanel();
        p1.setBackground(Color.WHITE);
      
    
    
    
     l1 = new JLabel("HRA");
        t1 = new JTextField(15);
        add(l1);
        add(t1);
    
}
    public static void main(String s[]){
     
}
}