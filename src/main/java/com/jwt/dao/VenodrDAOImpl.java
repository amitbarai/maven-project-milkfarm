package com.jwt.dao;

import java.util.List;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Vendor;

@Repository
public class VenodrDAOImpl implements VendorDao {

	 @Autowired
	    private SessionFactory sessionFactory;
	 
	 
	 

	public VenodrDAOImpl() {
		System.out.println("VenodrDAOImpl is started");
	}

	public void addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(vendor);
		
	}

	@SuppressWarnings("unchecked")
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		   return sessionFactory.getCurrentSession().createQuery("from Vendor")
	                .list();

	}
	   public void deleteVendor(Integer vendorId) {
		// TODO Auto-generated method stub
		
		   Vendor vendor = (Vendor) sessionFactory.getCurrentSession().load(
				   Vendor.class, vendorId);
	        if (null != vendor) {
	            this.sessionFactory.getCurrentSession().delete(vendor);
	        }
	 
	    }


	public Vendor updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(vendor);
        return vendor;

	}

	public Vendor getVendor(int vendorid) {
		// TODO Auto-generated method stub
		 return (Vendor) sessionFactory.getCurrentSession().get(
				 Vendor.class, vendorid);

	}

}
