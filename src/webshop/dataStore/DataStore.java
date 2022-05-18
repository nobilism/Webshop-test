package webshop.dataStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import webshop.Manager.OrderManager;
import webshop.Manager.ProductManager;
import webshop.entities.Order;
import webshop.entities.Product;

public class DataStore {

	private static List<Product> products = new ArrayList<>();
	private static List<Order> orders = new ArrayList<>();

	public static List<Product> getProducts() {
		return products;
	}

	public static List<Order> getOrders() {
		return orders;
	}

	public static void getData() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://db-mysql-fra1-88803-do-user-10057515-0.b.db.ondigitalocean.com:25060/webshop-test?useSSL=true",
					"webshop-test", "AVNS_CSJ4NQSZi8DTCEY");

			Statement stmt = conn.createStatement();

			try (Scanner scanner = new Scanner(System.in)) {

				int choose = 0;
				boolean flag = true;
				do {
					System.out.println("Product(1) or Order?(2): ");
					choose = scanner.nextInt();
					if (choose == 1 || choose == 2) {
						flag = false;
					}
				} while (flag);
				if (choose == 1) {
					System.out.println("Enter the productId: ");
					int inputP = scanner.nextInt();
					getProductDetails(stmt, inputP);
				} else {
					System.out.println("Enter the orderId: ");
					int inputO = scanner.nextInt();
					getOrderDetails(stmt, inputO);
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid option. Please try again!");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void getProductDetails(Statement stmt, int inputP) throws SQLException {

		String query = "SELECT * FROM products p INNER JOIN categories c " + " ON p.category_id = c.category_id "
				+ " INNER JOIN brands b ON b.brand_id = p.brand_id WHERE p.product_id = " + inputP + ";";

		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			int productId = rs.getInt("product_id");
			String productName = rs.getString("product_name");
			int brandId = rs.getInt("brand_id");
			String brandName = rs.getString("brand_name");
			int categoryId = rs.getInt("category_id");
			String categoryName = rs.getString("category_name");
			int modelYear = rs.getInt("model_year");

			Product product = ProductManager.getInstance().createProduct(productId, productName, brandId, brandName,
					categoryId, categoryName, modelYear);
			products.add(product);
			System.out.println(product);
		}

	}

	private static void getOrderDetails(Statement stmt, int inputO) throws SQLException {
		String query = "SELECT * FROM orders o INNER JOIN order_items oi ON o.order_id = oi.order_id INNER JOIN products p ON p.product_id = oi.product_id WHERE o.order_id = "
				+ inputO + ";";

		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			int orderId = rs.getInt("order_id");
			int customerId = rs.getInt("customer_id");
			int orderStatus = rs.getInt("order_status");
			String orderDate = rs.getString("order_date");
			int itemId = rs.getInt("item_id");
			int productId = rs.getInt("product_id");
			String productName = rs.getString("product_name");
			int quantity = rs.getInt("quantity");
			
			

			Order order = OrderManager.getInstance().createOrder(orderId, customerId, orderStatus, orderDate, itemId,
					productId, productName, quantity);
			orders.add(order);
			System.out.println(order);
		}
		
		getProductDetails(stmt, orders.get(orders.size()-1).getProductId());
	}

}
