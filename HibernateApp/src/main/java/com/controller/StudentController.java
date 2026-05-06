package com.controller;

import java.io.IOException;


import com.bean.Student;
import com.dao.Studentdao;

@jakarta.servlet.annotation.WebServlet("/StudentController")
public class StudentController extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("insert")) {
			
			Student s =new Student();
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(Long.parseLong(request.getParameter("mobile")));
			Studentdao.insertStudent(s);
			response.sendRedirect("show.jsp");
		}
		
		else if(action.equalsIgnoreCase("edit")) {
			int id=Integer.parseInt(request.getParameter("id"));
			Student s=Studentdao.getStudent(id);
			request.setAttribute("s", s);
			request.getRequestDispatcher("update.jsp").forward(request, response);
			
		}
		else if(action.equalsIgnoreCase("update")) {
			Student s =new Student();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(Long.parseLong(request.getParameter("mobile")));
			Studentdao.insertStudent(s);
			response.sendRedirect("show.jsp");

		}
		
		else if(action.equalsIgnoreCase("delete")){
		 int id=Integer.parseInt(request.getParameter("id"));
		 Studentdao.deleteStudent(id);
		 response.sendRedirect("show.jsp");
			
			
		}
	}

}
