/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solution;

/**
 *
 * @author 91987
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isPowerOfTwo(4194303));
    }
    
    public static boolean isPowerOfTwo(int n) {
        // Base case: If n is less than or equal to 0, it's not a power of two
        if (n <= 0) {
            return false;
        }

        // Base case: If n is 1, it is a power of two
        if (n == 1) {
            return true;
        }

        // If n is even, recursively check n/2
        if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        } else {
            // If n is odd, it can't be a power of two
            return false;
        }
    }
    
    
    
 
}
