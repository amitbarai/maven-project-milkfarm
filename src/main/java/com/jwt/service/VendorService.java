package com.jwt.service;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.jwt.model.Vendor;
@Transactional
public interface VendorService {
	public void addVendor(Vendor vendor);
	 
    public List<Vendor> getAllVendors();
 
    public void deleteVendor(Integer vendorId);
 
    public Vendor getVendor(int vendorid);
 
    public Vendor updateVendor(Vendor vendor);

}
