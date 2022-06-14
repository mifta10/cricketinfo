
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


public class  ICCrank extends JFrame {

    private ImageIcon icon;
    private Container c;
    private ImageIcon img;
    private JLabel textlabel;
    private Font f;
    private ButtonGroup grp;
    private JButton submitbt,backbt;
   

     ICCrank() {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        initComponents1();
        initComponents4();
         initComponents3();
        
    }
    public void initComponents()
    {
         c = this.getContentPane();
        c.setBackground(Color.white);
        icon= new ImageIcon(getClass().getResource("images-1.png"));
        this.setIconImage(icon.getImage());
    }
    
   
     
     public void initComponents1() {

      c = this.getContentPane();
      c.setLayout(null);
        
      f=new Font("Arial",Font.BOLD,22);
         textlabel = new JLabel();
         textlabel.setText("ICC Rankings-----");
         textlabel.setForeground(Color.WHITE);
         textlabel.setBounds(210,80,500,100);
         textlabel.setFont(f);
         c.add(textlabel);
        
        
    }
    
        
         
     
    
      public void initComponents4(){
          grp =new ButtonGroup();
         c=this.getContentPane();
         c.setLayout(null);
         
         JRadioButton rb1=new JRadioButton();
          rb1.setText("Team Rankings");
          rb1.setBounds(400,160,150,30);
          c.add(rb1);
          JRadioButton rb2=new JRadioButton();
          rb2.setText("Batsmen Ranking");
          rb2.setBounds(400,220,150,30);
          c.add(rb2);
         
   
           JRadioButton rb3=new JRadioButton();
          rb3.setText("Bowler Ranking");
          rb3.setBounds(400,280,150,30);
          c.add(rb3);
        
      
          JRadioButton rb4=new JRadioButton();
          rb4.setText("All Rounders Ranking");
          rb4.setBounds(400,340,150,30);
          c.add(rb4);
      
          
          grp.add(rb1);
          grp.add(rb2);
          grp.add(rb3);
          grp.add(rb4);
         
          
            submitbt=new JButton();
         submitbt.setText("Submit");
         submitbt.setBounds(900,440,80,30);
         c.add(submitbt);
         submitbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
				
			
				if(rb1.isSelected()){
                                    dispose();
					TeamRanking f=new TeamRanking();
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				
                                else if(rb2.isSelected())
                                {
                                    dispose();
					BatsmenRanking f=new BatsmenRanking();
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);		
				}	
                                 else if(rb3.isSelected())
                                {
                                    dispose();
					BowlerRanking f=new BowlerRanking();
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);		
				}	
                               
                                 else{
                                     dispose();
                                     AllRanking f=new AllRanking();
                                        f.setVisible(true);
                                        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
                                 }
			}
		});
         
           
            backbt=new JButton();
         backbt.setText("Back");
          backbt.setBounds(120,440,80,30);
         c.add(backbt);
          backbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
                            dispose();
				FrameDemo1 f=new FrameDemo1();
                                f.setVisible(true);
                                f.setExtendedState(JFrame.MAXIMIZED_BOTH);
                                }
          });
                  
}
       public void initComponents3() {

        img = new ImageIcon(getClass().getResource("h11.jpg"));
        JLabel imgLabel = new JLabel(img);
        imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        c.add(imgLabel);
        
        

    }
        
    public static void main(String[] args) {
        ICCrank frame1 = new  ICCrank();
      
      
        

        frame1.setBounds(0,0,1380,730);
        frame1.setTitle("CricketInfo");
        frame1.setExtendedState(JFrame.DISPOSE_ON_CLOSE);
        
          frame1.setVisible(true);
        
     }  
}
