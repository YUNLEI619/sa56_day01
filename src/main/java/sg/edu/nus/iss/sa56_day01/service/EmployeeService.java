package sg.edu.nus.iss.sa56_day01.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.sa56_day01.model.Employee;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<Employee>();

    public EmployeeService()
    {
        employees.add(new Employee("1", "Hisen", "lee"));
        employees.add(new Employee("2", "Hisen", "tan"));
        employees.add(new Employee("3", "Hisen", "chia"));
    }
    
    public List<Employee> getAllEmployees()
    {
        return this.employees;
    }

    public List<Employee> getEmployeesByLastName(String lastName)
    {
        List<Employee> filterEmployees = employees.stream().filter(emp -> emp.getLastName().equals(lastName)).toList();
        return filterEmployees;
    }
   
}
