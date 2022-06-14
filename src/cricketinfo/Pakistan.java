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



public class Pakistan  extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JButton backbt;
Pakistan()
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

      
        img5= new ImageIcon(getClass().getResource("pak.png"));
        JLabel imgLabel1 = new JLabel(img5);
        imgLabel1.setBounds(560,30,img5.getIconWidth(),img5.getIconHeight());
        c5.add(imgLabel1);
        
     }
 public void initComp2() {

      c5 = this.getContentPane();
      c5.setLayout(null);
        f5=new Font("Arial",Font.ITALIC,16);
         
         textlabel1 = new JLabel();
         textlabel1.setText("The Pakistan Men's National Cricket Team,popularly referred to as the Shaheens,Green Shirts,Men in Green,is administred by the Pakistan Cricket ");
         textlabel1.setBounds(180,260,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("Board(PCB).The team is a Full member of the International Crcket Council,and participates in Test,ODI and T20I criket matches.");
         textlabel1.setBounds(180,280,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText("The team has played 901 ODIs,winning 477,losing 398,tying 8,ending 18 in no-result.Pakistan was the Champion of 1992 world cup.and was the  ");
         textlabel1.setBounds(180,300,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("runners-up in the 1999 tournament.Pakistan in conjunction with other countries in South Asia,has hosted the 1987 and 1996 world cups,with the");
         textlabel1.setBounds(180,320,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText(" 1996 final being hosted at Gaddafi Stadium in Lahore.The team also played 139 T20Is,the most by any team,winning 89 losing 47 and tying 3.");
         textlabel1.setBounds(180,340,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("Pakistan won the ICC T20I world cup in 2009 and were runners-up in the inaugural tornament in 2007.Pakistan also won the ICC champions trophy");
         textlabel1.setBounds(180,360,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText(" in 2017 for the first time defeatng INDIA.Pakistan has distinct achievement of having won each of the major ICC International cricket tournaments");
         textlabel1.setBounds(180,380,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("Pakistan has played 415 Test matches winning 134 losing 123 and drawing 158.Yhe team has the fourth-best win/loss ratio in Test cricket of 1.08");
         textlabel1.setBounds(180,400,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
          textlabel1 = new JLabel();
         textlabel1.setText(",and the fourth-best overall win percentage of 32.28%(behind Australia,South Africa and England).Pakistan was given Test status on July 28,1952");
         textlabel1.setBounds(180,420,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText(",following a recommendation by the India,and made its Test debut against India at Feroz Shah Kotla Ground,Delhi,in October 1952,with India winning ");
         textlabel1.setBounds(180,440,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("by an innings and 70 runs.In the 1930s and 40s,several Pakistani Test players had played test cricket in the Indian cricket team before creation of");
         textlabel1.setBounds(180,460,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText(" Pakistan in 1947.As of October 2018,The Pakistani cricket team is ranked seventh in tests,fifth in ODIs,first in T20Is by the ICC");
         textlabel1.setBounds(180,480,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
 }
   public void initComp3()
      {
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(120,600,80,30);
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
Pakistan frame5=new Pakistan();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1380,730);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}

