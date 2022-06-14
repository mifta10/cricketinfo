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


public class  Records2 extends JFrame {

    private ImageIcon icon;
    private Container c;
     private ImageIcon img;
    private JLabel imglabel;
    private JLabel textlabel,textlabel1;
    private JButton nextbt,backbt;
    private Font f,f1;
   

     Records2() {
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
         textlabel1.setText("** Brian Lara's Magnificant 400 Runs In A Single Test Innings against England in Antigua.");
         textlabel1.setBounds(70,50,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Bhuvneshwar Kumar is the only Bowler in cricket history to get his first wicket in all three format of game as bowled.");
         textlabel1.setBounds(70,90,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Shivnaraine Chanderpaul holds the record of most unbeaten Centuries in Test Cricket.He made 18 unbeaten centuries out of");
         textlabel1.setBounds(70,130,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText(" 30 centuries he scored in Test Cricket.");
         textlabel1.setBounds(70,170,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("**Faf du Plessis is the only player in history of Cricket to have played 100 consecutive innings without getting dismissed for");
         textlabel1.setBounds(70,210,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText(" a duck from his debut.");
         textlabel1.setBounds(70,250,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Australia is the only team to whitewash every single Test playing nations in test cricket before 2016. ");
         textlabel1.setBounds(70,290,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
         textlabel1 =new JLabel();
         textlabel1.setText("** Sourav Ganguly(DADA) is the only player to win Four consecutive Man of the matche awards in ODI's.");
         textlabel1.setBounds(70,330,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Graeme Smith is the only player who have captained a team for more than 100 Test matches.");
         textlabel1.setBounds(70,370,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Muttiah Muralitharan bowled highest number of maiden overs.He has bowled 1992 maiden overs in international cricket.");
         textlabel1.setBounds(70,410,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Wasim Akram is the only bowler who has taken 2 hat-tricks in test and 2 in ODI's respectively.");
         textlabel1.setBounds(70,450,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Rahul Dravid spent 44,152 minutes at the crease in Tests.The most by any Batsmen.");
         textlabel1.setBounds(70,490,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** Both Shane Warne and Glenn McGrath didn't lose a single Test on home soil from 1999 till their Retirement. ");
         textlabel1.setBounds(70,530,1380,100);
         textlabel1.setFont(f1);
         c.add(textlabel1);
          textlabel1 =new JLabel();
         textlabel1.setText("** The highest number of runs scored in an over is not 36.It's 77.");
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
                Records f2=new Records();
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
                Records3 f2=new Records3();
            f2.setVisible(true);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
             }
         });
          
      }
        
         
   
        
    public static void main(String[] args) {
        Records2 frame1 = new  Records2();
      
      
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setBounds(0,0,1380,730);
        frame1.setTitle("CricketInfo");
        frame1.setResizable(false);
        
          frame1.setVisible(true);
        
     }  
}
