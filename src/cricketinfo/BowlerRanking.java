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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

//FrameDemo,Pbdata,Team Info connected
public class BowlerRanking extends JFrame
{
      private ImageIcon icon1,img;
    private Container c1;
    private JLabel textlabel1;
    private JButton submitbt;
    private JButton backbt;
    private ButtonGroup grp;
    private Font f1;
    BowlerRanking()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        init1();
        init2();
        init9();
        init10();
      
    }
     public void init() {

        c1 = this.getContentPane();
        icon1 = new ImageIcon(getClass().getResource("images-1.png"));
        this.setIconImage(icon1.getImage());

    }
      public void init1() {

      c1 = this.getContentPane();
      c1.setLayout(null);
        f1=new Font("Arial",Font.BOLD,30);
         textlabel1 = new JLabel();
         textlabel1.setText("Select Format:");
         textlabel1.setForeground(Color.BLACK);
         textlabel1.setBounds(350,70,350,100);
         textlabel1.setFont(f1);
         c1.add(textlabel1);
        
    }
      public void init2(){
          grp =new ButtonGroup();
         c1=this.getContentPane();
         c1.setLayout(null);
         
         JRadioButton rb1=new JRadioButton();
          rb1.setText("Test");
          rb1.setBounds(500,200,150,50);
          c1.add(rb1);
          JRadioButton rb2=new JRadioButton();
          rb2.setText("ODI");
          rb2.setBounds(500,260,150,50);
          c1.add(rb2);
         
   
           JRadioButton rb3=new JRadioButton();
          rb3.setText("T20I");
          rb3.setBounds(500,320,150,50);
          c1.add(rb3);
        
      
          
         
          grp.add(rb1);
          grp.add(rb2);
          grp.add(rb3);
          
          
            submitbt=new JButton();
         submitbt.setText("Submit");
         submitbt.setBounds(900,450,80,30);
         c1.add(submitbt);
         submitbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
				
			
				if(rb1.isSelected()){
                                    dispose();
					Testbowl f=new Testbowl();
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				
                                else if(rb2.isSelected())
                                {
                                    dispose();
					ODIbowl f=new ODIbowl();
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);		
				}	
                                
                                 else{
                                    dispose();
                                     T20bowl f=new T20bowl();
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
                                 }
			}
		});
}
       public void init9()
      {
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(150,450,80,30);
         c1.add(backbt);
         backbt.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                ICCrank f2=new  ICCrank();
            f2.setVisible(true);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
         
               
             }
         });
      }
        public void init10() {

        img = new ImageIcon(getClass().getResource("bowlr.jpg"));
        JLabel imgLabel = new JLabel(img);
        imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        c1.add(imgLabel);
        
        

    }
       
    public static void main(String[] args) {
        
    
       BowlerRanking frame2 = new BowlerRanking();
        

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame2.setBounds(0,0,1370,730);
        frame2.setTitle("CricketInfo");
        frame2.setResizable(false);
        
        frame2.setVisible(true);
    }
}  
