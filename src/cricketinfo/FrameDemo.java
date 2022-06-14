/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketinfo;

//FrameDemo1 connected
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class FrameDemo extends JFrame {

    private ImageIcon icon;
    private Container c;
     private ImageIcon img;
    private JLabel imglabel;
    private JLabel textlabel,textlabel1;
    private JButton strtbt;
    private Font f;
   

    FrameDemo() {
        this.setDefaultCloseOperation(FrameDemo.EXIT_ON_CLOSE);
        initComponents();
        initComponents1();
        initComponents2();
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
        
      f=new Font("Arial",Font.BOLD, 20);
         textlabel = new JLabel();
         textlabel.setText("WELCOME TO CRICKETINFO......");
         textlabel.setForeground(Color.WHITE);
         textlabel.setBounds(50,50,500,100);
         textlabel.setFont(f);
         c.add(textlabel);
         textlabel1 =new JLabel();
         textlabel1.setText("CLICK 'START' Button to go FORWARD");
          textlabel1.setForeground(Color.WHITE);
         textlabel1.setBounds(100,75,500,100);
         textlabel1.setFont(f);
         c.add(textlabel1);
        
    }
     public void initComponents2() {

     
        
         strtbt=new JButton();
         strtbt.setText("START");
         strtbt.setBounds(350,300,80,30);
         c.add(strtbt);
         strtbt.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
                FrameDemo1 f1=new FrameDemo1();
                f1.setVisible(true);
                f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
               
             }
         });
        
         
     }
     
      public void initComponents3() {

        img = new ImageIcon(getClass().getResource("tk1.jpg"));
        JLabel imgLabel = new JLabel(img);
        imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        c.add(imgLabel);
        
        

    }
   
        
    public static void main(String[] args) {
        FrameDemo frame1 = new FrameDemo();
      
        frame1.setBounds(380,100,800,480);
        frame1.setTitle("CricketInfo");
        frame1.setResizable(false);
        
          frame1.setVisible(true);
        
     }  
}