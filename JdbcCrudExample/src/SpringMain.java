import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringMain {
 
    public static void main(String[] args) {
        //Get the Spring Context
    	Resource r=new ClassPathResource("applicationConfig.xml");  
        BeanFactory ctx=new XmlBeanFactory(r);  
          
         
        //Get the EmployeeDAO Bean//DMDS
        EmployeeDAO employeeDAO = (EmployeeDAO) ctx.getBean("employeeDAO");
         
        //Run some tests for JDBC CRUD operations
		
//	 Employee employee = new Employee(); //uncomment below stuff if you want code for
//		 // inserting the data into a table 
//		  int rand = new Random().nextInt(1000);
//		  employee.setId(rand); 
//		  employee.setName("srilatha"); 
//		  employee.setRole("hr");
//		  employeeDAO.save(employee);
//		 System.out.println("Employee Saved Successfully");
         
       // Read
//       Employee emp1 = employeeDAO.getById(196);
//       System.out.println("Employee Retrieved::"+emp1);
       
       //Update
		
		
//		 Employee emp = new Employee();
//		 emp.setId(196);
//		 emp.setRole("trainer");
//		 emp.setName("sandy"); 
//		 employeeDAO.update(emp);
//	 
//		    Employee emp2 = employeeDAO.getById(196);
//        System.out.println("Employee Retrieved::"+emp2);
	 
//		 //JdbcTemplate
        
       //Get All
		
		  List<Employee> empList = employeeDAO.getAll(); 
		  
		  for(Employee emp:empList)
		  {
			  System.out.println(emp);
		  }
		 
         
        //Delete
   employeeDAO.deleteById(196);
         
        //Close Spring Context
      //  ctx.close();
         
        System.out.println("DONE");
    }
 
}