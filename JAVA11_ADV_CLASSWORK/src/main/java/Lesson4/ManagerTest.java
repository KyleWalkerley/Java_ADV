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
public class ManagerTest {
    public static void main(String args[]) {
        Manager mgr = new Manager(151, "Tom", "444-44-4444", 8000, "admin");

        System.out.println("Manager: " + mgr.getDetails());
    }
}
