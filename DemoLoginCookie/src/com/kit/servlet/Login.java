package com.kit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.print("<form action='/DemoLoginCookie/Login' method = 'post'>");
		printWriter.print("UserName: <input type='text' name='username'>");
		printWriter.print("PassWord: <input type='text' name='password'>");
		printWriter.print(" <input type='submit' value='login'/>");
		printWriter.print("</form>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("mgwin9x") && password.equals("123456")) {
			Cookie cookie = new Cookie("username", username);
			cookie.setMaxAge(60);
			resp.addCookie(cookie);
			resp.sendRedirect("/DemoLoginCookie/com.kit.servlet/welcome");
		} else {
			resp.sendRedirect("/DemoLoginCookie/com.kit.servlet/login");
		}
	}
}
