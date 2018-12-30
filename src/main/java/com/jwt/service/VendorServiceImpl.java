package com.jwt.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.jwt.dao.VendorDao;
import com.jwt.model.Vendor;
@Component
public class VendorServiceImpl implements VendorService {
	
	
	
	public VendorServiceImpl() {
	 System.out.println("VendorServiceImpl is started ");
	}

	@Autowired
    private VendorDao vendorDao;

	
	 @Transactional

	public void addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		 vendorDao.addVendor(vendor);
	}
	 @Transactional

	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		 return vendorDao.getAllVendors();
	}
	 @Transactional

	public void deleteVendor(Integer vendorId) {
		// TODO Auto-generated method stub
		 vendorDao.deleteVendor(vendorId);
	}

	public Vendor getVendor(int vendorid) {
		// TODO Auto-generated method stub
		return vendorDao.getVendor(vendorid);
	}

	public Vendor updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return vendorDao.updateVendor(vendor);
	}

}
