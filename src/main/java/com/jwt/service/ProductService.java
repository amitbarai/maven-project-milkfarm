package com.jwt.service;

import java.util.List;

import com.jwt.model.Product;

 
import org.springframework.transaction.annotation.Transactional;
 
@Transactional
 
public interface ProductService {
	public void addProduct(Product product);
	 
    public List<Product> getAllProducts();
 
    public void deleteProduct(Integer productId);
 
    public Product getProduct(int productid);
 
    public Product updateProduct(Product product);
}
