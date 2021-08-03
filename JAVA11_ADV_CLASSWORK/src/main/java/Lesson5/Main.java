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
public class Main {
     public static void main(String[] args) {
        
             
        BankEMICalculator acct1=new   BankEMICalculator("jane", "aa1234", 1000);
        double EMIamt=acct1.getMonthlypayment();
        System.out.print(EMIamt);
    }
}
