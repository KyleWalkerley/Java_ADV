/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lessons7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kyle_
 */
public class GenericArrayList {
    public static void main(String args[]){
    
    List<Integer> partList = new ArrayList<>(3);
    
    partList.add(new Integer(1111));
    partList.add(new Integer(2222));
    partList.add(new Integer(3333));
    partList.add(new Integer(4444)); // Arraylist auto grows

    System.out.println("First Part: " + partList.get(0)); // First item
    partList.add(0, new Integer(5555)); // Insert an item by index
    
    // partList.add("Bad Data");  // compile error now
    
    
    // Print List

    for (Integer partNumberObj:partList){
      int partNumber = partNumberObj; // Demonstrates autoboxing.
      System.out.println("Part number: " + partNumber);  
    } 
    
  }
}
