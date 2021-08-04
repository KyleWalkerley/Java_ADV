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
public class Z01Analyzer {
   public static void main(String[] args) {
    String[] strList = 
    {"tomorrow","toto","to","timbukto","the","hello","heat"};
    String searchStr = "to";
    System.out.println("Searching for: " + searchStr);

    // Create regular class
    AnalyzerTool analyzeTool = new AnalyzerTool();
    
    System.out.println("===Contains===");
    for(String currentStr:strList){
      if  (analyzeTool.arrContains(currentStr, searchStr)){
        System.out.println("Match: " + currentStr);
      }
    }
  } 
}
