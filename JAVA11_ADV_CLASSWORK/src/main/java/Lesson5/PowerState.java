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
public enum PowerState {
    OFF("The power is off."),
    ON("The usage is high."),
    SUSPENDED("The power usage is low");
    
    private String description;
    private PowerState(String d){
        description = d;
    }

    public String getDescription() {
        return description;
    }
}
