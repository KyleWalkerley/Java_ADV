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
public class CastTest01 {
    public static void main(String[] args) {
    Employee e = new Manager(102, "Joan Kern", 
        "012-23-4567", 110_450.54, "Marketing");
    
    if (e instanceof Manager){
//      Manager m = (Manager) e;
      Manager m = new Manager(102, "Joan Kern", 
        "012-23-4567", 110_450.54, "Marketing");
      m.setDeptName("HR");
      System.out.println(m.getDetails());
      System.out.println(e.getDetails());
      
        System.out.println("E Object hashCode: " + e.hashCode());
        System.out.println("M Object hashCode: " + m.hashCode());
    }
  }
}
