package dao;

import controller.MainController;
import vo.UserVO;

import java.sql.SQLException;

public class DaoUser extends DaoSet{
   public UserVO checkLogin(String id, String pw){
      UserVO user = null;
      try {
         conn = connDB();
         String query = "Select * from demo_users where id='"+id+"' and password='"+pw+"'";
         pstmt = conn.prepareStatement(query); //쿼리문을 데이터베이스에 넘겨줌
         rs = pstmt.executeQuery(); //resultset 쿼리문 설정
         if (rs.next()) {
            user = new UserVO(rs.getInt(1), rs.getString(2),
                    rs.getString(3), rs.getDate(4), rs.getInt(5),
                    rs.getString(6), rs.getDate(7), rs.getString(8),
                    rs.getString(9));
            MainController.getInstance().setSession(user);
         }
      } catch (SQLException throwables) { throwables.printStackTrace();}
      return user;
   }
}
