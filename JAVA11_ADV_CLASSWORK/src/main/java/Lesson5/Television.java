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
public class Television extends ElectronicDevice{
    @Override
    public void turnOn() {
        changeChannel(1);
        initializeScreen();
    }
    @Override
    public void turnOff() {}
    
    public void changeChannel(int channel) {
        System.out.println("Channel Changed.");
    }
    
    public void initializeScreen() {
        System.out.println("TV turned on....");
    }
}
