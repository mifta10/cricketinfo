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

//Team name class connected
public class TeamInfo extends JFrame {
     private ImageIcon icon4;
    private Container c4;
     private JLabel textlabel1,textlabel2;
     private Font f4;
     private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11;
     private ImageIcon img4;
    TeamInfo()
    {
        this.setDefaultCloseOperation(FrameDemo.EXIT_ON_CLOSE);
        initCom();
         initCom1();
         initCom2();
         initCom3();
    }
    public void initCom() {

        c4 = this.getContentPane();
        c4.setBackground(Color.white);
        icon4 = new ImageIcon(getClass().getResource("images-1.png"));
        this.setIconImage(icon4.getImage());

    }
      public void initCom1() {

      c4 = this.getContentPane();
      c4.setLayout(null);
        f4=new Font("Arial",Font.ITALIC,25);
         textlabel1 = new JLabel();
         textlabel1.setText("Team Information:");
         textlabel1.setBounds(250,0,450,100);
         textlabel1.setFont(f4);
         c4.add(textlabel1);
         textlabel2 = new JLabel();
         textlabel2.setText("Select Team:");
         textlabel2.setBounds(250,30,150,100);
         textlabel2.setFont(f4);
         c4.add(textlabel2);
        
    }
       public void initCom2()
      {
     
            bt1=new JButton();
         bt1.setText("Australia");
         bt1.setBounds(500,100,200,40);
         c4.add(bt1);
         bt1.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) { 
                 dispose();
                 Australia f2=new Australia();
                 f2.setVisible(true);
                 f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
             }
         });
          bt2=new JButton();
         bt2.setText("Afghanistan");
         bt2.setBounds(500,150,200,40);
         c4.add(bt2);
         bt2.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) { 
                 dispose();
                 Afghanistan f2=new Afghanistan();
                 f2.setVisible(true);
                 f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
             }
         });
           bt3=new JButton();
         bt3.setText("Bangladesh");
         bt3.setBounds(500,200,200,40);
         c4.add(bt3);
         bt3.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) { 
                 dispose();
                 Bangladesh bd= new Bangladesh();
                 bd.setVisible(true);
                 bd.setExtendedState(JFrame.MAXIMIZED_BOTH);
                 
             }
         });
           bt4=new JButton();
         bt4.setText("England");
         bt4.setBounds(500,250,200,40);
         c4.add(bt4);
         bt4.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {  
                 dispose();
                 England f2=new England();
                 f2.setVisible(true);
                 f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
             }
         });
           bt5=new JButton();
         bt5.setText("India");
         bt5.setBounds(500,300,200,40);
         c4.add(bt5);
         bt5.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                 India f2=new India();
                 f2.setVisible(true);
                 f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
             }
         });
           bt6=new JButton();
         bt6.setText("New Zealand");
         bt6.setBounds(500,350,200,40);
         c4.add(bt6);
         bt6.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) { 
                 dispose();
                 Newzealand f2=new Newzealand();
                 f2.setVisible(true);
                 f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
             }
         });
           bt7=new JButton();
         bt7.setText("Pakistan");
         bt7.setBounds(500,400,200,40);
         c4.add(bt7);
         bt7.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {  
                 dispose();
                 Pakistan f2=new Pakistan();
                 f2.setVisible(true);
                 f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
             }
         });
           bt8=new JButton();
         bt8.setText("Sri Lanka");
         bt8.setBounds(500,450,200,40);
         c4.add(bt8);
         bt8.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                 Srilanka f2=new Srilanka();
                 f2.setVisible(true);
                 f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                 
             }
         });
           bt9=new JButton();
         bt9.setText("South Africa");
         bt9.setBounds(500,500,200,40);
         c4.add(bt9);
         bt9.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) { 
                 dispose();
                 SouthAfrica f2=new SouthAfrica();
                 f2.setVisible(true);
                 f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
             }
         });
           bt10=new JButton();
         bt10.setText("West Indies");
         bt10.setBounds(500,550,200,40);
         c4.add(bt10);
         bt10.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {  
                 dispose();
                 Westindies f2=new Westindies();
                 f2.setVisible(true);
                 f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
             }
         });
           bt11=new JButton();
         bt11.setText("Back");
         bt11.setBounds(220,620,70,33);
         c4.add(bt11);
         bt11.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) { 
                 dispose();
                 FrameDemo1 f1=new FrameDemo1();
                 f1.setVisible(true);
                 f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
             }
         });
      }
        public void initCom3() {

      
        img4 = new ImageIcon(getClass().getResource("7.jpg"));
        JLabel imgLabel1 = new JLabel(img4);
        imgLabel1.setBounds(0,0,img4.getIconWidth(),img4.getIconHeight());
        c4.add(imgLabel1);
        
     }
    public static void main(String[] args) {
        TeamInfo  frame5 = new TeamInfo ();
        

        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1370,728);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
    }
}
