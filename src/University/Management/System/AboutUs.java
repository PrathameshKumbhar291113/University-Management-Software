package University.Management.System;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{
	
	private JPanel contentPane;

    public static void main(String[] args) {
        new AboutUs().setVisible(true);			
    }
    public AboutUs(){ 
        
        super("About Us - Princeton University");
        setBackground(new Color(173, 216, 230));
        setBounds(500, 250, 700, 500);
	
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("New label");
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/uni.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(250, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(400, 40, 250, 200);
        contentPane.add(l1);


        JLabel l3 = new JLabel("Princeton");
        l3.setForeground(new Color(0, 250, 154));
        l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l3.setBounds(140, 40, 200, 55);
        contentPane.add(l3);

        JLabel l4 = new JLabel("University");
        l4.setForeground(new Color(127, 255, 0));
        l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l4.setBounds(70, 90, 405, 40);
        contentPane.add(l4);

        JLabel l7 = new JLabel("Address : New Jersey , United States of America .");
        l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l7.setBounds(70, 260, 600, 34);
        contentPane.add(l7);

        JLabel l8 = new JLabel("Contact : PrincetonUniversity@gmail.com");
        l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l8.setBounds(70, 290, 600, 34);
        contentPane.add(l8);

        JLabel l9 = new JLabel("For further more details contact to the office ,");
        l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
        l9.setBounds(70, 320, 600, 34);
        contentPane.add(l9);
       
        JLabel l5 = new JLabel("timing of the office - 8:00 A.M to 5:00 P.M .");
        l5.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
        l5.setBounds(70, 350, 600, 34);
        contentPane.add(l5);
        

        JLabel l10 = new JLabel("Phone - +1 893632273");
        l10.setForeground(new Color(47, 79, 79));
        l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
        l10.setBounds(70, 380, 600, 34);
        contentPane.add(l10);
            
            
        contentPane.setBackground(Color.WHITE);
    }
}
