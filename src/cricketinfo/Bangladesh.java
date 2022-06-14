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
import javax.swing.JScrollPane;


public class Bangladesh extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JScrollPane ta;
         private JButton backbt;
Bangladesh()
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

      
        img5= new ImageIcon(getClass().getResource("8.png"));
        JLabel imgLabel1 = new JLabel(img5);
        imgLabel1.setBounds(550,30,img5.getIconWidth(),img5.getIconHeight());
        c5.add(imgLabel1);
        
     }
 public void initComp2() {

      c5 = this.getContentPane();
      c5.setLayout(null);
        f5=new Font("Arial",Font.ITALIC,16);
         
         textlabel1 = new JLabel();
         textlabel1.setText(" The Bangladesh national cricket team, nicknamed The Tigers, is administered by the Bangladesh Cricket Board (BCB). Bangladesh is a full member ");
         textlabel1.setBounds(180,250,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("of the International Cricket Council (ICC) with Test and One Day International (ODI) status. It played its first Test match in November 2000 against ");
         textlabel1.setBounds(180,275,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText(" India in Dhaka, becoming the tenth Test-playing nation.Bangladesh's first official foray into international cricket came in the 1979 ICC Trophy");
         textlabel1.setBounds(180,300,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText(" in England. On 31 March 1986, Bangladesh played its first ODI match, against Pakistan in the Asia Cup. For a long time, football was the most ");
         textlabel1.setBounds(180,325,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText(" popular sport in Bangladesh, but cricket gradually became very popular – particularly in urban areas – and by the late 1990s had surpassed  ");
         textlabel1.setBounds(180,350,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText(" football.Bangladesh made its full debut in international cricket in the 1986 Asia Cup.In 1997, Bangladesh won the ICC Trophy in Malaysia ");
         textlabel1.setBounds(180,375,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("and thus qualified for its first Cricket World Cup to participate in England in 1999. There, it defeated Pakistan – causing much upset – ");
         textlabel1.setBounds(180,400,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("and also Scotland. On 26 June 2000, Bangladesh was granted full ICC membership.Bangladesh holds the record for most consecutive losses in ");
         textlabel1.setBounds(180,425,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
          textlabel1 = new JLabel();
         textlabel1.setText("wait until 2004 for its first ODI win since the 1999 World Cup. The team on the losing side on that occasion was Zimbabwe, who also ");
         textlabel1.setBounds(180,450,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("participated in Bangladesh's maiden Test victory in 2005; by securing a draw in the second match, Bangladesh won their first Test ");
         textlabel1.setBounds(180,475,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("series. In 2009 Bangladesh toured the West Indies for two Tests and by winning both secured their first overseas Test series victory.");
         textlabel1.setBounds(180,500,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("As of 28 July 2018, Bangladesh has played 108 Tests, winning ten. Its first victory was against team Zimbabwe, and the next two came ");
         textlabel1.setBounds(180,525,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("against the West Indian team. Results have improved predominantly at home with draws earned against New Zealand, Pakistan, India ");
         textlabel1.setBounds(180,550,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("and South Africa and wins against England, Sri Lanka and Australia.[10] They played their 100th Test when they toured Sri Lanka in March 2017.");
         textlabel1.setBounds(180,575,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("The team has been more successful in ODIs, having won 113 of its 349 matches.[12] It has also played 82 Twenty20 Internationals, winning 25");
         textlabel1.setBounds(180,600,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1.setText("Bangladesh is currently ranked ninth in Tests, seventh in ODIs and tenth in T20Is by the ICC.");
         textlabel1.setBounds(180,615,1380,120);
         textlabel1.setFont(f5);
        c5.add(textlabel1);
 }
   public void initComp3()
      {
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(20,660,80,30);
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
     Bangladesh frame5=new Bangladesh();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1385,730);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}
