/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6AnonymouseClass;

/**
 *
 * @author kyle_
 */
public class Z04Analyzer {
    public static void searchArr(String[] strList, String searchStr, StringAnalyzer analyzer){
    for(String currentStr:strList){
      if (analyzer.analyze(currentStr, searchStr)){
        System.out.println("Match: " + currentStr);
      }
    } 
  }
  
  public static void main(String[] args) {
    String[] strList01 = 
    {"tomorrow","toto","to","timbukto","the","hello","heat"};
    String searchStr = "to";
    System.out.println("Searching for: " + searchStr);

    // Implement anonymous inner class
    System.out.println("===Contains===");
    Z04Analyzer.searchArr(strList01, searchStr, 
      new StringAnalyzer(){
        @Override
        public boolean analyze(String target, String searchStr){
          return target.contains(searchStr);
        }
      });    
  }
}
