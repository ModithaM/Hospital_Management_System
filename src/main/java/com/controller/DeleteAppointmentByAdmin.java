package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.AdminService;

@WebServlet("/DeleteAppointmentByAdmin")
public class DeleteAppointmentByAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int appointmentId = Integer.parseInt(request.getParameter("id"));
			
			if(AdminService.deleteAppointmentById(appointmentId)) {
				response.sendRedirect("AdminDB");
			} else {
				response.sendRedirect("AdminDB?error=Delete Failed");
			}
		
	}

}
