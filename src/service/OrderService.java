package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Order;

public class OrderService {
	
	private Map<String, Order> orderMap;
	
	public OrderService(String itemNumber, String description, String price, String firstName, String lastName, 
			String initial, String address, String creditcardType, String creditcard, String Recreditcard) { 
		orderMap = new HashMap<String, Order>();
		
		addOrder(new Order(itemNumber, description, price, firstName, lastName, initial, address, creditcardType, 
				creditcard, Recreditcard));
	}
	
	private void addOrder(Order order) {
		orderMap.put(order.getCreditcard(), order);
	}
	
	public Order findOrder(String creditCard, String RecreditCard) {
		if(creditCard.contentEquals(RecreditCard)) 
			return(orderMap.get(creditCard.toLowerCase()));
		else
			return null;
	}
	
	public List<Order> getAllOrders() {
		List<Order> orderList = new ArrayList<Order>(orderMap.values());
		return orderList;
	}
}
