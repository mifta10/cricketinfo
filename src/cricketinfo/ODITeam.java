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



public class  ODITeam extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JButton backbt;
ODITeam()
{
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    initComp();
     initComp2();
     initComp3();
}
public void initComp() {

        c5 = this.getContentPane();
        c5.setBackground(Color.white);
        icon5 = new ImageIcon(getClass().getResource("images-1.png"));
        this.setIconImage(icon5.getImage());

    }
 
 public void initComp2() {

      c5 = this.getContentPane();
      c5.setLayout(null);
      c5.setBackground(Color.LIGHT_GRAY);
        f5=new Font("Arial",Font.ITALIC,30);
         
         textlabel1 = new JLabel();
         textlabel1.setText("ICC ODI TEAM RANKINGS:");
         textlabel1.setBounds(450,20,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("Team                                         Points                                       Rating");
         textlabel1.setBounds(200,100,1380,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText("1.England                                  6,918                                         126  ");
         textlabel1.setBounds(200,140,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("2.India                                        7,000                                         121  ");
         textlabel1.setBounds(200,180,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("3.New Zealand                         4,803                                          112  ");
         textlabel1.setBounds(200,220,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("4.South Africa                           4,985                                          111 ");
         textlabel1.setBounds(200,260,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("5.Pakistan                                 4,370                                          102  ");
         textlabel1.setBounds(200,300,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("6.Australia                                3,980                                           100  ");
         textlabel1.setBounds(200,340,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("7.Bangladesh                           3,342                                            93  ");
         textlabel1.setBounds(200,380,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("8.Sri Lanka                               4,240                                            79  ");
         textlabel1.setBounds(200,420,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("9.West Indies                           2,670                                            72  ");
         textlabel1.setBounds(200,460,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("10.Afghanistan                        2,394                                             67  ");
         textlabel1.setBounds(200,500,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
 }
   public void initComp3()
      {
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(40,610,80,30);
         c5.add(backbt);
         backbt.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
               TeamRanking f2=new  TeamRanking();
            f2.setVisible(true);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
             }
         });
      }
 
    public static void main(String[] args)
    {
 ODITeam frame5=new ODITeam();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1365,725);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}

