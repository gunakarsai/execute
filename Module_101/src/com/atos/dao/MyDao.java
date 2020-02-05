package com.atos.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;    
import java.sql.ResultSet;
import java.sql.SQLException;

import com.atos.model.Discounts;

public class MyDao {
	JdbcTemplate template;  
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	
 
	
	public int save(Discounts d)
	{
		String sql = "insert into Discounts(product_id,product_price,product_discount,Discount_valid) values("+d.getProduct_id()+","+d.getProduct_price()+","+d.getProduct_discount()+",'"+d.getDiscount_valid()+"')";
		return template.update(sql);
	}
	
//	public int update(Emp p){    
//	    String sql="update Emp99 set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";    
//	    return template.update(sql);    
//	}
	
	public int update(Discounts d)
	{
		String sql = "update Discounts set product_price="+d.getProduct_price()+"where product_id="+d.getProduct_id()+"";
		return template.update(sql);
	}
	
	
	public int delete(int product_id){    
	   String sql = "delete from Discounts where product_id = ?";
	   return template.update(sql,product_id);
	}    
	
//	public Emp getEmpById(int id){    
//	    String sql="select * from Emp99 where id=?";    
//	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));    
//	}    
	
//	public List<Emp> getEmployees(){    
//	    return template.query("select * from Emp99",new RowMapper<Emp>(){    
//	        public Emp mapRow(ResultSet rs, int row) throws SQLException {    
//	            Emp e=new Emp();    
//	            e.setId(rs.getInt(1));    
//	            e.setName(rs.getString(2));    
//	            e.setSalary(rs.getFloat(3));    
//	            e.setDesignation(rs.getString(4));    
//	            return e;    
//	        }    
//	    });    
//	}
	
	public List<Discounts> getDisc()
	{
		 return template.query("select * from discounts",new RowMapper<Discounts>(){    
			 public Discounts mapRow(ResultSet rs, int row) throws SQLException {    
		            Discounts d=new Discounts();    
		            d.setProduct_id(rs.getInt(1));
		            d.setProduct_price(rs.getInt(2));
		            d.setProduct_discount(rs.getInt(3));
		            d.setDiscount_valid(rs.getString(4));
		            return d;    
		        }     
		    });    
	}
	
	
}
