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



public class Westindies extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JButton backbt;
Westindies()
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

      
        img5= new ImageIcon(getClass().getResource("wi.png"));
        JLabel imgLabel1 = new JLabel(img5);
        imgLabel1.setBounds(550,70,img5.getIconWidth(),img5.getIconHeight());
        c5.add(imgLabel1);
        
     }
 public void initComp2() {

      c5 = this.getContentPane();
      c5.setLayout(null);
        f5=new Font("Arial",Font.ITALIC,16);
         
         textlabel1 = new JLabel();
         textlabel1.setText("The West Indies cricket team,colloquially known as and (since June 2017)officially branded as the Windies,is a multi national cricket team representing");
         textlabel1.setBounds(180,260,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText(" the Anglophone Carribean region and administred by Cricket West Indies.A composite team,players are selected from a chain of 15 carribean territories,");
         textlabel1.setBounds(180,280,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText(" most of which are English speaking Carribean,which comprise several countries and dependencies.As of 24 June 2018,the West Indian Cricket team is ranked");
         textlabel1.setBounds(180,300,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText(" ninth in tests,ninth in ODIs and seventh in T20Is in the official ICC rankings.From the mid late 1970s to the early 1990s,the West Indies team was the ");
         textlabel1.setBounds(180,320,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("strongest in the world both in test and ODIs.A number of cricketers who were considered among the best in the world have hailed from the West Indies:");
         textlabel1.setBounds(180,340,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("Sir Garfield Sobers,Lance Gibbs,Gordon Grrenidge,George Headly,Brian Lara,Clive Lloyd,Sir Andy Roberts,Courtney Walsh,Sir Viv Richards,Curtly Ambrose ");
         textlabel1.setBounds(180,360,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText(" all been inducted into the ICC Hall Of Fame. ");
         textlabel1.setBounds(180,380,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("The West Indies won ICC world cup twice in 1975 and 1979,the ICC world T20I twice in 2012 and 2016,the ICC champions Trophy once in 2004.The West Indies ");
         textlabel1.setBounds(180,400,1380,1200);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
          textlabel1 = new JLabel();
         textlabel1.setText("is the first team to win back-to-back world cups(1975 and 1979),and appeared in three consecutive World Cup finals(1975,1979 and 1983)");
         textlabel1.setBounds(180,420,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("The West Indies has Hosted the 2007 cricket world cup,2010 ICC world T20I.Currently captaining by Jason Holder in Tests nad ODIs.Carlos ");
         textlabel1.setBounds(180,440,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("Brathwaite in T20Is.Phil Simmons is the Coach");
         textlabel1.setBounds(180,460,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            
 }
   public void initComp3()
      {
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(100,580,80,30);
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
Westindies frame5=new Westindies();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1380,730);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}
