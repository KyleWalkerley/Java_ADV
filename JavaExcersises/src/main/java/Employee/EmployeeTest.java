/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import com.example.domain.Employee;

/**
 *
 * @author kyle_
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee ();
        emp.setEmpId(101);
        emp.setName("Kyle Walkerley");
        emp.setSsn ("021-55-4201");
        emp.setSalary(185_000.00);
        System.out.println ("Employee id:         " + emp.getEmpId());
        System.out.println ("Employee name:       " + emp.getName());
        System.out.println ("Employee Soc Sec #:  " + emp.getSsn());
        System.out.println ("Employee salary:     " + emp.getSalary());
    }
}
