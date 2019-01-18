package com_zyze.mpSys.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com_zyze.mpSys.domain.Emp;
import com_zyze.mpSys.service.EmpSysService;
import com_zyze.mpSys.service.IEmpSysService;
@WebServlet("/xiugai")
@SuppressWarnings("serial")
public class XuGAISverlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");		
		int id = Integer.parseInt(req.getParameter("id")) ;
		System.out.println(id);
		IEmpSysService service = new EmpSysService();
		Emp emp = service.findid(id);
        List<Emp> list=new ArrayList<Emp>() ;
			list.add(emp);
			System.out.println(emp);
            HttpSession session = req.getSession();
            session.setAttribute("emps", list);
	        ///请求转发
	       req.getRequestDispatcher("/Xugai.jsp").forward(req, resp);
	
	}	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req, resp);
	}
}
