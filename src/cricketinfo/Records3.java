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


public class  Records3 extends JFrame {

    private ImageIcon icon;
    private Container c;
     private ImageIcon img;
    private JLabel imglabel;
    private JLabel textlabel,textlabel1;
    private JButton nextbt,backbt;
    private Font f,f1,f2;
   

     Records3() {
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
         textlabel.setText("ICC Unknown Facts & Records:");
         textlabel.setBounds(450,0,1380,100);
         textlabel.setFont(f);
         c.add(textlabel);
         f1=new Font("Arial",Font.BOLD,22);
         textlabel1 =new JLabel();
         textlabel1.setText("** Rahul Dravid has played both for Scotland and India..");
         textlabel1.setBounds(70,50,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Sachin Tendulkar played for Both India and Pakistan(as a substitute fielder in his debut match)");
         textlabel1.setBounds(70,90,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Adam Gilchrist holds the record for playing the most number of Tests straight after debut.");
         textlabel1.setBounds(70,130,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         f2=new Font("Arial",Font.CENTER_BASELINE,25);
         textlabel1 =new JLabel();
         textlabel1.setText("**During Aussies' invincible 99-07 run:");
         textlabel1.setBounds(70,170,1380,100);
         textlabel1.setFont(f2);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("~~They lost only two test series and both are away iconic series.First one against India in 2001");
         textlabel1.setBounds(210,220,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText(" and second one against England,the epic 2005 Ashes.");
         textlabel1.setBounds(210,260,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("~~ They lost only two test matches at home and surprisingly both teams were again India and England");
         textlabel1.setBounds(210,300,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText(" Against India in 2003-04 and against England in 2002-03 Ashes.");
         textlabel1.setBounds(210,340,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("~~Two is the number again.During this era only two series out of all Australia played ended as draw. ");
         textlabel1.setBounds(210,380,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("First one against Kiwis in 2001-02(0-0) and second against India 2003-04(1-1).");
         textlabel1.setBounds(210,420,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("**Ishant Sharma is responsible for all the three highest scores made by a batsmen against India in the 21st Century--");
         textlabel1.setBounds(80,460,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("Alaistar Cook-294 Runs,Edgbaston,2011;Michael Clarke-329 Runs,Sydney,2012;Brendon McCullam-302 Runs,Wellimgton,2014.");
         textlabel1.setBounds(80,500,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("They were all dropped by Ishant Sharma early on in their Innings. ");
         textlabel1.setBounds(80,540,1380,100);
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
                Records2 f2=new Records2();
            f2.setVisible(true);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
             }
         });
        
     
    
            nextbt=new JButton();
          nextbt.setText("Next Page");
          nextbt.setBounds(1250,650,100,30);
         c.add(nextbt);
         nextbt.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                Records4 f2=new Records4();
            f2.setVisible(true);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
             }
         });
          
      }
        
         
   
        
    public static void main(String[] args) {
        Records3 frame1 = new  Records3();
      
      
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setBounds(0,0,1380,730);
        frame1.setTitle("CricketInfo");
        frame1.setResizable(false);
        
          frame1.setVisible(true);
        
     }  
}
