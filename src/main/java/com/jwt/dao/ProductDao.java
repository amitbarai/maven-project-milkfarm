package com.jwt.dao;
import com.jwt.model.Product;
import java.util.List;

 

public interface ProductDao {
	public void addProduct(Product product);
	 
    public List<Product> getAllProducts();
 
    public void deleteProduct(Integer productId);
 
    public Product updateProduct(Product product);
 
    public Product getProduct(int productid);
}
