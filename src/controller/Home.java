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
		
		//request(index.jsp)�� action��(login or help)�� �����.
		String action = request.getParameter("action");
		
		String page = null;				//page�� url �ּ���.
		
		if(action.equals("login"))
			page="/view/loginform.jsp";
		else if(action.equals("help"))
			page="/view/help.jsp";
		else
			page="/view/error.jsp";
		
		//�ش�Ǵ� page�� �̵���.
		//RequestDispatcher : �ٸ� �������̳�  JSP�� �۾��� ������ �� ����ϴ� ��ü. ������ Ŭ�������� �������̳� ��Ŭ��� �� �� ����Ѵ�.  

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
	}

}