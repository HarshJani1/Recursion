/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solution;

/**
 *
 * @author 91987
 */
public class power {

    /**
     * @param args the command line arguments
     */
    private static final long MOD = 1_000_000_007;
    public static void main(String[] args) {
        
        int num = 1;
        long even = num/2;
        long odd = (num+1)/2;
        System.out.println(pow(5,even)*pow(4,odd)%MOD);
    }
    
//=================================================================================================
    
    public static int pow(int a, int b){
        if(b == 0){
            return 1;
        }
        if(b%2 == 0){
            return pow(a*a,b/2);
        }
        return a*pow(a*a,(b-1)/2);
    }
    
//----------------------------------------------------------------------
    
     public static double myPow(double a, int b) {
          if(b == 0){
            return 1.00000;
        }
        if(b%2 == 0){
            return (double)pow((int) (a*a),b/2);
        }
        return (double)a*pow((int) (a*a),(b-1)/2);
    }
     
//=================================================================================================================
     
     public static long pow(long a, long b){
        if(b == 0){
            return 1;
        }
        if(b%2 == 0){
            return pow(a*a,b/2);
        }
        return a*pow(a*a,(b-1)/2);
    }
}
