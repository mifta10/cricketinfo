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



public class  Srilanka  extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JButton backbt;
 Srilanka()
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

      
        img5= new ImageIcon(getClass().getResource("sri.png"));
        JLabel imgLabel1 = new JLabel(img5);
        imgLabel1.setBounds(550,50,img5.getIconWidth(),img5.getIconHeight());
        c5.add(imgLabel1);
        
     }
 public void initComp2() {

      c5 = this.getContentPane();
      c5.setLayout(null);
        f5=new Font("Arial",Font.ITALIC,16);
         
         textlabel1 = new JLabel();
         textlabel1.setText("The Srilanka national cricket team,nicknamed The Lions,represents Sri Lanka international cricket.It is a full member of the international Cricket ");
         textlabel1.setBounds(180,260,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("Council(ICC) with test,ODI and T20I status.The team first played intenational cricket (as Ceylon) in 1926-27,and were later awarded Tedt status in ");
         textlabel1.setBounds(180,280,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText("1982,which made Sri Lanka the eighth Test cricket playing nation.The team is administred by Sri Lanka Cricket.The current captain of the Sri Lankan ");
         textlabel1.setBounds(180,300,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("cricket team in test matches and ODIs is Dinesh Chandimal.");
         textlabel1.setBounds(180,320,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("Sri Lanka's national cricket team achieved considerable success begining in the 1990s,rising from underdog status to winning the cricket world cup ");
         textlabel1.setBounds(180,340,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("in 1996.Since then,the team has continued to be a force in international cricket.The Sri Lankan cricket team reached world cup finals in 2007 and ");
         textlabel1.setBounds(180,360,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("2011 consecutively.But They ended up being runners up in both those occasions.The batting of Sanath Jayasuriya,Aravind De Silva,Mahela ");
         textlabel1.setBounds(180,380,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("Jayawaredene,Kumar Sangakkara and Tilkaratne Dilshan backed up by the bowling of Muttiah Muralitharan,Chaminda Vaas,Lasith Malinga,Ajantha ");
         textlabel1.setBounds(180,400,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
          textlabel1 = new JLabel();
         textlabel1.setText("Mendis,Rangana Hearath,among many other talented cricketers,has underpinned the successes of Sri Lankan cricket in the last two decades.");
         textlabel1.setBounds(180,420,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("Srilanka have won the Cricket world cup in 1996,the ICC Champions trophy in 2002(co-champions with India),and have won ICC world ");
         textlabel1.setBounds(180,440,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("T20I in 2014.They have been consecutive runners up in the 2007 and 2011 world cups,and have been runners up in 2009 ICC world T20I");
         textlabel1.setBounds(180,460,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText(" and 2012.The Srilankan cricket team holds several records,including the world record for highest team total in Test cricket.. ");
         textlabel1.setBounds(180,480,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
 }
   public void initComp3()
      {
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(140,620,80,30);
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
    Srilanka  frame5=new  Srilanka();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1380,730);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}

    


