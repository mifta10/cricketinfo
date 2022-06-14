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


public class  Records extends JFrame {

    private ImageIcon icon;
    private Container c;
     private ImageIcon img;
    private JLabel imglabel;
    private JLabel textlabel,textlabel1;
    private JButton nextbt,backbt;
    private Font f,f1;
   

     Records() {
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
         textlabel1.setText("** Shahid Afridi used Sachin Tendulkars bat to hit the fastest ever ODI century----37 balls century against Sri Lanka.");
         textlabel1.setBounds(70,50,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Chris Gayle is the only batsmen to hit a six off the first ball of a test match against Sohag Gazi vs Bangladesh in 2012.");
         textlabel1.setBounds(70,90,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** ML Jaisimha and Ravi Shastri are the only indians to bat on all five days of a Test.");
         textlabel1.setBounds(70,130,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** West Indies won the first two tournaments ,beating Australia in 1975 and England in 1979 and then lost to India in 1983 ");
         textlabel1.setBounds(70,170,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText(" final to India,but have not reached another Final since.");
         textlabel1.setBounds(70,210,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** South Africa's Gary Kirsten has the highest score in a World Cup match,making 188 not out against UAE in 1996.");
         textlabel1.setBounds(70,250,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** India is the only country to win the 60-over,50-over,20-over World Cup.");
         textlabel1.setBounds(70,290,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Sachin Tendulkar's 100 international centuries-made his 100th international century against Bangladesh in Dhaka.");
         textlabel1.setBounds(70,330,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Jim Laker's Test match best figures of 19/90 against Australia at Manchester.");
         textlabel1.setBounds(70,370,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** On the morning of 11/11/11 South Africa needed 111 runs to win at 11.11 against Australia in a test match.");
         textlabel1.setBounds(70,410,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Peter Siddle is the only bowler to take a hat-trick on his Birthday against Englan in 2010 Ashes.");
         textlabel1.setBounds(70,450,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Sir Don Bradman's Famous Batting Average of 99.52 in Test.");
         textlabel1.setBounds(70,490,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** 96 Runs Without A Boundary in An ODI Innings by New Zealand's wicket-keeper batsmen Adam Parore vs India");
         textlabel1.setBounds(70,530,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Mark Boucher's 998 Record Dismissals As A Wicket-keeper.");
         textlabel1.setBounds(70,570,1380,100);
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
                FrameDemo1 f2=new FrameDemo1();
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
                Records2 f2=new Records2();
            f2.setVisible(true);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
             }
         });
          
      }
        
         
   
        
    public static void main(String[] args) {
        Records frame1 = new  Records();
      
      
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setBounds(0,0,1380,730);
        frame1.setTitle("CricketInfo");
        frame1.setResizable(false);
        
          frame1.setVisible(true);
        
     }  
}
