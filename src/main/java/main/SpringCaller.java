package main;

import java.util.List;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDAO;
import model.Employee;

public class SpringCaller {

	public static void main(String[] args) {
		System.out.println("Starting Execution..!");
		//Get the Spring Context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		
		//Get the EmployeeDAO Bean
		EmployeeDAO employeeDAO = ctx.getBean("EmployeeDAO", EmployeeDAO.class);
		
		//Run some tests for JDBC CRUD operations
		Employee emp = new Employee();
		//int rand = new Random().nextInt(1000);
		//emp.setId(789);
		//emp.setName("Sai");
		//emp.setRole("Ui/ux Developer");
		
		//Create
		//employeeDAO.save(emp);
		
		//Read
		//Employee emp1 = employeeDAO.getById(456);
		//System.out.println("Employee Retrieved::"+emp1);
		
		
		//emp.setRole("CEO");
		//employeeDAO.update(emp);
		
		//Get All
		List<Employee> empList = employeeDAO.getAll();
		System.out.println(empList);
		for(Employee a : empList)
		{
			System.out.println("Employee name = "+a.getName()+", Employee id ="+a.getId()+", Employee role = "+a.getRole());
		}
		
		
		//Delete
		//employeeDAO.deleteById(rand); 
		
		//Close Spring Context
		ctx.close();
		
		System.out.println("DONE");
	}

}
