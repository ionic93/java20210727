package dao;

import vo.UserVO;

import java.sql.SQLException;

public class DaoUser extends DaoSet{
   public void checkLogin(String id, String pw){
      try {
         conn = connDB();
         String query = "Select * from demo_users where id='"+id+"' and password='"+pw+"'";
         pstmt = conn.prepareStatement(query);
         rs = pstmt.executeQuery(); //resultset
         if (rs.next()) {
            UserVO user = new UserVO(rs.getInt(1), rs.getString(2),
                    rs.getString(3),rs.getDate(4), rs.getInt(5),
                    rs.getString(6),rs.getDate(7), rs.getString(8),
                    rs.getString(9));
         }

      } catch (SQLException throwables) { throwables.printStackTrace();}
   }
}
