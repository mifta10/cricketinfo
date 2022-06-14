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



public class India  extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JButton backbt;
India()
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

      
        img5= new ImageIcon(getClass().getResource("ind.png"));
        JLabel imgLabel1 = new JLabel(img5);
        imgLabel1.setBounds(550,40,img5.getIconWidth(),img5.getIconHeight());
        c5.add(imgLabel1);
        
     }
 public void initComp2() {

      c5 = this.getContentPane();
      c5.setLayout(null);
        f5=new Font("Arial",Font.ITALIC,16);
         
         textlabel1 = new JLabel();
         textlabel1.setText("The India national cricket team,also known as Team India and Men In Blue,is governed by the Board of Control for Cricket in India(BCCI),and is a full ");
         textlabel1.setBounds(180,270,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("member of the International Cricket Council(ICC) with test,ODI and T20I status.Although Cricket was introduced to India by European merchant sailors in");
         textlabel1.setBounds(180,290,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText(" the 18th century,nd the first cricket club was established in Calcutta(currently known as Kolkata)in 1972,india's national cricket team did not play its");
         textlabel1.setBounds(180,310,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText(" first match until 25 june 1932 at Lord's,becoming the sixth team to be granted Test Cricket status.In its first fifty years of international cricket,India ");
         textlabel1.setBounds(180,330,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("was one of the weaker teams,winning only 35 of the first 196 Test matches it played.From 1932 India had to wait until 1952,almost 20 years for its first test ");
         textlabel1.setBounds(180,350,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("test victory.The team however gained strength in the 1970s with the emergence of players such as batsmen Sunil Gavaska and Gundappa Viswanath,all-rounder ");
         textlabel1.setBounds(180,370,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("Kapil Dev and the Indian spin quartet of Erapalli Prasanna etc.Traditionally much stronger at home than abroad,the indian team has improved its overseas ");
         textlabel1.setBounds(180,390,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("form,especially in limited overs cricket,since the start of the 21st century,winning test matches in Australia,England,South Africa.It has Won world ");
         textlabel1.setBounds(180,410,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
          textlabel1 = new JLabel();
         textlabel1.setText("cup twice in 1983 and 2011 under the captaincy of Kapil Dev and MS Dhoni.It has also won 2007 Icc world T20I and 2013 Icc champions Trophy.It was also .");
         textlabel1.setBounds(180,430,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("the joint champion of Icc champions trophy 2002,along with Srilanka.As Of November,2018,India ranked first in tests,second in ODIs and also second in");
         textlabel1.setBounds(180,450,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText(" T20Is by the ICC.Virat Kohli is the current Captain of the team across all formats,while the lead coach is Ravi Shastri.");
         textlabel1.setBounds(180,470,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
           
 }
   public void initComp3()
      {
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(150,590,80,30);
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
India frame5=new India();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1380,730);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}

