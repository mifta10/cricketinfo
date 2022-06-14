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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

//FrameDemo,Pbdata,Team Info connected
public class FrameDemo1 extends JFrame
{
      private ImageIcon icon1;
    private Container c1;
    private JLabel textlabel1;
    private JButton submitbt;
    private JButton backbt;
    private ButtonGroup grp;
    private ImageIcon img1;
    private JLabel imglabel1;
    private Font f1;
    FrameDemo1()
    {
         this.setDefaultCloseOperation(FrameDemo.EXIT_ON_CLOSE);
        init();
        init1();
        init2();
        init10();
    }
     public void init() {

        c1 = this.getContentPane();
        c1.setBackground(Color.white);
        icon1 = new ImageIcon(getClass().getResource("images-1.png"));
        this.setIconImage(icon1.getImage());

    }
      public void init1() {

      c1 = this.getContentPane();
      c1.setLayout(null);
        f1=new Font("Arial",Font.ITALIC,25);
         textlabel1 = new JLabel();
         textlabel1.setText("WHAT TYPES OF INFORMATION DO YOU WANT TO GET?");
         textlabel1.setBounds(300,5,800,100);
         textlabel1.setFont(f1);
         c1.add(textlabel1);
        
    }
      public void init2(){
          grp =new ButtonGroup();
         c1=this.getContentPane();
         c1.setLayout(null);
         
         JRadioButton rb1=new JRadioButton();
          rb1.setText("Team Information");
          rb1.setBounds(500,110,200,55);
          c1.add(rb1);
          JRadioButton rb2=new JRadioButton();
          rb2.setText("ICC Rankings");
          rb2.setBounds(500,170,200,55);
          c1.add(rb2);
         
   
           JRadioButton rb3=new JRadioButton();
          rb3.setText("Players Biodata");
          rb3.setBounds(500,230,200,55);
          c1.add(rb3);
        
      
          JRadioButton rb4=new JRadioButton();
          rb4.setText("Players Stats");
          rb4.setBounds(500,290,200,55);
          c1.add(rb4);
      
          JRadioButton rb5=new JRadioButton();
          rb5.setText("Upcoming Events & Schedules");
          rb5.setBounds(500,350,200,55);
          c1.add(rb5);
   
          JRadioButton rb6=new JRadioButton();
          rb6.setText("Unknown Records");
          rb6.setBounds(500,410,200,55);
          c1.add(rb6);
          grp.add(rb1);
          grp.add(rb2);
          grp.add(rb3);
          grp.add(rb4);
          grp.add(rb5);
          grp.add(rb6);
          
            submitbt=new JButton();
         submitbt.setText("Submit");
         submitbt.setBounds(790,570,80,30);
         c1.add(submitbt);
         submitbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
				
			
				if(rb1.isSelected()){
                                    dispose();
					TeamInfo f=new TeamInfo();
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				
                                else if(rb2.isSelected())
                                {
                                    dispose();
					ICCrank f=new ICCrank();
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);		
				}	
                                 else if(rb3.isSelected())
                                {
                                    dispose();
					Work f=new Work();
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);		
				}	
                                 else if(rb4.isSelected())
                                {
                                    dispose();
					TeamName f=new TeamName();
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);		
				}	
                                 else if(rb5.isSelected())
                                {
                                    dispose();
                                    Event f=new Event();
					
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);		
				}
                                 else{
                                     dispose();
                                     Records f=new Records();
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
                                 }
			}
		});
}
     
      
       public void init10() {

      
        img1 = new ImageIcon(getClass().getResource("2.jpg"));
        JLabel imgLabel1 = new JLabel(img1);
        imgLabel1.setBounds(35,0,img1.getIconWidth(),img1.getIconHeight());
        c1.add(imgLabel1);
        
        

    }
         
    public static void main(String[] args) {
        
    
        FrameDemo1 frame2 = new FrameDemo1();
        

        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame2.setBounds(0,0, 1370,730);
        frame2.setTitle("CricketInfo");
        frame2.setResizable(false);
        
        frame2.setVisible(true);
    }
}  



