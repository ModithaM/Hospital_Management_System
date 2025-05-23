package com.pagecontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.UserService;
import com.model.Admin;
import com.model.Doctor;
import com.model.Patient;

@WebServlet("/userprofile")
public class userProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userRole =(String) session.getAttribute("role"); // get session user role
		int currentUserid =(int) session.getAttribute("uid"); // get session user id
		
		if("patient".equals(userRole)) {
			Patient patient = UserService.getPatientById(currentUserid);
			request.setAttribute("user", patient);
		} else if("doctor".equals(userRole)) {
			Doctor doctor = UserService.getDoctorById(currentUserid);
			request.setAttribute("user", doctor);
		}
		else if("admin".equals(userRole)) {
			Admin admin = UserService.getAdminById(currentUserid);
			request.setAttribute("user", admin);
		}
		
		String error = request.getParameter("error");
		String success = request.getParameter("success");
		if(error != null) {
			request.setAttribute("error", error);
		}
		else if(success != null) {
			request.setAttribute("success", success);
		}
		
		request.getRequestDispatcher("views/userProfile.jsp").forward(request, response);
	}

}