package com.employees.employee.service;

import com.employees.employee.dao.EmployeeDAO;
import com.employees.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    public List<Employee> getEmployees() {
        List<Employee> e = employeeDAO.findAll();

        return e;

    }

    public void saveEmployees(List<Employee> e) {
        employeeDAO.saveAll(e);
    }

    public Optional<Employee> findEmployeebyId(String id) {

        return employeeDAO.findById(id);
    }
}
