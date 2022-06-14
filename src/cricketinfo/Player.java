
package cricketinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Player {
    public void InsertUpdateDeletePlayer(char operation,Integer id,String name,String category )
    {
        Connection con=SqlConnection.getConnection();
        PreparedStatement ps;
        //i for insert
        if(operation=='i')
        {
            try {
                ps=con.prepareStatement("INSERT INTO event( name,category) VALUES (?,?)");
                ps.setString(1,name);
              ps.setString(2,category);
//                ps.setString(3,sex);
//                ps.setString(4,bdate);
//                ps.setString(5,phone);
//                 ps.setString(6,adress);
                  if(ps.executeUpdate()>0)
                  {
                      JOptionPane.showMessageDialog(null,"New event Added");
                  }
            } catch (SQLException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //u for update
//         if(operation=='u')
//        {
//            try {
//                ps=con.prepareStatement("UPDATE `player` SET `first_name`= ?,`last_name`= ?,`sex`= ?,`birthdate`= ?,`phone`= ?,`adress`= ? WHERE `id`=?");
//                 ps.setString(1,fname);
//                ps.setString(2,lname);
//                ps.setString(3,sex);
//                ps.setString(4,bdate);
//                ps.setString(5,phone);
//                 ps.setString(6,adress);
//                 ps.setInt(7, id);
//                 
//                  if(ps.executeUpdate()>0)
//                  {
//                      JOptionPane.showMessageDialog(null,"Player Data Updated");
//                  }
//            } catch (SQLException ex) {
//                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//          //d for deleteupdate
//         if(operation=='d')
//        {
//            try {
//                ps=con.prepareStatement("DELETE FROM `player`  WHERE `id`=?");
//               ps.setInt(1, id);
//                  if(ps.executeUpdate()>0)
//                  {
//                      JOptionPane.showMessageDialog(null,"Player Data Removed");
//                  }
//            } catch (SQLException ex) {
//                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//    public void fillPlayerJtable(JTable table,String ValueToSearch)
//    {
//        Connection con=cnc.getConnection();
//        PreparedStatement ps;
//        try
//        {
//             ps=con.prepareStatement("SELECT * FROM player WHERE CONCAT(first_name,last_name,phone,adress)LIKE ?");
//             ps.setString(1,"%"+ValueToSearch+"%");
//             ResultSet rs=ps.executeQuery();
//             DefaultTableModel model=(DefaultTableModel)table.getModel();
//             
//             Object[] row;
//             
//             while(rs.next())
//                     {
//                         row=new Object[7];
//                         row[0]=rs.getInt(1);
//                         row[1]=rs.getString(2);
//                         row[2]=rs.getString(3);
//                         row[3]=rs.getString(4);
//                         row[4]=rs.getString(5);
//                         row[5]=rs.getString(6);
//                          row[6]=rs.getString(7);
//                        model.addRow(row);
//                     }
//        }
//         catch (SQLException ex) {
//                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        
//    }
    
}
     public void fillPlayerJtable(JTable table)
    {
        Connection con=SqlConnection.getConnection();
        PreparedStatement ps;
        try
        {
             ps=con.prepareStatement("SELECT * FROM `event`");
             ResultSet rs=ps.executeQuery();
             DefaultTableModel model=(DefaultTableModel)table.getModel();
             
             Object[] row;
             
             while(rs.next())
                     {
                         row=new Object[3];
                         row[0]=rs.getInt(1);
                         row[1]=rs.getString(2);
                         row[2]=rs.getString(3);
                        
                         
                        model.addRow(row);
                     }
        }
         catch (SQLException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

   
    

   

    
    
}
