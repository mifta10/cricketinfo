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



public class TravisHead extends JFrame {
     private ImageIcon icon5;
    private Container c5;
     private JLabel imglabel1;
      private ImageIcon img5;
       private Font f5;
         private JLabel textlabel1;
         private JButton backbt;
TravisHead ()
{
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    initComp();
    initComp1();
     initComp2();
     initComp3();
}
public void initComp() {

        c5 = this.getContentPane();
        c5.setBackground(Color.LIGHT_GRAY);
        icon5 = new ImageIcon(getClass().getResource("images-1.png"));
        this.setIconImage(icon5.getImage());

    }
 public void initComp1() {

      
        img5= new ImageIcon(getClass().getResource("aus15.jpg"));
        JLabel imgLabel1 = new JLabel(img5);
        imgLabel1.setBounds(550,50,img5.getIconWidth(),img5.getIconHeight());
        c5.add(imgLabel1);
        
     }
 public void initComp2() {

      c5 = this.getContentPane();
      c5.setLayout(null);
        f5=new Font("Arial",Font.ITALIC,20);
         
         textlabel1 = new JLabel();
         textlabel1.setText("Name: Travis Head");
         textlabel1.setBounds(547,207,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText("Format       Matches       Runs         Avg.       Strike Rate       Wickets       Economy       Avg.       Catches       Stumpings       HS       B.Bowl");
         textlabel1.setBounds(80,280,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
        
          textlabel1 = new JLabel();
         textlabel1.setText(" Test:           02               122        30.5           47.1                  00               3.33          54.9             --                  --              72          04/0");
         textlabel1.setBounds(80,320,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText(" ODI:           42             1273        34.4           90.3                  05               5.34          34.5             --                  --             128          16/3");
         textlabel1.setBounds(80,360,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
          textlabel1 = new JLabel();
         textlabel1.setText(" T20I:           16              319        26.5           130.2                00               7.77          22.2             --                  --             48              0/0");
         textlabel1.setBounds(80,400,1380,120);
         textlabel1.setFont(f5);
         c5.add(textlabel1);
         
            
 }
   public void initComp3()
      {
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(120,600,80,30);
         c5.add(backbt);
         backbt.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                Australiapl f2=new Australiapl();
            f2.setVisible(true);
                f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
         
               
             }
         });
      }
 
    public static void main(String[] args)
    {
    TravisHead  frame5=new TravisHead ();
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setBounds(0,0,1380,730);
        frame5.setTitle("CricketInfo");
        frame5.setResizable(false);
        
        frame5.setVisible(true);
        
    }
    
}