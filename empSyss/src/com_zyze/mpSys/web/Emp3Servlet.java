package com_zyze.mpSys.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com_zyze.mpSys.domain.Emp;
import com_zyze.mpSys.service.EmpSysService;
import com_zyze.mpSys.service.IEmpSysService;
@WebServlet("/huifu")
@SuppressWarnings("serial")
public class Emp3Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	IEmpSysService service =new EmpSysService();
	List<Emp> list2 = service.findAllemp3(); 
	

	req.setAttribute("list2", list2);
	req.getRequestDispatcher("/hufu.jsp").forward(req, resp);	
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doPost(req, resp);
	
	}

}
