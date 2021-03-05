package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPassword = request.getParameter("userPassword");
		
		//Perform business logic. Return a bean as a result
				CustomerService service = new CustomerService();
				Customer user = service.findCustomer(userId);
				
				request.setAttribute("user", user);
				
				List<Customer> customerList = service.getAllCustomers();
				request.setAttribute("customers", customerList);
				
				String page;
				if(userPassword.contentEquals(user.getPassword()) && user != null)
					page="/view/form.jsp";
				else
					page="/view/error.jsp";
				
				
				RequestDispatcher dispatcher = request.getRequestDispatcher(page);
				dispatcher.forward(request,  response);
	}

}
