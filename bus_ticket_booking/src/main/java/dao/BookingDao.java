package dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import dto.Customer;
import dto.Operator;

@Component
public class BookingDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abcd");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public void insertCustomer(Customer cdto){
		entityTransaction.begin();
		entityManager.persist(cdto);
		entityTransaction.commit();
	}
	
	public void insertOperator(Operator odto){
		entityTransaction.begin();
		entityManager.persist(odto);
		entityTransaction.commit();
	}
	
	public Operator findbyid(int id){
		Operator dto =entityManager.find(Operator.class, id);
		return dto;
	}
	
	 
	public boolean validation(Operator op,Operator operator ){
		if(op!=null){
			if(op.getOperator_pwd()==operator.getOperator_pwd())
			{
				System.out.println("operator login was successfull");
				return true;
				
			 }else{
				System.out.println("please enter the correct password");
				return false;
			       }
		}else{
			System.out.println("no data found");
			return false;
		}
	}
	
}
