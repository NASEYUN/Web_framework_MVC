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
import model.Order;
import service.CustomerService;
import service.OrderService;

/**
 * Servlet implementation class DoForm
 */
@WebServlet("/doOrder")
public class DoOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String itemNumber = request.getParameter("itemNumber");
		String description = request.getParameter("description");
		String price = request.getParameter("price");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String initial = request.getParameter("initial");
		String address = request.getParameter("address");
		String creditcardType = request.getParameter("cardType");
		String creditcard = request.getParameter("creditCard");
		String Recreditcard = request.getParameter("RecreditCard");

		if(initial.contentEquals(""))
			initial = "No Value";
		
		//Perform business logic. Return a bean as a result

		OrderService service = new OrderService(itemNumber,description, price, firstName, lastName, 
				initial, address, creditcardType, creditcard, Recreditcard);
		Order order = service.findOrder(creditcard, Recreditcard);
		request.setAttribute("order", order);
		
		List<Order> orderList = service.getAllOrders();
		request.setAttribute("orders", orderList);
		
		String page;
		if(creditcard.contentEquals(Recreditcard))
			page="/view/order.jsp";
		else
			page="/view/form.jsp";

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request,  response);
	}
}
