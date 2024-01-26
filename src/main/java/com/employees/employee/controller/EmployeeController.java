package com.employees.employee.controller;

import com.employees.employee.model.Employee;
import com.employees.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    private List<Employee> getEmployees(){

        List<Employee> e = employeeService.getEmployees();
        return e;
    }
    @PostMapping("/employees")
    private void saveEmployees(@RequestBody List<Employee> e){
        employeeService.saveEmployees(e);

    }

    @GetMapping("/employees/{id}")
    private Optional<Employee> getEmployee(@PathVariable String id){
        return employeeService.findEmployeebyId(id);
    }

    @GetMapping("/employees/{id}/pay")
    private double getEmployeePay(@PathVariable String id){
        double salary = 0;
        Optional<Employee> e = employeeService.findEmployeebyId(id);
        if(e.isPresent()){
            salary = e.get().getSalary();
        }
        
        return salary - (0.31*salary);
    }
}
