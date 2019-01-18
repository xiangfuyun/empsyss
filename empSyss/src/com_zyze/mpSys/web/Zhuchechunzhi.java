package com_zyze.mpSys.web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com_zyze.mpSys.dao.Empdao;
import com_zyze.mpSys.domain.Emp;
import com_zyze.mpSys.service.EmpSysService;
import com_zyze.mpSys.service.IEmpSysService;

@WebServlet("/zhuche")
@SuppressWarnings("serial")
public class Zhuchechunzhi extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		int age = Integer.parseInt(req.getParameter("age"));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd ");
		String hiredate = df.format(new Date());
		double salary = Double.parseDouble(req.getParameter("salary"));
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		IEmpSysService service = new EmpSysService();
		Emp emp = new Emp(null, name, password, gender, age, hiredate, salary, phone, email);
		service.Zhuce(emp);
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);

	}

}
