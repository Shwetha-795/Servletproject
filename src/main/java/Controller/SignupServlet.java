package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentDao;
import Dto.Student;
@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s=new Student();
		s.setEmail("email");
		s.setGender("gender");
		s.setMobile(Long.parseLong(req.getParameter("mobile")));
		s.setName(req.getParameter("name"));
		s.setPassword("password");
		
		StudentDao dao=new StudentDao();
		dao.save(s);
		
		resp.getWriter().print("<h1>Data saved successfully</h1>");
		
	     
	}
}
