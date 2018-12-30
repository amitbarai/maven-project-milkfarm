package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.descriptor.web.LoginConfig;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Product;
import com.jwt.model.Vendor;
import com.jwt.service.ProductService;
import com.jwt.service.VendorService;


@Controller
public class VendorController extends HttpServlet {
	  
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger
	            .getLogger(VendorController.class);

	 public VendorController() {
	        System.out.println("VendorController()");
	    }

	 @Autowired
	    private VendorService vendorService;
	 @Autowired
	 private ProductService productService;
	
//=================================================================================================================================
	 public ModelAndView listEmployeetest() throws IOException {
		 ModelAndView model = new ModelAndView();
	        List<Vendor> listVendor = vendorService.getAllVendors();
	        model.addObject("listVendor", listVendor);
	        model.setViewName("home");
	        return model;
	 
	 
	 }
	 
	//=================================================================================================================================
  
	 @RequestMapping(value = "/")
	    public ModelAndView index (ModelAndView model) throws IOException {
 
	        model.setViewName("index");
	        return model;
	    }
	 
	 @RequestMapping(value = "/login", method = RequestMethod.POST)
	 public ModelAndView login (ModelAndView model,HttpServletRequest request, HttpServletResponse response) throws IOException {
	        
  
//=================================================================================================================================
		 String un=request.getParameter("username");
		   String pw=request.getParameter("password");
		   if(un.equals("admin") && pw.equals("admin"))
		   {
			   //=====================================
			   List<Vendor> listVendor = vendorService.getAllVendors();
		        model.addObject("listVendor", listVendor);
			   //=====================================
			   model.setViewName("home");
			   
		   }else {
			   model.setViewName("index");
			
		}
		 
      return model;
	 }
 
 
			 
	 @RequestMapping(value = "/home")
	    public ModelAndView listEmployee(ModelAndView model) throws IOException {
	        List<Vendor> listVendor = vendorService.getAllVendors();
	        model.addObject("listVendor", listVendor);
	        model.setViewName("home");
	        return model;
	    }
	 
	    @RequestMapping(value = "/newVendor", method = RequestMethod.GET)
	    public ModelAndView newContact(ModelAndView model) {
	        Vendor vendor = new Vendor();
	        model.addObject("vendor", vendor);
	        model.setViewName("VendorForm");
	        return model;
	    }
	 
	    @RequestMapping(value = "/saveVendor", method = RequestMethod.POST)
	    public ModelAndView saveVendor(@ModelAttribute Vendor vendor,ModelAndView model) {
	    	 
	        if (vendor.getId() == 0) { // if employee id is 0 then creating the
	            // employee other updating the employee
	            vendorService.addVendor(vendor);
	        } else {
	            vendorService.updateVendor(vendor);
	        }
	        
	        return new ModelAndView("redirect:/home");
	        
	        
	    }
	 
	    @RequestMapping(value = "/deleteVendor", method = RequestMethod.GET)
	    public ModelAndView deleteVendor(HttpServletRequest request, ModelAndView model) {
	        int vendorId = Integer.parseInt(request.getParameter("id"));
 
	        vendorService.deleteVendor(vendorId);
	         
	        return new ModelAndView("redirect:/home");
	    }
	 
	    @RequestMapping(value = "/editVendor", method = RequestMethod.GET)
	    public ModelAndView editContact(HttpServletRequest request) {
	        int vendorId = Integer.parseInt(request.getParameter("id"));
	        Vendor vendor = vendorService.getVendor(vendorId);
	        ModelAndView model = new ModelAndView("VendorForm");
	        model.addObject("vendor", vendor);
	 
	        return model;
	    }

	    @RequestMapping(value ="/allproduct")
	    public ModelAndView allproducts ()
	    {
	    	ModelAndView model = new ModelAndView();
	    	List<Product> getallproducts =  productService.getAllProducts();
	    	model.addObject("getallproducts", getallproducts);
	    	model.setViewName("allproduct");
	    	
			return model;
	    	
	    	
	    }
	    
	    @RequestMapping(value = "/newProduct", method = RequestMethod.GET)
	    public ModelAndView newProdunct(ModelAndView model) {
	        Product product = new Product();
	        model.addObject("product", product);
	        model.setViewName("ProductForm");
	        return model;
	    }
	    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	    public ModelAndView saveProduct(@ModelAttribute Product product,ModelAndView model) {
	    	 
	        if (product.getId() == 0) { // if employee id is 0 then creating the
	            // employee other updating the employee
	        	productService.addProduct(product);
	        } else {
	        	productService.updateProduct(product);
	        }
	        
	        return new ModelAndView("redirect:/allproduct");
    
	    }
	    
	    @RequestMapping(value = "/editProduct", method = RequestMethod.GET)
	    public ModelAndView editProduct(HttpServletRequest request) {
	        int productId = Integer.parseInt(request.getParameter("id"));
	        Product product = productService.getProduct(productId);
	        ModelAndView model = new ModelAndView("ProductForm");
	        model.addObject("product", product);
	 
	        return model;
	    }
	    
	    @RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
	    public ModelAndView deleteProduct(HttpServletRequest request, ModelAndView model) {
	        int productId = Integer.parseInt(request.getParameter("id"));
 
	        productService.deleteProduct(productId);
	         
	        return new ModelAndView("redirect:/allproduct");
	    }
	    
}
