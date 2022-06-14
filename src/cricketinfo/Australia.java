/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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



public class Australia extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JButton backbt;
Australia()
{
    this.setDefaultCloseOperation(FrameDemo.EXIT_ON_CLOSE);
    initComp();
    initComp1();
     initComp2();
     initComp3();
}
public void initComp() {

        c5 = this.getContentPane();
        c5.setBackground(Color.white);
        icon5 = new ImageIcon(getClass().getResource("images-1.png"));
        this.setIconImage(icon5.getImage());

    }
 public void initComp1() {

      
        img5= new ImageIcon(getClass().getResource("aus.png"));
        JLabel imgLabel1 = new JLabel(img5);
        imgLabel1.setBounds(560,10,img5.getIconWidth(),img5.getIconHeight());
        c5.add(imgLabel1);
        
     }
 public void initComp2() {

      c5 = this.getContentPane();
      c5.setLayout(null);
        f5=new Font("Arial",Font.ITALIC,16);
         
         textlabel1 = new JLabel();
         textlabel1.setText("The Australia national cricket team is the joint oldest team in Test cricket history, having played in the first ever Test match in 1877.[9] The team");
         textlabel1.setBounds(150,260,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText(" also plays One Day International cricket and Twenty20 International, participating in both the first ODI, against England in the 1970–71 season[10] ");
         textlabel1.setBounds(150,285,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText("and the first Twenty20 International, against New Zealand in the 2004–05 season,[11] winning both games. The team draws its players from teams playing ");
         textlabel1.setBounds(150,310,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("in the Australian domestic competitions – the Sheffield Shield, the Australian domestic limited-overs cricket tournament and the Big Bash League.");
         textlabel1.setBounds(150,335,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("The national team has played 814 Test matches, winning 383, losing 220, drawing 209 and tying 2.[12] Australia is ranked the number-one team overall");
         textlabel1.setBounds(150,360,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText(" in Test cricket in terms of overall wins, win-loss ratio and wins percentage. As of October 2018, Australia is ranked third in the ICC Test ");
         textlabel1.setBounds(150,385,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("Championship on 106 rating points.[13]");
         textlabel1.setBounds(150,410,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("The Australian cricket team has played 917 ODI matches, winning 557, losing 317, tying 9 and with 34 ending in no-result.[14] They are currently");
         textlabel1.setBounds(150,435,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
          textlabel1 = new JLabel();
         textlabel1.setText(" placed fifth in the ICC ODI Championship,[15] though have been ranked first for 141 of 185 months since its introduction in 2002. Australia have ");
         textlabel1.setBounds(150,460,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("made a record seven World Cup final appearances (1975, 1987, 1996, 1999, 2003, 2007 and 2015) and have won the World Cup a record five times in ");
         textlabel1.setBounds(150,485,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("total:1987, 1999, 2003, 2007 and 2015. Australia is the first team to appear in four consecutive World Cup finals (1996, 1999, 2003 and 2007), surpassing ");
         textlabel1.setBounds(150,510,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("the old record of three consecutive World Cup appearances by West Indies (1975, 1979 and 1983) and the first team to win 3 consecutive world cups ");
         textlabel1.setBounds(150,535,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("(1999, 2003 and 2007). It is also the second team to win a World Cup (2015) on home soil, after India (2011).");
         textlabel1.setBounds(150,560,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("The team was undefeated in 34 consecutive World Cup matches until 19 March at the 2011 Cricket World Cup ");
         textlabel1.setBounds(150,585,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("where Pakistan beat them by 4 wickets.[16] Australia have also won the ICC Champions Trophy twice – in 2006 and in 2009 – making them the first and the only ");
         textlabel1.setBounds(150,610,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1.setText("team to become back to back winners in the Champions Trophy tournaments. The team has also played 106 Twenty20 Internationals, winning 56, losing 47, tying 2 ");
         textlabel1.setBounds(150,635,1380,120);
         textlabel1.setFont(f5);
        c5.add(textlabel1);
          textlabel1.setText("and with 1 ending in no-result[17] making the final of the 2010 ICC World Twenty20, which they eventually lost to England.");
         textlabel1.setBounds(150,660,1380,120);
         textlabel1.setFont(f5);
        c5.add(textlabel1);
 }
   public void initComp3()
      {
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(40,660,80,30);
         c5.add(backbt);
         backbt.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                TeamInfo f2=new TeamInfo();
            f2.setVisible(true);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
             }
         });
      }
 
    public static void main(String[] args)
    {
Australia frame5=new Australia();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1380,728);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}
