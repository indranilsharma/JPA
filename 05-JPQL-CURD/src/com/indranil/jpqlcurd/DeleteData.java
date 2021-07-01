package com.indranil.jpqlcurd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteData {

	public static void main(String[] args) {

		 EntityManagerFactory emf = Persistence.createEntityManagerFactory( "jpql_curd" );  
         EntityManager em = emf.createEntityManager();  
         em.getTransaction().begin( );  
           
           
         Query query = em.createQuery( "delete from User where id=102");  
           
         query.executeUpdate();  
 
         em.getTransaction().commit();  
         
         System.out.println("Deleted");
         em.close();  
         emf.close();    
		
		
	}

}
