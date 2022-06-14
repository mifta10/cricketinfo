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


public class sapl extends JFrame {

    private ImageIcon icon;
    private Container c;
     private ImageIcon img;
    private JLabel imglabel;
    private JLabel textlabel,textlabel1;
    private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19;
    private Font f,f1;
   

    sapl() {
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
         textlabel.setText("Players");
         textlabel.setForeground(Color.BLACK);
         textlabel.setBounds(600,60,500,100);
         textlabel.setFont(f);
         c.add(textlabel);
         f1=new Font("Arial",Font.ITALIC,20);
         textlabel1 = new JLabel();
         textlabel1.setText("**Select individual player name to find their stats");
         textlabel1.setForeground(Color.BLACK);
         textlabel1.setBounds(50,20,1000,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         
    }
     public void initComponents2() {

     
        
         bt1=new JButton();
         bt1.setText("AB de Villiers");
         bt1.setBounds(150,100,200,40);
         c.add(bt1);
         bt1.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                DeVilliers f1=new DeVilliers();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt2=new JButton();
         bt2.setText("Faf du Plessis");
         bt2.setBounds(150,150,200,40);
         c.add(bt2);
         bt2.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                plessis f1=new plessis();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
         
         bt3=new JButton();
         bt3.setText("Hashim Amla");
         bt3.setBounds(150,200,200,40);
         c.add(bt3);
         bt3.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Amla f1=new Amla();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt4=new JButton();
         bt4.setText("Dean Elger");
         bt4.setBounds(150,250,200,40);
         c.add(bt4);
         bt4.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Elgar f1=new Elgar();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt5=new JButton();
         bt5.setText("Quinton de Kock");
         bt5.setBounds(150,300,200,40);
         c.add(bt5);
         bt5.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Kock f1=new Kock();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt6=new JButton();
         bt6.setText("David Miller");
         bt6.setBounds(150,350,200,40);
         c.add(bt6);
         bt6.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Miller f1=new Miller();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt7=new JButton();
         bt7.setText("JP Duminy");
         bt7.setBounds(150,400,200,40);
         c.add(bt7);
         bt7.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Duminy f1=new Duminy();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt8=new JButton();
         bt8.setText("Chris Morris");
         bt8.setBounds(150,450,200,40);
         c.add(bt8);
         bt8.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Morris f1=new Morris();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt9=new JButton();
         bt9.setText("Imran Tahir");
         bt9.setBounds(150,500,200,40);
         c.add(bt9);
         bt9.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Tahir   f1=new Tahir  ();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt10=new JButton();
         bt10.setText("Dale Steyn");
         bt10.setBounds(150,550,200,40);
         c.add(bt10);
         bt10.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Steyn f1=new Steyn();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt11=new JButton();
         bt11.setText("Morne Morkel");
         bt11.setBounds(850,160,200,40);
         c.add(bt11);
         bt11.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Morkel f1=new Morkel();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt12=new JButton();
         bt12.setText("Vernon Philander");
         bt12.setBounds(850,210,200,40);
         c.add(bt12);
         bt12.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Philander f1=new Philander();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt13=new JButton();
         bt13.setText("Temba Bavuma");
         bt13.setBounds(850,260,200,40);
         c.add(bt13);
         bt13.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Bavuma f1=new Bavuma();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt14=new JButton();
         bt14.setText("Kagiso Rabada");
         bt14.setBounds(850,310,200,40);
         c.add(bt14);
         bt14.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Rabada f1=new Rabada();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt15=new JButton();
         bt15.setText("Aiden Markram");
         bt15.setBounds(850,360,200,40);
         c.add(bt15);
         bt15.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Markram f1=new Markram();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt16=new JButton();
         bt16.setText("Lwanbo Tsotsobe");
         bt16.setBounds(850,410,200,40);
         c.add(bt16);
         bt16.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Tsotsobe f1=new Tsotsobe();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt17=new JButton();
         bt17.setText("Jacques Kallis");
         bt17.setBounds(850,460,200,40);
         c.add(bt17);
         bt17.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Kallis f1=new Kallis();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt18=new JButton();
         bt18.setText("Andile Phehlukwayo");
         bt18.setBounds(850,510,200,40);
         c.add(bt18);
         bt18.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Phehlukwayo f1=new Phehlukwayo();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt19=new JButton();
         bt19.setText("Back");
         bt19.setBounds(50,600,80,40);
         c.add(bt19);
         bt19.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                TeamName f1=new TeamName();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
     }
     
      public void initComponents3() {

        img = new ImageIcon(getClass().getResource("tn.jpg"));
        JLabel imgLabel = new JLabel(img);
        imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        c.add(imgLabel);
        
        

    }
   
        
    public static void main(String[] args) {
        sapl frame1 = new sapl();
      

        frame1.setBounds(0,0,1380,730);
        frame1.setTitle("CricketInfo");
        frame1.setResizable(false);
        
          frame1.setVisible(true);
        
     }  
}