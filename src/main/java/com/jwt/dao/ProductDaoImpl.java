package com.jwt.dao;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SessionFactory sessionFactory; 
	
	
	public ProductDaoImpl() {
		System.out.println("ProductDaoImpl started");
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	public void deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
		Product product = (Product) sessionFactory.getCurrentSession().load(Product.class, productId); ///casting change
		if (null != product) {
			this.sessionFactory.getCurrentSession().delete(product);
			
		}
	}

	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(product);
		return product;
	}

	public Product getProduct(int productid) {
		// TODO Auto-generated method stub
		return (Product) sessionFactory.getCurrentSession().get(Product.class, productid);
	}

	 
}
