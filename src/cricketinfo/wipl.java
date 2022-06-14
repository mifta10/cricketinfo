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


public class wipl extends JFrame {

    private ImageIcon icon;
    private Container c;
     private ImageIcon img;
    private JLabel imglabel;
    private JLabel textlabel,textlabel1;
    private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19;
    private Font f,f1;
   

    wipl() {
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
         bt1.setText("Chris Gayle");
         bt1.setBounds(150,100,200,40);
         c.add(bt1);
         bt1.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Gayle f1=new Gayle();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt2=new JButton();
         bt2.setText("Jason Holder");
         bt2.setBounds(150,150,200,40);
         c.add(bt2);
         bt2.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Holder f1=new Holder();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
         
         bt3=new JButton();
         bt3.setText("Kieron Pollard");
         bt3.setBounds(150,200,200,40);
         c.add(bt3);
         bt3.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Pollard f1=new Pollard();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt4=new JButton();
         bt4.setText("Sunil Narine");
         bt4.setBounds(150,250,200,40);
         c.add(bt4);
         bt4.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Narine f1=new Narine();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt5=new JButton();
         bt5.setText("Andre Russell");
         bt5.setBounds(150,300,200,40);
         c.add(bt5);
         bt5.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Russel f1=new Russel();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt6=new JButton();
         bt6.setText("Darren Bravo");
         bt6.setBounds(150,350,200,40);
         c.add(bt6);
         bt6.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Darren f1=new Darren();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt7=new JButton();
         bt7.setText("Dwayne Bravo");
         bt7.setBounds(150,400,200,40);
         c.add(bt7);
         bt7.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Dwayne f1=new Dwayne();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt8=new JButton();
         bt8.setText("Kraigg Brathwaite");
         bt8.setBounds(150,450,200,40);
         c.add(bt8);
         bt8.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Kraigg f1=new Kraigg();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt9=new JButton();
         bt9.setText("Shai Hope");
         bt9.setBounds(150,500,200,40);
         c.add(bt9);
         bt9.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Hope f1=new Hope();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          
         bt10=new JButton();
         bt10.setText("Darren Sammy");
         bt10.setBounds(150,550,200,40);
         c.add(bt10);
         bt10.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Sammy f1=new Sammy();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt11=new JButton();
         bt11.setText("Devendra Bishoo");
         bt11.setBounds(850,160,200,40);
         c.add(bt11);
         bt11.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Bishoo f1=new Bishoo();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt12=new JButton();
         bt12.setText("Kemar Roach");
         bt12.setBounds(850,210,200,40);
         c.add(bt12);
         bt12.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Roach f1=new Roach();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt13=new JButton();
         bt13.setText("Shanon Gabriel");
         bt13.setBounds(850,260,200,40);
         c.add(bt13);
         bt13.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Gabriel f1=new Gabriel();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt14=new JButton();
         bt14.setText("Roston Chase");
         bt14.setBounds(850,310,200,40);
         c.add(bt14);
         bt14.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Chase f1=new Chase();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt15=new JButton();
         bt15.setText("Dinesh Ramdin");
         bt15.setBounds(850,360,200,40);
         c.add(bt15);
         bt15.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Ramdin f1=new Ramdin();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt16=new JButton();
         bt16.setText("Carlos Brathwaite");
         bt16.setBounds(850,410,200,40);
         c.add(bt16);
         bt16.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Carlos f1=new Carlos();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt17=new JButton();
         bt17.setText("Kieron Powell");
         bt17.setBounds(850,460,200,40);
         c.add(bt17);
         bt17.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Powell f1=new Powell();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
          bt18=new JButton();
         bt18.setText("Evin Lewis");
         bt18.setBounds(850,510,200,40);
         c.add(bt18);
         bt18.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                Lewis f1=new Lewis();
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
        wipl frame1 = new wipl();
      

        frame1.setBounds(0,0,1380,730);
        frame1.setTitle("CricketInfo");
        frame1.setResizable(false);
        
          frame1.setVisible(true);
        
     }  
}