/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author kyle_
 */
public class cougar extends Puma {

 public static void main(String[] args) {
 Puma puma = new Puma() {};
 System.out.println(puma.getTailLength());
 }  

    public int getTailLength(int length) {return 2;}
 }

