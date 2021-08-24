package Exersise9_2;

import Excersise9_1.Bonus;
import Excersise9_1.Employee;
import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author oracle
 */
public class FunctionTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    ToDoubleFunction<Employee> eFunc = 
       e -> e.getSalary() * Bonus.byRole(e.getRole());
      
    System.out.println("=== First Employee Bonus");
    first.printSummary();
    System.out.println("Bonus: " + eFunc.applyAsDouble(first));
        
  }
}
