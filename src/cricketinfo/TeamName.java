/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketinfo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TeamName extends JFrame {

    private ImageIcon icon;
    private Container c;
     private ImageIcon img;
    private JLabel imglabel;
    private JLabel textlabel,textlabel1;
    private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11;
    private Font f,f1;
   

    TeamName() {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        initComponents1();
        initComponents2();
        initComponents3();
     
        
    }
    public void initComponents()
    {
         c = this.getContentPane();
        c.setBackground(Color.white);
        icon= new ImageIcon(getClass().getResource("images-1.png"));
        this.setIconImage(icon.getImage());
    }
    
   
     
     public void initComponents1() {

      c = this.getContentPane();
      c.setLayout(null);
        
      f=new Font("Arial",Font.BOLD, 33);
         textlabel = new JLabel();
         textlabel.setText("TEAM NAME");
         textlabel.setForeground(Color.WHITE);
         textlabel.setBounds(580,60,500,100);
         textlabel.setFont(f);
         c.add(textlabel);
         f1=new Font("Arial",Font.ITALIC,20);
         textlabel1 = new JLabel();
         textlabel1.setText("**Select Team Name to find Players Stats");
         textlabel1.setForeground(Color.WHITE);
         textlabel1.setBounds(50,30,1000,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         
    }
     public void initComponents2() {

     
        
         bt1=new JButton();
         bt1.setText("Australia");
         bt1.setBounds(580,150,200,40);
         c.add(bt1);
         bt1.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Australiapl f1=new Australiapl();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt2=new JButton();
         bt2.setText("Afghanistan");
         bt2.setBounds(580,200,200,40);
         c.add(bt2);
         bt2.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Afgpl f1=new Afgpl();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
         
         bt3=new JButton();
         bt3.setText("Bangladesh");
         bt3.setBounds(580,250,200,40);
         c.add(bt3);
         bt3.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                banpl f1=new banpl();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt4=new JButton();
         bt4.setText("England");
         bt4.setBounds(580,300,200,40);
         c.add(bt4);
         bt4.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                engpl f1=new engpl();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt5=new JButton();
         bt5.setText("India");
         bt5.setBounds(580,350,200,40);
         c.add(bt5);
         bt5.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Indpl f1=new Indpl();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt6=new JButton();
         bt6.setText("New Zealand");
         bt6.setBounds(580,400,200,40);
         c.add(bt6);
         bt6.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Nzpl f1=new Nzpl();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt7=new JButton();
         bt7.setText("Pakistan");
         bt7.setBounds(580,450,200,40);
         c.add(bt7);
         bt7.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                pakpl f1=new pakpl();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt8=new JButton();
         bt8.setText("Sri Lanka");
         bt8.setBounds(580,500,200,40);
         c.add(bt8);
         bt8.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                slpl f1=new slpl();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt9=new JButton();
         bt9.setText("South Africa");
         bt9.setBounds(580,550,200,40);
         c.add(bt9);
         bt9.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                sapl f1=new sapl();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt10=new JButton();
         bt10.setText("West Indies");
         bt10.setBounds(580,600,200,40);
         c.add(bt10);
         bt10.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                wipl f1=new wipl();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt11=new JButton();
         bt11.setText("Back");
         bt11.setBounds(250,610,80,40);
         c.add(bt11);
         bt11.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                FrameDemo1 f1=new FrameDemo1();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
     }
     
      public void initComponents3() {

        img = new ImageIcon(getClass().getResource("tn3.jpg"));
        JLabel imgLabel = new JLabel(img);
        imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        c.add(imgLabel);
        
        

    }
   
        
    public static void main(String[] args) {
        TeamName frame1 = new TeamName();
      

        frame1.setBounds(0,0,1380,730);
        frame1.setTitle("CricketInfo");
        frame1.setResizable(false);
        
          frame1.setVisible(true);
        
     }  
}