package com.varun.it;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.varun.it.Entities.Employee;
import com.varun.it.Repositories.EmployeeRepo;



@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
	
	ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
	    
		
   EmployeeRepo bean = ctxt.getBean(EmployeeRepo.class);

     
  Employee findByEmpName = bean.findByEmpName("kumar");
 
   System.out.println(findByEmpName);
  
   /*Employee findByEmpId = bean.findByempId(103);
     
    System.out.println(findByEmpId);*/
     
 /* List<Employee> empSal = bean.findByEmpSal(20000.00);
   
     
   System.out.println(empSal);
     */
/*	 Employee entity = new Employee();
	
	entity.setEmpId(103);
	entity.setEmpName("laxman"); 
	entity.setEmpSal(35000.0);
	
     Employee save = bean.save(entity);
     
     System.out.println(save);
	
	System.out.println("sucessfully records inserted");*/
     
    /* 
     Employee e1 = new Employee(104, "Madhav" , 4000.00);
     Employee e2 = new Employee(105, "RaMadhav" , 5000.00);
     Employee e3 = new Employee(106, "LaMadhav" , 6000.00);
     
     
     List<Employee> emps = new ArrayList<Employee>();
     
     emps.add(e1); emps.add(e2); emps.add(e3);
     
     bean.saveAll(emps);*/
     
     //Optional class used to avoid the null pointer exception
 /*    Optional<Employee> findById = bean.findById(105);
     if(findById.isPresent())
     {
    	 System.out.println(findById.get());
     }
     else
     {
    	 System.out.println("Record not available");
     }*/
	
    /* List<Serializable> empid = new ArrayList<Serializable>();
     
     empid.add(100);
     empid.add(102);
     empid.add(105);
     
     Iterable<Employee> emps = bean.findAllById(empid);
     
     emps.forEach(emp -> System.out.println(emp));*/
     
    /* Iterable<Employee> findAll = bean.findAll();
     
     findAll.forEach(emp -> System.out.println(emp));*/
     
   /*  long count = bean.count();
     
    System.out.println("Total records :" +count);  */
	 
     /*boolean existsById = bean.existsById(105);
  
     System.out.println("Record Available : " +existsById);*/
     
     
    // bean.deleteById(106);
     
     ctxt.close();
	
	}

}
