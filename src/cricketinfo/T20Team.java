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



public class  T20Team extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JButton backbt;
T20Team()
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
         textlabel1.setText("ICC T20 TEAM RANKINGS:");
         textlabel1.setBounds(450,20,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("Team                                          Points                                       Rating");
         textlabel1.setBounds(200,100,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText("1.Pakistan                                  4,979                                           138   ");
         textlabel1.setBounds(200,140,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("2.India                                        5,298                                           126  ");
         textlabel1.setBounds(200,180,1000,100); 
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("3.England                                  2,586                                           118  ");
         textlabel1.setBounds(200,220,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("4.Australia                                 3,266                                           117 ");
         textlabel1.setBounds(200,260,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("5.South Africa                           2,502                                           114  ");
         textlabel1.setBounds(200,300,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("6.New Zealand                         2,803                                           112  ");
         textlabel1.setBounds(200,340,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("7.West Indies                            2,444                                          102  ");
         textlabel1.setBounds(200,380,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("8.Afghanistan                           2,490                                            92  ");
         textlabel1.setBounds(200,420,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("9.Sri Lanka                               2,518                                            87  ");
         textlabel1.setBounds(200,460,1000,100);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("10.Bangladesh                         2,066                                            77");
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
 T20Team frame5=new T20Team();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1365,725);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}

