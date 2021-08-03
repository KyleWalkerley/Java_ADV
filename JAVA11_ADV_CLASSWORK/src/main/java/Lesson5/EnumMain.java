/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

/**
 *
 * @author kyle_
 */
public class EnumMain {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.setState(PowerState.ON);
        System.out.println("Current state: " + comp.getState());
        System.out.println("Description: " + comp.getState().getDescription());
    }
}
