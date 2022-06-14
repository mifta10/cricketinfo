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


public class  UpcEvent1 extends JFrame {

    private ImageIcon icon;
    private Container c;
     private ImageIcon img;
    private JLabel imglabel;
    private JLabel textlabel,textlabel1;
    private JButton nextbt,backbt;
    private Font f,f1;
   

     UpcEvent1() {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        initComponents1();
        initComponents2();
        initComponents3();
         initComponents5();
        
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
      c.setBackground(Color.LIGHT_GRAY);
        
      f=new Font("Arial",Font.BOLD,22);
      f1=new Font("Arial",Font.BOLD,35);
         textlabel = new JLabel();
         textlabel.setText("    Tours:");
         textlabel.setBounds(370,30,150,110);
         textlabel.setFont(f1);
         c.add(textlabel);
         textlabel1 =new JLabel();
         textlabel1.setText("1.West Indies Tour of Bangladesh 2018");
         textlabel1.setBounds(550,80,550,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("2.New Zealand Tour Of Pakistan 2018");
         textlabel1.setBounds(550,110,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("3.England Tour of Srilanka 2018");
         textlabel1.setBounds(550,140,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("4.South Africa Tour of Australia 2018");
         textlabel1.setBounds(550,170,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("5.India Tour of Australia 2018-19");
         textlabel1.setBounds(550,200,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("6.Bangladesh Tour of New Zealand 2019");
         textlabel1.setBounds(550,230,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("7.Srilanka Tour Of New Zealand 2018-19");
         textlabel1.setBounds(550,260,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("8.England Tour Of West Indies 2019");
         textlabel1.setBounds(550,290,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("9.India Tour Of New Zealand 2019");
         textlabel1.setBounds(550,320,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("10.Srilanka Tour Of Australia 2019");
         textlabel1.setBounds(550,350,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("11.India Women Tour Of New Zealand 2019");
         textlabel1.setBounds(550,380,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("12.Srilanka Tour Of South Africa 2019");
         textlabel1.setBounds(550,410,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("13.Australia Tour Of India 2019");
         textlabel1.setBounds(550,440,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("14.Pakistan Tour Of England 2019");
         textlabel1.setBounds(550,470,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("15.Ireland Tour of England Only Test 2019");
         textlabel1.setBounds(550,500,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("16.The Ashes 2019");
         textlabel1.setBounds(550,530,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
        
        
    }
    public void initComponents2()
             {
   
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(80,630,100,30);
         c.add(backbt);
         backbt.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                UpcEvent f2=new UpcEvent();
            f2.setVisible(true);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
             }
         });
                   
      }
    public void initComponents3()
    {
         nextbt=new JButton();
         nextbt.setText("Next Page");
         nextbt.setBounds(1150,630,150,30);
         c.add(nextbt);
         nextbt.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                UpcEvent2 f2=new UpcEvent2();
            f2.setVisible(true);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
             }
         });

    }         
    public void initComponents5() {

        img = new ImageIcon(getClass().getResource("icon.jpg"));
        JLabel imgLabel = new JLabel(img);
        imgLabel.setBounds(250,250,img.getIconWidth(),img.getIconHeight());
        c.add(imgLabel);
        
        

    }
   
        
    public static void main(String[] args) {
        UpcEvent1 frame1 = new  UpcEvent1();
      
      
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setBounds(0,0,1380,720);
        frame1.setTitle("CricketInfo");
        frame1.setResizable(false);
        
          frame1.setVisible(true);
        
     }  
}
