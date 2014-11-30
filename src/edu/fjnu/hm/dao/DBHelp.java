/**
 * 
 */
package edu.fjnu.hm.dao;

import java.sql.*;



/**
 * @author 苏振超
 *
 */
public class DBHelp {
	/**
	 * 打开数据库连接
	 * @return
	 */
	public Connection getConnection(){
		Connection conn=null;
		String url = "jdbc:mysql://121.41.51.176:3306/cdio_1_8_DB?useUnicode&characterEncoding";
        String user = "cdio_1_8";
        String password = "cdio";
		try{
		 //第一步：加载MySQL的JDBC的驱动
         Class.forName("com.mysql.jdbc.Driver");        
         //第二步：创建与MySQL数据库的连接类的实例
        conn = DriverManager.getConnection(url, user, password);
        }catch (ClassNotFoundException e) {  
		     //加载JDBC错误,所要用的驱动没有找到
		      System.out.println("驱动加载错误");
		  }catch (SQLException ex) {
		    //显示数据库连接错误或查询错误
		    System.err.println("SQLException:"+ex.getMessage());
	   }
		return conn;
	}
    
	/**
	  * 关闭数据库连接
	  */
	 public void closeConnnection(Connection conn) {
	  try {
	   if(conn != null) {
	    conn.close();
	   }
	  } catch (SQLException e) {
	   e.printStackTrace();
	  }
	 }
	 /*
	  * 关闭PreparedStatement
	  */
	 public void closePrepStmt(PreparedStatement prepStmt){
		 if(prepStmt!=null)
			try {
				prepStmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 /*
	  * 关闭ResultSet
	  */
	 public void closeResultSet(ResultSet rs){
		 if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	/*
	 * 验证用户登入
	 */
	 public boolean matchUser(String sql){
		 Connection conn=null;
		 PreparedStatement prepStmt=null;
		 ResultSet rs=null;
		 
		 try {
			 conn=this.getConnection();
			 prepStmt=conn.prepareStatement(sql);
			 rs=prepStmt.executeQuery(); 
			 if(rs.next()==false){
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally{
			this.closeResultSet(rs);
			this.closePrepStmt(prepStmt);
			this.closeConnnection(conn);			
		}
		 return true;
		
	 }
}
