package webshop;

import java.util.List;

import webshop.Manager.ProductManager;
import webshop.dataStore.DataStore;

public class Launch {
	//private static List<Product> products;

	public static void main(String[] args) {
		DataStore.getData();
		//loadData();
	}

	private static void loadData() {
		System.out.println("Loading data...");
		DataStore.getData();
		
		//products = ProductManager.getInstance().getProducts();
		
	
		
	}


}
