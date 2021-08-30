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
public class Test {
    public static void main(String[] args) {
        int x = 5, j = 0;
        OUTER: 
        for (int i=0; i < 3;)
            INNER: do {
            i++; x++;
            if(x > 10)break OUTER;
            x += 4;
            j++;
            } while (j <= 2);
            System.out.println(x);
    }
}
