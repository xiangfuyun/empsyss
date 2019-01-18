package com_zyze.mpSys.web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com_zyze.mpSys.domain.Emp;
import com_zyze.mpSys.service.EmpSysService;
import com_zyze.mpSys.service.IEmpSysService;

@WebServlet("/LoginServlet")
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

	public LoginServlet() {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = req.getServletContext();
		String encoding = context.getInitParameter("encoding");
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");		    
		String name = req.getParameter("name");
		String password = req.getParameter("password");

		// 调用service中的方法进行登录
		IEmpSysService service = new EmpSysService();
		// service.longin(name, password);
		// 登录验证, 通过名称和密码来查找用户
		Emp emp = service.findEmpByNameAndPassword(name, password);
		System.out.println(emp);
		if (emp != null) {
			// 把登录用户存入到session中, 表示开启了一次会话
			HttpSession session = req.getSession();
			session.setAttribute("emp", emp);
			// 格式化时间日期
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			String lastTime = sdf.format(new Date());
			// 获取请求中的cookie
			Cookie[] cookies = req.getCookies();
			if (cookies != null) {
				Cookie c = null;
				for (Cookie cookie : cookies) {
					String cookieName = cookie.getName();
					if ("lastTime".equals(cookieName)) {
						c = cookie;
						break;
					}
				}
				if (c != null) {
					String value = c.getValue();
					req.setAttribute("lastTime", value);
					c.setValue(lastTime);
					resp.addCookie(c);
					req.getRequestDispatcher("/index.jsp").forward(req, resp);
				} else {
					c = new Cookie("lastTime", lastTime);
					// 设置cookie
					c.setPath("/");
					c.setMaxAge(60 * 60 * 24 * 365);
					req.setAttribute("lastTime", lastTime);
					resp.addCookie(c);
					req.getRequestDispatcher("/index.jsp").forward(req, resp);
				}
			} else {
				Cookie c = new Cookie("lastTime", lastTime);
				// 设置cookie
				c.setPath("/");
				c.setMaxAge(60 * 60 * 24 * 365);
				req.setAttribute("lastTime", lastTime);
				resp.addCookie(c);
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
			}
			resp.getWriter().write("登录成功, 3s后回到主页...");
			resp.setHeader("refresh", "3;url=" + context.getContextPath() + "/index.jsp");
			return;
		} else {
			// 请求转发, 把错误信息转发到前端页面进行展示
			req.setAttribute("error_msg", "账号或密码有误, 请检查后登录");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
			return;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
