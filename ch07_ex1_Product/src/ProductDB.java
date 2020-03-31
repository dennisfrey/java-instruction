public class ProductDB {

	public Product getProduct(String productCode) {
		// In a more realistic application, this code would
		// get the data for the product from a file or database
		// For now, this code just uses if/else statements
		// to return the correct product data

		// create the Product object
		Product product = new Product();
		Product product2 = new Product();
		
		// fill the Product object with data
		product.setCode(productCode);
		if (productCode.equalsIgnoreCase("java")) {
			product.setDescription("Murach's Java Programming");
			product.setPrice(57.50);
			product2.setAll("java", "Murach's Java Programming", 57.50);
		} else if (productCode.equalsIgnoreCase("jsp")) {
			product.setDescription("Murach's Java Servlets and JSP");
			product.setPrice(57.50);
			product2.setAll("jsp", "Murach's Java Servlets and JSP", 57.50);
		} else if (productCode.equalsIgnoreCase("mysql")) {
			product.setDescription("Murach's MySQL");
			product.setPrice(54.50);
			product2.setAll("mysql", "Murach's MySQL", 57.50);
		} else if (productCode.equalsIgnoreCase("angular")) {
			product.setDescription("Murach's Angular");
			product.setPrice(74.50);
			product2.setAll("Angular", "Murach's Angular", 74.50);
		} else {
			product.setDescription("Unknown");
		}
		//return product;
		return product2;
	}
}