package com.mihail.springboot.spring_course_springboot.dao;




import com.mihail.springboot.spring_course_springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
