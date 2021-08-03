/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

/**
 *
 * @author kyle_
 */
public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;
    
    public Employee(int empId, String name, String ssn, double salary) {
      this.empId = empId;
      this.name = name;
      this.ssn = ssn;
      this.salary = salary;
    }

    public String getDetails() {
      return "ID: " + empId + " Name: " + name;
    }

    public String getAllDetails() {
        return "ID: " + empId + " Name: " + name 
          + " SSN: " + ssn + " Salary: " + salary;
    }
    
    public double getSalary(){
      return this.salary;
    }
}
