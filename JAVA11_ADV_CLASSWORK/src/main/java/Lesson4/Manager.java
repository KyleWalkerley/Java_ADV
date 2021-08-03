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
public class Manager extends Employee{
    private String depName;
    
    public String getDdepNameeptName() {
        return depName;
    }

    public void setDeptName(String deptName) {
        this.depName = deptName;
    }

    public Manager(int empId, String name, String ssn, double salary, String dept) {
      super(empId, name, ssn, salary);
      depName = dept;
    }

    @Override
    public String getDetails() {
      return super.getDetails () + 
        " Dept: " + depName;
    }

    @Override
    public String getAllDetails() {
      return super.getDetails () + 
        " Dept: " + depName;
    }
}
