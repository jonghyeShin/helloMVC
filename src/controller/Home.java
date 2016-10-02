package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request(index.jsp)의 action값(login or help)이 저장됨.
		String action = request.getParameter("action");
		
		String page = null;				//page는 url 주소임.
		
		if(action.equals("login"))
			page="/view/loginform.jsp";
		else if(action.equals("register"))
			page="/view/registerForm.jsp";
		else
			page="/view/error.jsp";
		
		//해당되는 page로 이동함.
		//RequestDispatcher : 다른 서블릿이나  JSP로 작업을 위임할 때 사용하는 객체. 서블릿 클래스에서 포워딩이나 인클루딩 할 때 사용한다.  

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
	}

}
