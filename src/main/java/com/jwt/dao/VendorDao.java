package com.jwt.dao;
import java.util.List;
import com.jwt.model.Vendor;;

public interface VendorDao {

	public void addVendor(Vendor vendor);
	 
    public List<Vendor> getAllVendors();
 
    public void deleteVendor(Integer vendorId);
 
    public Vendor updateVendor(Vendor vendor);
 
    public Vendor getVendor(int vendorid);

}
