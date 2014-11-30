/**
 * 
 */
package edu.fjnu.hm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.fjnu.hm.sever.Student;

/**
 * @author chao
 *
 */
public class Studentdao extends DBHelp {
	public boolean SaveUserInfo(Student m)
	{
		
		
		
		String sql="update RM_Manager set MName='"+m.getSName()+"',MSex='"+m.getSSex()+"',MPC='"+m.getSPC()+
				"',MNP='"+m.getSNP()+"',MNation='"+m.getSNation()+"',MBP='"+m.getSBP()+"',MTel='"+m.getSTel()+
				"',MBD='"+m.getSBD()+"',MICN='"+m.getSICN()+"',MImage='"+m.getSImage()+"' where MId='"+m.getSId()+"'";
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
