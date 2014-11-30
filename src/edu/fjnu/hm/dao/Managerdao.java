/**
 * 
 */
package edu.fjnu.hm.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import edu.fjnu.hm.sever.Manager;

/**
 * @author admin
 *
 */
public class Managerdao extends DBHelp {
	
	/**
	 * 从数据库读取个人信息
	 */
	public Manager getManager(Manager m,String mid){
		
		String sql="select * from RM_Manager where MId='"+mid+"'";
				
		Connection conn=null;
		 PreparedStatement prepStmt=null;
		 ResultSet rs=null;
		 
		 try {
			 conn=this.getConnection();
			 prepStmt=conn.prepareStatement(sql);
			 rs=prepStmt.executeQuery(); 
			while(rs.next()){
				m.setDatetime(rs.getString("MBD"));
				m.setMBP(rs.getString("MBP"));
				m.setMICN(rs.getString("MICN"));
				m.setMImage(rs.getString("MImage"));
				m.setMName(rs.getString("MName"));
				m.setMNation(rs.getString("MNation"));
				m.setMNP(rs.getString("MNP"));
				m.setMPC(rs.getString("MPC"));
				m.setMSex(rs.getString("MSex"));
				m.setMTel(rs.getString("MTel"));
			 } 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeResultSet(rs);
			this.closePrepStmt(prepStmt);
			this.closeConnnection(conn);			
		}
		 
		return m;
	}

	
	/**
 *保存个人信息 
 * @param sql
 * @return
 */
	public boolean SaveUserInfo(Manager m)
	{
		
		
		
		String sql="update RM_Manager set MName='"+m.getMName()+"',MSex='"+m.getMSex()+"',MPC='"+m.getMPC()+
				"',MNP='"+m.getMNP()+"',MNation='"+m.getMNation()+"',MBP='"+m.getMBP()+"',MTel='"+m.getMTel()+
				"',MBD='"+m.getDatetime()+"',MICN='"+m.getMICN()+"',MImage='"+m.getMImage()+"' where MId='"+m.getMid()+"'";
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
