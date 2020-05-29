package dao;
import java.util.List;

import model.Employee;

//interface performing crud operations
public interface EmployeeDAO {

//insert/create
public void save(Employee employee);

//read/select
public Employee getById(int id);

//update
public void update(Employee employee);

//delete
public void deleteById(int id);

public List<Employee> getAll();
}
