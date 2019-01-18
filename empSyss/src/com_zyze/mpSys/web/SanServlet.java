package com_zyze.mpSys.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com_zyze.mpSys.service.EmpSysService;
import com_zyze.mpSys.service.IEmpSysService;
@WebServlet("/san")
@SuppressWarnings("serial")
public class SanServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		IEmpSysService service=new EmpSysService();
	    int id = Integer.parseInt(req.getParameter("id")) ;
	    System.out.println(id);
		service.san(id);
		req.getRequestDispatcher("/EmpListServlet").forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req, resp);
	}

}
