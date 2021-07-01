package com.indranil.collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.indranil.entity.Address;
import com.indranil.entity.Employee;

public class MyMap {

	public static void main(String[] args) {

		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Collection_Type");  
	        EntityManager em=emf.createEntityManager();  
	          
	        em.getTransaction().begin();  
	        
	        
	        Address a3=new Address();  
		    a3.setPincode(45044);
		    a3.setCity("Pune");
		    a3.setState("M.H");
		    
		    Employee e3=new Employee();  
		    e3.setId(502);
		    e3.setName("Conti");
		    
		    e3.getMap().put(100, a3);
		    
		    em.persist(e3);
		    
		    em.getTransaction().commit();  

		    
		    em.close();
		    emf.close();
	        
	}

}
