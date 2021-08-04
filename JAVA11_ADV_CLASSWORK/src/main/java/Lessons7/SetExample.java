/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lessons7;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author kyle_
 */
public class SetExample {
    public static void main(String[] args){
        Set<String> set = new TreeSet<>();
        
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("three"); // not added, only uniques
        
        for (String item:set){
            System.out.println("Item: " + item);
        }
       
    }
}
