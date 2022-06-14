package cricketinfo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Work extends JFrame implements ActionListener{
    JLabel JL_fname,JL_lname,JL_nn,JL_age,JL_player_name,JL_bs,JL_bws,JL_bc,JL_pl,JL_mt,JL_id;
    JTextField JT_fname,JT_lname,JT_nn,JT_age,JT_player_name,JT_bs,JT_bws,JT_bc,JT_pl,JT_mt,JT_id;
    JButton btn_search,backbt;
     private Container c2;
     private ImageIcon icon2;
     private ImageIcon img2;
     private Font f1;
    
   

      public Work(){
          initC();
          initC4();
          initC1();
                  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          c2 = this.getContentPane();
      c2.setLayout(null);
       c2.setBackground(Color.LIGHT_GRAY);
        
      f1=new Font("Arial",Font.BOLD,18);
          JL_player_name = new JLabel("Enter Player Name:");
          JL_player_name.setBounds(500, 50, 300, 20);
          JL_player_name.setFont(f1);
          JT_player_name = new JTextField(20);
          JT_player_name.setBounds(700, 50, 200, 20);
          btn_search = new JButton("Search");
          btn_search.setBounds(920, 50, 110, 20);
          btn_search.setFont(f1);
          btn_search.addActionListener(this);
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setLocationRelativeTo(null);
          setSize(500,200);
          
          JL_fname = new JLabel("Player Name: ");
          JL_fname.setBounds(500, 100, 300, 20);
          JL_fname.setFont(f1);
          JT_fname = new JTextField(20);
          JT_fname.setBounds(700, 100, 300, 20);
          JL_lname = new JLabel("Country: ");
          JL_lname.setBounds(500, 150, 300, 20);
          JL_lname.setFont(f1);
          JT_lname = new JTextField(20);
          JT_lname.setBounds(700, 150, 300, 20);
          JL_nn = new JLabel("Nick Name: ");
          JL_nn.setBounds(500, 200, 300, 20);
          JL_nn.setFont(f1);
          JT_nn = new JTextField(20);
          JT_nn.setBounds(700, 200, 300, 20);
          JL_age = new JLabel("Age: ");
          JL_age.setBounds(500, 250, 300, 20);
         JL_age.setFont(f1);
          JT_age = new JTextField(20);
          JT_age.setBounds(700, 250, 300, 20);
          JL_pl = new JLabel("Playing Role: ");
          JL_pl.setBounds(500, 300, 300, 20);
         JL_pl.setFont(f1);
          JT_pl = new JTextField(20);
          JT_pl.setBounds(700, 300, 300, 20);
          JL_bs = new JLabel("Batting Style: ");
          JL_bs.setBounds(500, 350, 300, 20);
          JL_bs.setFont(f1);
          JT_bs = new JTextField(20);
          JT_bs.setBounds(700, 350, 300, 20);
          setLayout(null);
          JL_bws = new JLabel("Bowling Style: ");
          JL_bws.setBounds(500, 400, 300, 20);
          JL_bws.setFont(f1);
          JT_bws = new JTextField(20);
          JT_bws.setBounds(700, 400, 300, 20);
          JL_mt = new JLabel("Major Team: ");
          JL_mt.setBounds(500, 450, 300, 20);
         JL_mt.setFont(f1);
          JT_mt = new JTextField(20);
          JT_mt.setBounds(700, 450, 300, 20);
           JL_bc = new JLabel("Born City: ");
          
          JL_bc.setBounds(500, 500, 300, 20);
          JL_bc.setFont(f1);
          JT_bc = new JTextField(20);
          JT_bc.setBounds(700, 500, 300, 20);
          JL_id = new JLabel("International Debut: ");
          JL_id.setBounds(500, 550, 300, 20);
         JL_id.setFont(f1);
          JT_id = new JTextField(20);
          JT_id.setBounds(700, 550, 300, 20);
          setLayout(null);
          add(btn_search);
          add(JL_fname);
          add(JT_fname);
          add(JL_lname);
          add(JT_lname);
          add(JL_nn);
          add(JT_nn);
          add(JL_age);
          add(JT_age);
          add(JL_player_name);
          add(JT_player_name);
          add(JL_bs);
          add(JT_bs);
           add(JL_bws);
          add(JT_bws);
           add(JL_bc);
          add(JT_bc);
            add(JL_pl);
          add(JT_pl);
            add(JL_mt);
          add(JT_mt);
            add(JL_id);
          add(JT_id);
    }

    @Override
    public void actionPerformed(ActionEvent e) { 
    Function f = new Function();
    ResultSet rs = null;
    String fn = "player_name";
    String ln = "country";
    String nn = "nickname";
    String ag="age";
    String pl="playing_role";
     String bs="batting_style";
      String bws="bowl_style";
      String mt="major_team";
      String bc="born_city";
      String id="intl_debut";
    
    rs = f.find(JT_player_name.getText());
    try{
      if(rs.next()){
          JT_fname.setText(rs.getString("player_name"));
            JT_lname.setText(rs.getString("country"));
              JT_nn.setText(rs.getString("nickname"));
              JT_age.setText(rs.getString("age"));
              JT_pl.setText(rs.getString("playing_role"));
              JT_bs.setText(rs.getString("batting_style"));
              JT_bws.setText(rs.getString("bowl_style"));
              JT_mt.setText(rs.getString("major_team"));
               JT_bc.setText(rs.getString("born_city"));
               JT_id.setText(rs.getString("intl_debut"));
      }  else{
          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS PLAYER");
      }
    }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    }
   public class Function{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
           try{
           con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/infocricket", "root", "");
           ps = con.prepareStatement("select * from khan where player_name= ?");
           ps.setString(1,s);
           rs = ps.executeQuery();
           }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs;
       }
   }
         
    public void initC()
    {
           c2 = this.getContentPane();
        c2.setBackground(Color.white);
        icon2= new ImageIcon(getClass().getResource("images-1.png"));
        this.setIconImage(icon2.getImage());
    }
    public void initC4()
             {
    f1=new Font("Arial",Font.BOLD,18);
            backbt=new JButton();
         backbt.setText("Back");
         backbt.setBounds(50,600,100,30);
         backbt.setFont(f1);
         c2.add(backbt);
         backbt.addActionListener(new ActionListener() {
       
             @Override
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                FrameDemo1 f2=new FrameDemo1();
            f2.setVisible(true);
             f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
            
                
         
               
             }
         });
             }
     
      public void initC1() {

        img2 = new ImageIcon(getClass().getResource("icon.jpg"));
        JLabel imgLabel = new JLabel(img2);
        imgLabel.setBounds(200,250,img2.getIconWidth(),img2.getIconHeight());
        c2.add(imgLabel);
        
        

    }
   

    
 public static void main(String[] args){
  Work frame3=new Work();
  frame3.setVisible(true);

        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame3.setBounds(0,0,1380,730);
        frame3.setTitle("CricketInfo");
        frame3.setResizable(false);
 }
 
   }