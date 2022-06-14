
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


public class  UpcEvent extends JFrame {

    private ImageIcon icon;
    private Container c;
     private ImageIcon img;
    private JLabel imglabel;
    private JLabel textlabel,textlabel1;
    private JButton nextbt,backbt;
    private Font f,f1;
   

     UpcEvent() {
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
      setBounds(20,20,1350,710);
        
      f=new Font("Arial",Font.BOLD,35);
      f1=new Font("Arial",Font.BOLD,22);
         textlabel = new JLabel();
         textlabel.setText("ICC Tournaments:");
         textlabel.setBounds(350,60,1380,100);
         textlabel.setFont(f);
         c.add(textlabel);
         textlabel1 =new JLabel();
         textlabel1.setText("1.ICC womens T20 World Cup West Indies 2018");
         textlabel1.setBounds(550,110,700,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("2.ICC Cricket world cup 2019 and 2023");
         textlabel1.setBounds(550,160,500,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("3.550 World T20-2020 and 2021");
         textlabel1.setBounds(550,210,500,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("4.World Test Championship.Cycle 1(2019-2021)");
         textlabel1.setBounds(550,260,500,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("5.World Test Championship.Cycle 2(2021-2023)");
         textlabel1.setBounds(550,310,500,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("6.ICC Women's Championship (2017-2020)");
         textlabel1.setBounds(550,360,500,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("7.U-19 Cricket World Cup Qualifier Asia Divsion 2");
         textlabel1.setBounds(550,410,500,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
        
        
    }
    public void initComponents2()
             {
   
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(80,590,100,30);
         c.add(backbt);
         backbt.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                FrameDemo1 f2=new FrameDemo1();
            f2.setVisible(true);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
             }
         });
        
     
    
            nextbt=new JButton();
          nextbt.setText("Next Page");
          nextbt.setBounds(1150,590,100,30);
         c.add(nextbt);
         nextbt.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                UpcEvent1 f2=new UpcEvent1();
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
        UpcEvent frame1 = new  UpcEvent();
      
      
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setBounds(0,0,1380,700);
        frame1.setTitle("CricketInfo");
        frame1.setResizable(false);
        
          frame1.setVisible(true);
        
     }  
}
