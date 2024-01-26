package com.employees.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Employee {

    @Id
    private String id;

    private String name;

    private String gender;

    private double salary;

//    public double getSalary() {
//        return salary;
//    }
}

