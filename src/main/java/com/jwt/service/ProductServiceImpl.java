package com.jwt.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jwt.model.Product;
import com.jwt.dao.ProductDao;

@Component
public class ProductServiceImpl implements ProductService {
@Autowired
private ProductDao productDao;

	public ProductServiceImpl() {
	System.out.println("ProductServiceImpl is started");
}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.addProduct(product);
		
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	public void deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(productId);
		
	}

	public Product getProduct(int productid) {
		// TODO Auto-generated method stub
		return productDao.getProduct(productid);
	}

	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.updateProduct(product);
	}

}
