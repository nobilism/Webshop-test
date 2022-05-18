package webshop.entities;

public class Product {
	private int productId;
	private String productName;
	private int brandId;
	private String brandName;
	private int categoryId;
	private String categoryName;
	private int modelYear;
	
	
//	public Product(int id, String name, int brandId, String brandName, int categoryId, String categoryName,
//			int modelYear, String modelName) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.brandId = brandId;
//		this.brandName = brandName;
//		this.categoryId = categoryId;
//		this.categoryName = categoryName;
//		this.modelYear = modelYear;
//		this.modelName = modelName;
//	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public int getBrandId() {
		return brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public int getModelYear() {
		return modelYear;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	
	@Override
	public String toString() {
		return "product_id:" + productId + ", \nproduct_name: " + productName + ", \nbrand_id: " + brandId + ", \nbrand_name: " + brandName
				+ ", \ncategory_id: " + categoryId + ", \ncategory_name: " + categoryName + ", \nmodelYear: " + modelYear + "\n";
	}

}
