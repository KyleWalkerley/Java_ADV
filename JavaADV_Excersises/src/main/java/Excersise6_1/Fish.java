/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersise6_1;

/**
 *
 * @author kyle_
 */
public class Fish extends Animal implements Pet{
    private String name;
    
    public Fish(){
        super(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
