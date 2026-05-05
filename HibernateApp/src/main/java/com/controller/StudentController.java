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
			response.sendRedirect("insert.jsp");
		}
	}

}
