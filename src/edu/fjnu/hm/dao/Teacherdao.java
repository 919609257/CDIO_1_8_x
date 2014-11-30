/**
 * 
 */
package edu.fjnu.hm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import edu.fjnu.hm.sever.Teacher;

/**
 * @author chao
 *
 */
public class Teacherdao extends DBHelp {
	public boolean SaveUserInfo(Teacher m)
	{
		
		
		
		String sql="update RM_Manager set MName='"+m.getTName()+"',MSex='"+m.getTSex()+"',MPC='"+m.getTPC()+
				"',MNP='"+m.getTNP()+"',MNation='"+m.getTNation()+"',MBP='"+m.getTBP()+"',MTel='"+m.getTTel()+
				"',MBD='"+m.getTBD()+"',MICN='"+m.getTICN()+"',MImage='"+m.getTImage()+"' where MId='"+m.getTId()+"'";
		 Connection conn=null;
		 PreparedStatement prepStmt=null;
		 ResultSet rs=null;
		 
		 try {
			 conn=this.getConnection();
			 //prepStmt=conn.prepareStatement(sql);
			 Statement stmt=conn.createStatement();
			 //rs=prepStmt.executeQuery(); 
			 stmt.executeUpdate(sql);
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeResultSet(rs);
			this.closePrepStmt(prepStmt);
			this.closeConnnection(conn);			
		}
		 return true;
		
		
	}

}
