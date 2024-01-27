package com.employees.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Table(name = "employee")
@ToString
public class Employee {

    @Id
    private String id;

    private String name;

    private String gender;

    private double salary;

    private String state;

    private double tax;
}

