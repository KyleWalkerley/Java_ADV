/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersise5_1;

/**
 *
 * @author kyle_
 */
public class CheckAccount extends Account{
    private final double overDraftLimit;
    
public CheckAccount(double balance) {
    this(balance, 0);
}
    
    public CheckAccount(double balance, double overDraftLimit) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance + overDraftLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Check Account";
    }
    
}
