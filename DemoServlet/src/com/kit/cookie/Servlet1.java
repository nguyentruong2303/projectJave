package com.kit.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/servlet1"})
public class Servlet1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		
		Cookie cookie = new Cookie("kit", "korean it");
		cookie.setMaxAge(10);
		resp.addCookie(cookie);
		Cookie cookie2 = new Cookie("learn", "Java Developer");
		cookie2.setMaxAge(20);
		resp.addCookie(cookie2);
	}
}
