/**
 * 
 */
package edu.fjnu.hm.dao;

import java.sql.*;



/**
 * @author ����
 *
 */
public class DBHelp {
	/**
	 * �����ݿ�����
	 * @return
	 */
	public Connection getConnection(){
		Connection conn=null;
		String url = "jdbc:mysql://121.41.51.176:3306/cdio_1_8_DB?useUnicode&characterEncoding";
        String user = "cdio_1_8";
        String password = "cdio";
		try{
		 //��һ��������MySQL��JDBC������
         Class.forName("com.mysql.jdbc.Driver");        
         //�ڶ�����������MySQL���ݿ���������ʵ��
        conn = DriverManager.getConnection(url, user, password);
        }catch (ClassNotFoundException e) {  
		     //����JDBC����,��Ҫ�õ�����û���ҵ�
		      System.out.println("�������ش���");
		  }catch (SQLException ex) {
		    //��ʾ���ݿ����Ӵ�����ѯ����
		    System.err.println("SQLException:"+ex.getMessage());
	   }
		return conn;
	}
    
	/**
	  * �ر����ݿ�����
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
	  * �ر�PreparedStatement
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
	  * �ر�ResultSet
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
	 * ��֤�û�����
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
