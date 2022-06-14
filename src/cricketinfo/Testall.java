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



public class  Testall extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JButton backbt;
Testall()
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
         textlabel1.setText("ICC TEST ALL_ROUNDER RANKINGS:");
         textlabel1.setBounds(450,20,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("Players Name                            Country                                     Rating");
         textlabel1.setBounds(200,100,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText("1.Shakib Al Hasan                   Bangladesh                                   411  ");
         textlabel1.setBounds(200,140,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("2.Ravindra Jadeja                    India                                              400  ");
         textlabel1.setBounds(200,180,1000,100); 
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("3.Jason Holder                       West Indies                                    380  ");
         textlabel1.setBounds(200,220,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("4.Vernon Philander                South Africa                                   370  ");
         textlabel1.setBounds(200,260,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("5.Ben Stokes                           England                                        341  ");
         textlabel1.setBounds(200,300,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("6.Ravi Ashwin                           India                                            341  ");
         textlabel1.setBounds(200,340,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("7.Moeen Ali                             England                                        299  ");
         textlabel1.setBounds(200,380,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("8.Chris Woakes                      England                                        248  ");
         textlabel1.setBounds(200,420,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("9.Mitchel Starc                        Australia                                       246  ");
         textlabel1.setBounds(200,460,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("10.Pat Cummins                     Australia                                       239  ");
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
               AllRanking f2=new AllRanking();
            f2.setVisible(true);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
             }
         });
      }
 
    public static void main(String[] args)
    {
Testall frame5=new Testall();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1380,720);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}

