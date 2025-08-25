package org.practice;

import org.practice.employee.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Manager {

    private static Employee employee;
     public Manager(Employee employee){
         this.employee=employee;
     }


public static List<Employee> getEmployee (){
        return employee.getEmployee();
}
public static List<Employee> addEmployee(){
         return  employee.addemployee();
}
public static List<Employee> updateEmployee(int detail){
//
       return employee.updateEmployee(detail);
}
public static List<Employee> deleteEmployee(int id){
       return   employee.deleteEmpoyee(id);
}
}
