/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solution;

/**
 *
 * @author 91987
 */
public class Geek_onacci {
    static int a=1;
    static int b=3;
    static int c=2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(findN(6));
    }
    
    public static int findN(int n){
        if(n == 1){return a;}
        if(n==2) return b;
        if(n==3) return c;
        
        return findN(n-1)+findN(n-2)+findN(n-3);
        
    }
    
}
