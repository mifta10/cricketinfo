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



public class SouthAfrica extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JButton backbt;
SouthAfrica()
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

      
        img5= new ImageIcon(getClass().getResource("sa.png"));
        JLabel imgLabel1 = new JLabel(img5);
        imgLabel1.setBounds(570,110,img5.getIconWidth(),img5.getIconHeight());
        c5.add(imgLabel1);
        
     }
 public void initComp2() {

      c5 = this.getContentPane();
      c5.setLayout(null);
        f5=new Font("Arial",Font.ITALIC,16);
         
         textlabel1 = new JLabel();
         textlabel1.setText("The Bangladesh national cricket team, nicknamed The Tigers, is administered by the Bangladesh Cricket Board (BCB). Bangladesh is a full member ");
         textlabel1.setBounds(180,260,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("The South Africa national cricket team,nicknamed Proteas(after South Africa's national flower,Protea cynaroides),is administred by Cricket South ");
         textlabel1.setBounds(180,280,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText("Africa.South Africa is a full member of the international cricket council(ICC) with test,ODIs,and T20Is status.");
         textlabel1.setBounds(180,300,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("South Africa entered first-class and international cricket at the same time when they hosted an England cricket team in the 188-1889 season.");
         textlabel1.setBounds(180,320,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("At first,the team was no match for Australia and England but having gained in experiance and expertise,they were able to field a competitive team");
         textlabel1.setBounds(180,340,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("in the first decade of 20th century.The team regularly played tests against Australia,England and New Zealand through to the 1960s,by which time there");
         textlabel1.setBounds(180,360,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText(" was considerable opposition to the country's apartheid policy and an international ban was imposed by ICC,commensurate with actions taken by other ");
         textlabel1.setBounds(180,380,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("bodies.When the ban was imposed,South Africa had developed to a point where its team including Eddie Barlow,Graeme Pollock and Mike Procter was ");
         textlabel1.setBounds(180,400,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
          textlabel1 = new JLabel();
         textlabel1.setText(" the best in the world and had just outplayed Australia.The ban remained inplace until 1991 and South Africa could then play against India,Pakistan,");
         textlabel1.setBounds(180,420,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("Srilanka and the West Indies for the first time.The team since reinstatement has mostly been strong and has at times held number one positions in ");
         textlabel1.setBounds(180,440,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("international rankings but has lacked success in organized tournaments.Outstandings Players since reinstatement have included Allan Donald,Makhaya ");
         textlabel1.setBounds(180,460,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
            textlabel1 = new JLabel();
         textlabel1.setText("Ntini,Shaun Pollock,Jacques Kallis,Graeme Smith,Kagiso Rabada,AB de Villiers,Dale Steyn,Hashim Amla,Faf du Plessis.");
         textlabel1.setBounds(180,480,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         textlabel1 = new JLabel();
         textlabel1.setText("Currently ranked 1st in Test,1st in ODIs and 3rd in T20Is captaining by Faf du Plessis.");
         textlabel1.setBounds(180,500,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
 }
   public void initComp3()
      {
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(120,630,80,30);
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
SouthAfrica frame5=new SouthAfrica();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1380,730);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}
