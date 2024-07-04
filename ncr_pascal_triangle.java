/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solution;

/**
 *
 * @author 91987
 */
public class ncr_pascal_triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(nCr(3,2));
    }
    
    public static int nCr(int n, int r){
        if(n == r || r == 0){
            return 1;//<= for example: 0c0 =1; and 4c4 = 1; and 4c0 =1;
        }
        
        return nCr(n-1,r-1)+nCr(n-1,r);/*<= here for example: 4c3= 3c2+3c3 */
    }
}
