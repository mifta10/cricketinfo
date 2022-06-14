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



public class Newzealand extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JButton backbt;
Newzealand ()
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

      
        img5= new ImageIcon(getClass().getResource("nz.png"));
        JLabel imgLabel1 = new JLabel(img5);
        imgLabel1.setBounds(550,40,img5.getIconWidth(),img5.getIconHeight());
        c5.add(imgLabel1);
        
     }
 public void initComp2() {

      c5 = this.getContentPane();
      c5.setLayout(null);
        f5=new Font("Arial",Font.ITALIC,16);
         
         textlabel1 = new JLabel();
         textlabel1.setText("The New Zealand national cricket team nicknamed the Black Caps,played their first Test in 1930 against England in Christchurch,becoming the fifth ");
         textlabel1.setBounds(180,260,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("country to play test cricket.From 1930 New Zealand had to wait until 1956,more than 26 years,for its first test win,against the West Indies at Eden");
         textlabel1.setBounds(180,280,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText(" Park in Auckland.They played their first ODI in 1972-73 season aginst Pakistan in Christchurch.The current Test,ODI and T20I captain is Kane ");
         textlabel1.setBounds(180,300,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("Williamson,who replaced Brendon McCullum who announced retirement in late December,2015.The national team is organized by New Zealand cricket.");
         textlabel1.setBounds(180,320,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("The New Zealand cricket team became known as the Black Caps in January 1998,after its sponsor at the time,clear communications,held a competition");
         textlabel1.setBounds(180,340,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("to choose a name for the team.Official New Zealand Cricket sources typeset the nickname as BLACKCAPS.This is one of many national team");
         textlabel1.setBounds(180,360,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("nicknames related to the All Blacks.");
         textlabel1.setBounds(180,380,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("As of 3 April 2018,New Zealand have played 426 test matches,winning 92,losing 170 and drawing 164.The team ranked 3rd in tests,4th in ODIs and ");
         textlabel1.setBounds(180,400,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
          textlabel1 = new JLabel();
         textlabel1.setText("4th in T20Is by the ICC.New Zealand reached the Final match in the ICC cricket world cup for the first time in its history,beating South Africa ");
         textlabel1.setBounds(180,420,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("in the Semi-Final in 2015.");
         textlabel1.setBounds(180,440,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            
 }
   public void initComp3()
      {
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(120,540,80,30);
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
    Newzealand  frame5=new Newzealand ();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1380,730);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}

    

