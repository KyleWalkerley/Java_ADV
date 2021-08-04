/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

/**
 *
 * @author kyle_
 */
public class CrushedRock implements SalesCalcs{
    private String name;
    private double salesPrice = 0;
    private double cost = 0;
    private double weight = 0;
    
    public CrushedRock(double salesPrice, double cost, double weight){
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.weight = weight;
    }
    
   @Override
  public String getName(){
    return this.name;
  }
    
  @Override
  public double calcSalesPrice(){
    return this.salesPrice * this.weight;
  }
  
  @Override
  public double calcCost(){
    return this.cost * this.weight;
  }
  
  @Override
  public double calcProfit(){
    return this.calcSalesPrice() - this.calcCost();
  }
}
