package com.ashokit;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Book;
import com.ashokit.repo.BookRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//		it will give the reference of the ioc container
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		//		get the object of the bean from ioc container
		BookRepo repo= ctx.getBean(BookRepo.class);

		//at run time jpa will create the implimentation class (proxy class)for our interface
		//System.out.println(repo.getClass().getName());

		//create the object and set the values for the entity class

		//		Book b=new Book();
		//		
		//		b.setBookId(119);
		//		b.setBookName("Java");
		//		b.setBookPrice(110.05);
		//		
		//		//to save the record and as well as update the existing record

		//		repo.save(b);

		/*
		 * To retrieve the records based in the id(primary key),
		 * if records is not found an empty optional object is returned..
		 * Optional<Book> findById = repo.findById(119);

		     System.out.println(findById.get());
		 * 
		 * 
		 * 
		 */

		/*
		 * to save all the records at a time 
		 */


		/*Book b1=new Book();

		   b1.setBookId(120);
	       b1.setBookName("Spring Boot");
	        b1.setBookPrice(170.05);

		    Book b2=new Book();

		   b2.setBookId(130);
		   b2.setBookName("Java");
		   b2.setBookPrice(190.10);
		 * 
		 * 
		 * 
		 * 
		 * List<Book> bookList=new ArrayList();
		 * 
		 * bookList.add(b1);
		 * bookList.add(b2);
		 * 
		 * 
		 * repo.saveAll(bookList);
		 *      (or)
		 * 
		 * repo.saveAll(Arrays.asList(b1,b2));
		 */

        /*
         * based on the given id,the record is exist in the dataBase or Not
         * 
         * if exists it returns true ,otherWise Return false
         * 
         * boolean status = repo.existsById(120);
		
		    System.out.println(status);  true 
         * 
         */
		
		/*
		 * 
		 * to get the count,how many records present in the table
		 * long count = repo.count();
		   System.out.println(count);
		 */
		
		
		/*  to retrieve the records based on the given primary key
		 *  Optional<Book> record= repo.findById(130);
             to avoid nullpointer exception we are using optaional class object
         if(record.isPresent()) {
            System.out.println(record.get());    	   
       }
		 * 
		 * 
		 */
		
		
		/*
		 * 
		 * 
		 * to retrieve the records based on the given primary keys(multiple id's)
		 * Iterable<Book> findAllById = repo.findAllById(Arrays.asList(119,120));

       for(Book b:findAllById) {
    	   System.out.println(b);
    	   
       }
		 */
		
		/*
		 * 
		 * to get all the records from the database table
		 * 
		 * Iterable<Book> findAll = repo.findAll();
		 * 
		     for(Book b:findAll) {
	    	   System.out.println(b);
	    	   
	       }
		 * 
		 * 
		 */
		
		
		
		/*   delete the records based on the id's
		 * if(repo.existsById(119)) {
			repo.deleteById(119);
		}else {
			System.out.println("Records Not found..");
		}
		 * 
		 */
		
		/*
		 * repo.deleteAll(); delete the all the records
		   repo.deleteAllById(Arrays.asList(110,120)); delete the records based on id
		   repo.delete(b1); delete the record based on entity
		   repo.deleteAll(b1,b2); delete the records based on given entitities
		 * 
		 * 
		 */
		
		
		
		
      
	}

}
