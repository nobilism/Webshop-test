package webshop.Manager;

import java.util.List;

import webshop.dataStore.DataStore;
import webshop.entities.Product;

public class ProductManager {
	
	private static ProductManager instance = new ProductManager();
	
	private ProductManager() {
	}
	
	public static ProductManager getInstance() {
		return instance;
	}
	
	public List<Product> getProducts() {
		return DataStore.getProducts();
	}
	
	public Product createProduct(int productId, String productName, int brandId, String brandName,
			int categoryId, String categoryName, int modelYear) {
		Product product = new Product();
		product.setProductName(productName);
		product.setProductId(productId);
		product.setBrandId(brandId);
		product.setBrandName(brandName);
		product.setCategoryId(categoryId);
		product.setCategoryName(categoryName);
		product.setModelYear(modelYear);
		
		return product;
		
	}

}
