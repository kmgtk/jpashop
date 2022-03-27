package com.jpa.study;

import com.jpa.study.domain.Book;
import com.jpa.study.domain.Order;
import com.jpa.study.domain.OrderItem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@SpringBootApplication
public class JpabookApplication {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();

		tx.begin();

		try{

			Book book = new Book();
			book.setName("JpA");
			book.setAuthor("TK");

			em.persist(book);

			tx.commit();
		}catch (Exception e){
			tx.rollback();
		}finally {
			em.close();
		}
		emf.close();



	}

}
