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


public class Afgpl extends JFrame {

    private ImageIcon icon;
    private Container c;
     private ImageIcon img;
    private JLabel imglabel;
    private JLabel textlabel,textlabel1;
    private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19;
    private Font f,f1;
   

    Afgpl() {
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
         bt1.setText("Mohammad Nabi");
         bt1.setBounds(200,100,200,40);
         c.add(bt1);
         bt1.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                MNabi f1=new MNabi();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt2=new JButton();
         bt2.setText("Rashid Khan");
         bt2.setBounds(200,150,200,40);
         c.add(bt2);
         bt2.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                RKhan f1=new RKhan();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
         
         bt3=new JButton();
         bt3.setText("Mohammd Shahzad");
         bt3.setBounds(200,200,200,40);
         c.add(bt3);
         bt3.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                MShahzad f1=new MShahzad();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt4=new JButton();
         bt4.setText("Mujeeb ur Rahman");
         bt4.setBounds(200,250,200,40);
         c.add(bt4);
         bt4.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Mujeeb f1=new Mujeeb();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt5=new JButton();
         bt5.setText("Gulbadin Naib");
         bt5.setBounds(200,300,200,40);
         c.add(bt5);
         bt5.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                GNaib f1=new GNaib();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt6=new JButton();
         bt6.setText("Najib Zadran");
         bt6.setBounds(200,350,200,40);
         c.add(bt6);
         bt6.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                NZadran f1=new NZadran();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt7=new JButton();
         bt7.setText("Dawlat Zadran");
         bt7.setBounds(200,400,200,40);
         c.add(bt7);
         bt7.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                DZadran f1=new DZadran();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt8=new JButton();
         bt8.setText("Shapoor Zadran");
         bt8.setBounds(200,450,200,40);
         c.add(bt8);
         bt8.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                SZadran f1=new SZadran();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt9=new JButton();
         bt9.setText("Rahmat Shah");
         bt9.setBounds(200,500,200,40);
         c.add(bt9);
         bt9.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                RShah f1=new RShah();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt10=new JButton();
         bt10.setText("Karim Jannat");
         bt10.setBounds(200,550,200,40);
         c.add(bt10);
         bt10.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                KJannat f1=new KJannat();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt11=new JButton();
         bt11.setText("Asghar Afghan");
         bt11.setBounds(900,160,200,40);
         c.add(bt11);
         bt11.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                AAfghan f1=new AAfghan();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt12=new JButton();
         bt12.setText("Samiullah Shinwari");
         bt12.setBounds(900,210,200,40);
         c.add(bt12);
         bt12.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                SShinwari f1=new SShinwari();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt13=new JButton();
         bt13.setText("Aftab Alam");
         bt13.setBounds(900,260,200,40);
         c.add(bt13);
         bt13.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                AAlam f1=new AAlam();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt14=new JButton();
         bt14.setText("Hazratullah Zazai");
         bt14.setBounds(900,310,200,40);
         c.add(bt14);
         bt14.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                HZazai f1=new HZazai();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt15=new JButton();
         bt15.setText("Zahir Khan");
         bt15.setBounds(900,360,200,40);
         c.add(bt15);
         bt15.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                ZKhan f1=new ZKhan();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt16=new JButton();
         bt16.setText("Hamid Hasan");
         bt16.setBounds(900,410,200,40);
         c.add(bt16);
         bt16.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                HHasan f1=new HHasan();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt17=new JButton();
         bt17.setText("Hasmatullah Sahidi");
         bt17.setBounds(900,460,200,40);
         c.add(bt17);
         bt17.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                HSahidi f1=new HSahidi();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt18=new JButton();
         bt18.setText("Javed Ahmadi");
         bt18.setBounds(900,510,200,40);
         c.add(bt18);
         bt18.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                JAhmedi f1=new JAhmedi();
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
        Afgpl frame1 = new Afgpl();
      

        frame1.setBounds(0,0,1380,730);
        frame1.setTitle("CricketInfo");
        frame1.setResizable(false);
        
          frame1.setVisible(true);
        
     }  
}
