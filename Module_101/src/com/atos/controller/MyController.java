package com.atos.controller;

import java.util.List;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atos.dao.MyDao;
import com.atos.model.Discounts;

@Controller
public class MyController {
	@Autowired
	MyDao dao;
	
	@RequestMapping("ex")
	public String ex(HttpServletRequest request)
	{
		int product_id = Integer.parseInt(request.getParameter("product_id"));
		
//		dao.save();
		return "ex";
	}
	
	@RequestMapping("addProduct")
	public String addP()
	{
		return "addProduct";
	}
	
	@RequestMapping("saveProduct")
	public String saveP(HttpServletRequest request)
	{
		 int product_id = Integer.parseInt(request.getParameter("id"));
		 int product_price = Integer.parseInt(request.getParameter("price"));
		 int product_discount = Integer.parseInt(request.getParameter("discount"));
		 String discount_valid = request.getParameter("discount_valid_month");
		 System.out.println(product_id+" "+product_discount+" "+product_price+" "+discount_valid);
		 Discounts d = new Discounts(product_id,product_price,product_discount,discount_valid);
		 int check = dao.save(d);
		 if(check==1)
		 {
			 return "success";
		 }
		 else {
			 return "error";
		 }		
	}
	

	
	@RequestMapping("/showProducts")    
    public String disc(Model m){   
        List<Discounts> list=dao.getDisc(); 
        System.out.println(list.get(0).getDiscount_valid());
        m.addAttribute("list",list);  
        return "discdetails";    
    }    
	
	@RequestMapping("deleteP")
	public String deleteP(HttpServletRequest request)
	{
		int id = Integer.parseInt(request.getParameter("id"));
		int k = dao.delete(id);
		if(k==1)
		{
			return "success";	
		}
		else
		{
			return "error";
		}
		
	}
	
	@RequestMapping("deleteProduct")
	public String deleteProduct()
	{
		return "deleteP";
	}
	
	@RequestMapping("updateProduct")
	public String updateP()
	{
		return "updateP";
	}
	
	@RequestMapping("updateP")
	public String updateProduct(HttpServletRequest request)
	{
		 int product_id = Integer.parseInt(request.getParameter("id"));
		 int product_price = Integer.parseInt(request.getParameter("price"));
		 int product_discount = Integer.parseInt(request.getParameter("discount"));
		 String discount_valid = request.getParameter("discount_valid_month");
		 System.out.println(product_id+" "+product_discount+" "+product_price+" "+discount_valid);
		 Discounts d = new Discounts(product_id,product_price,product_discount,discount_valid);
		 int k = dao.update(d);
		 if(k==1)
		 {
				return "success";
		 }
		 else
		 {
			 return "error";
		 }
	}
	
	
	
	
	
}
