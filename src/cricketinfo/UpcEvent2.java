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


public class  UpcEvent2 extends JFrame {

    private ImageIcon icon;
    private Container c;
     private ImageIcon img;
    private JLabel imglabel;
    private JLabel textlabel,textlabel1;
    private JButton nextbt,backbt;
    private Font f,f1;
   

     UpcEvent2() {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        initComponents1();
        initComponents2();
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
         textlabel.setText(" Domestic Cricket:");
         textlabel.setBounds(370,30,450,110);
         textlabel.setFont(f1);
         c.add(textlabel);
         textlabel1 =new JLabel();
         textlabel1.setText("1.Bangladesh Premire League(BPL) 2019");
         textlabel1.setBounds(550,80,550,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("2.Big Bash Australia 2019");
         textlabel1.setBounds(550,110,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("3.Indian Premiere League(IPL) 2019");
         textlabel1.setBounds(550,140,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("4.Pakistan Super League(PSL) 2019");
         textlabel1.setBounds(550,170,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("5.Women's Big Bash Australia 2019");
         textlabel1.setBounds(550,200,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("6.Carribean Premiere League(CPL) 2019");
         textlabel1.setBounds(550,230,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("7.Afghanistan Premeire League(APL) 2019");
         textlabel1.setBounds(550,260,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("8.Natwest T20 Blast England 2019");
         textlabel1.setBounds(550,290,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("9.Ghalia T10 League 2018");
         textlabel1.setBounds(550,320,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("10.Wzansi T20 South Africa 2018");
         textlabel1.setBounds(550,350,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("11.Sri Lankan Premiere League 2019");
         textlabel1.setBounds(550,380,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("12.Global T20 League 2019");
         textlabel1.setBounds(550,410,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("13.Canada Premiere League 2019");
         textlabel1.setBounds(550,440,500,100);
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
                UpcEvent1 f3=new UpcEvent1();
            f3.setVisible(true);
            f3.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
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
        UpcEvent2 frame1 = new  UpcEvent2();
      
      
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setBounds(0,0,1380,720);
        frame1.setTitle("CricketInfo");
        frame1.setResizable(false);
        
          frame1.setVisible(true);
        
     }  
}

