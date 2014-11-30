package edu.fjnu.hm.controller;

import java.awt.Window;
import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.fjnu.hm.dao.DBHelp;
import edu.fjnu.hm.util.StringUtils;

public class toMain extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public toMain() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DBHelp DB=new DBHelp();
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		request.getSession().setAttribute("username", username);
		String pwd=request.getParameter("pwd");
		String usertype=request.getParameter("usertype");
		
		String sql=null;
		if(usertype.equals("rd_student")){
			sql="select *from RM_Student where SId='"+username+"'and SPwd='"+pwd+"'";
			if(( DB.matchUser(sql))){
				response.sendRedirect("StuMain.jsp");
			}
		}else if(usertype.equals("rd_teacher")){
			sql="select *from RM_Teacher where TId='"+username+"'and TPwd='"+pwd+"'";
			if(( DB.matchUser(sql))){
				response.sendRedirect("TeaMain.jsp");
			}
		}else{
			sql="select *from RM_Manager where MId='"+username+"'and MPwd='"+pwd+"'";
			if(( DB.matchUser(sql))){
				response.sendRedirect("ManMain.jsp");
			}
		}
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
