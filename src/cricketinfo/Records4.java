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


public class  Records4 extends JFrame {

    private ImageIcon icon;
    private Container c;
     private ImageIcon img;
    private JLabel imglabel;
    private JLabel textlabel,textlabel1;
    private JButton backbt;
    private Font f,f1;
   

     Records4() {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        initComponents1();
        initComponents2();
        
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
        
      f=new Font("Arial",Font.BOLD,33);
         textlabel = new JLabel();
         textlabel.setText("ICC Records:");
         textlabel.setBounds(550,0,1380,100);
         textlabel.setFont(f);
         c.add(textlabel);
         f1=new Font("Arial",Font.BOLD,22);
         textlabel1 =new JLabel();
         textlabel1.setText("** Six Sixes in an Over in ODI: Harschelle Gibbs against Netherlands.");
         textlabel1.setBounds(200,50,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Six Sixes in an Over T20I:Yuvraj Singh against Stuart Broad vs England in 2007 ICC World T20.");
         textlabel1.setBounds(200,90,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Fastest 50 in ODI: AB de Villiers 16 balls against West Indies in Johannesberg");
         textlabel1.setBounds(200,130,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Fastest 50 in Test: Misbah ul Haq 21 balls against Australia");
         textlabel1.setBounds(200,170,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Fastest 50 in T20: Yuvraj Singh and Chris Gayle. ");
         textlabel1.setBounds(200,210,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Fastest 100 in ODI: AB de Villiers 31 balls against West Indies in Johannesberg.");
         textlabel1.setBounds(200,250,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Fastest 100 in Test: Brendon McCullam 54 balls against Australia ");
         textlabel1.setBounds(200,290,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Fastest 100 in T20I: David Miller vs Bangladesh & Rohit Sharma vs Sri Lanka 35 balls ");
         textlabel1.setBounds(200,330,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Most Hundreds in ODI: Sachin Tendulkar 49 hundreds. ");
         textlabel1.setBounds(200,370,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Most Hundreds in Test: Sachin Tendulkar 51 Hundreds. ");
         textlabel1.setBounds(200,410,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Most Runs in Int'l Cricket: 34357-Sachin Tendulkar. ");
         textlabel1.setBounds(200,450,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Most Wickets In Int'l cricket: 1347-Muttiah Muralitharan. ");
         textlabel1.setBounds(200,490,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Most Hundreds In Int'l Cricket: Sachin Tendulkar 100 International Hundreds. ");
         textlabel1.setBounds(200,530,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          
          
        
        
    }
    public void initComponents2()
             {
   
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(50,650,100,30);
         c.add(backbt);
         backbt.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                Records3 f2=new Records3();
            f2.setVisible(true);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
             }
         });
        
     
    
           
          
      }
        
         
   
        
    public static void main(String[] args) {
        Records4 frame1 = new  Records4();
      
      
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setBounds(0,0,1380,730);
        frame1.setTitle("CricketInfo");
        frame1.setResizable(false);
        
          frame1.setVisible(true);
        
     }  
}
