/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersise4_2Domain;

/**
 *
 * @author kyle_
 */
public class Engineer extends Employee{
    public Engineer(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }
     public void engineerMethod(){
        System.out.println("Method specific to Engineer class");
    }
}
