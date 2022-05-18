package webshop.Manager;

import webshop.entities.Order;

public class OrderManager {
	private static OrderManager instance = new OrderManager();

	private OrderManager() {
	} 								// we don't want our clients to create managers - SINGELTON

	public static OrderManager getInstance() {
		return instance;
	}

	public Order createOrder(int orderId, int customerId, int orderStatus, String orderDate, int itemId, int productId, String productName, int quantity) {
		Order order = new Order();
		order.setOrderId(orderId);
		order.setCustomerId(customerId);
		order.setOrderStatus(orderStatus);
		order.setOrderDate(orderDate);
		order.setItemId(orderStatus);
		order.setProductId(orderStatus);
		order.setProductName(orderDate);
		order.setQuantity(orderStatus);
		
		return order;
	}
}
