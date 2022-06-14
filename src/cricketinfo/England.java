/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketinfo;

/**
 *
 * @author ACER
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class England extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JButton backbt;
England()
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

      
        img5= new ImageIcon(getClass().getResource("Eng.png"));
        JLabel imgLabel1 = new JLabel(img5);
        imgLabel1.setBounds(550,0,img5.getIconWidth(),img5.getIconHeight());
        c5.add(imgLabel1);
        
     }
 public void initComp2() {

      c5 = this.getContentPane();
      c5.setLayout(null);
        f5=new Font("Arial",Font.ITALIC,16);
         
         textlabel1 = new JLabel();
         textlabel1.setText("The England cricket team represents England and Wales (and, until 1992, also Scotland) in international cricket. Since 1 January 1997 it has been ");
         textlabel1.setBounds(180,270,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText(" governed by the England and Wales Cricket Board (ECB), having been previously governed by Marylebone Cricket Club (MCC) from 1903 ");
         textlabel1.setBounds(180,290,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText("until the end of 1996.[8][9] England, as a founding nation, is a full member of the International Cricket Council (ICC) with Test, ");
         textlabel1.setBounds(180,310,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("One Day International (ODI) and Twenty20 International (T20I) status.England and Australia were the first teams to play a Test match");
         textlabel1.setBounds(180,330,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText(" (between 15–19 March 1877), and these two countries together with South Africa formed the Imperial Cricket Conference (predecessor to ");
         textlabel1.setBounds(180,350,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("today's International Cricket Council) on 15 June 1909. England and Australia also played the first ODI on 5 January 1971. England's first");
         textlabel1.setBounds(180,370,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText(" T20I was played on 13 June 2005, once more against Australia.");
         textlabel1.setBounds(180,390,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("As of 10 November 2018, England has played 1005 Test matches, winning 362 and losing 298 (with 345 draws). The team has won The Ashes on 32  ");
         textlabel1.setBounds(180,410,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
          textlabel1 = new JLabel();
         textlabel1.setText("occasions.[10] England has played 721 ODIs, winning 360,[11] and its record in major ODI tournaments includes finishing as runners-up in three ");
         textlabel1.setBounds(180,430,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("Cricket World Cups (1979, 1987 and 1992), and in two ICC Champions Trophys (2004 and 2013). England has also played 105 T20Is, winning 50.[12]");
         textlabel1.setBounds(180,450,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText(" They won the ICC World Twenty20 in 2010, and were runners-up in 2016.");
         textlabel1.setBounds(180,470,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("As of 26 October 2018, England are ranked third in Tests, first in ODIs and fourth in T20Is by the ICC.[1] Though the team and coaching staff ");
         textlabel1.setBounds(180,490,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("faced heavy criticism after their Group Stage exit in the 2015 Cricket World Cup, it has since adopted a more aggressive and modern playing style");
         textlabel1.setBounds(180,510,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText(" in ODI cricket, under the leadership of captain Eoin Morgan and head coach Trevor Bayliss");
         textlabel1.setBounds(180,530,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
 }
   public void initComp3()
      {
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(150,650,80,30);
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
    England frame5=new England();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1380,730);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}
