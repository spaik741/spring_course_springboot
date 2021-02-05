package com.mihail.springboot.spring_course_springboot.service;





import com.mihail.springboot.spring_course_springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public void deleteEmployee(int id);

    public Employee getEmployee(int id);

    public List<Employee> findAllByName(String name);
}
