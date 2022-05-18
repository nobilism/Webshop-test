package webshop.entities;

public class Order {
	public int orderId;
	public int customerId;
	public int orderStatus;
	public String orderDate;
	int itemId;
	int productId;
	String productName;
	int quantity;

	public int getOrderId() {
		return orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "order_id: " + orderId + ", \ncustomer_id: " + customerId + ", \norder_status: " + orderStatus
				+ ", \norder_date: " + orderDate + ", \nitem_id: " + itemId + ", \nproduct_id: " + productId
				+ ", \nproduct_name: " + productName + ", \nquantity: " + quantity + "\n";
	}

}
