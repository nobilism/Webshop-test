package webshop;

import java.util.List;

import webshop.Manager.ProductManager;
import webshop.dataStore.DataStore;

public class Launch {
	//private static List<Product> products;

	public static void main(String[] args) {
		
		getProductData();
	}

	private static void getProductData() {
		System.out.println("Getting data...");
		DataStore.getData();
		
		//products = ProductManager.getInstance().getProducts();
		
		
		
	}


}
