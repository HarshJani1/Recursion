/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solution;

import java.util.HashMap;

/**
 *
 * @author 91987
 */
public class fibbo {
        
      static HashMap<Long,Long> dp = new HashMap<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(fibboDp(50));
        
        
    }
    
    public static long fibboDp(long n){
        if(n == 0 || n ==1){
            return n;
        }
        
        if(dp.containsKey(n) ){
            return dp.get(n);
        }
        
         dp.put(n, fibboDp(n-1)+fibboDp(n-2));
         return dp.get(n);
        
    }
    
}
