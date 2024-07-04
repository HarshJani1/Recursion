/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solution;

/**
 *
 * @author 91987
 */
public class Parenthesis {
    static int count;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(paren("[]{}()"));
    }
    
     public static boolean paren(String s){
        
       return paren(s,0) == 0; 
        
    }
    
    public static int paren(String s,int i){
        
        if(i>s.length()-1) return 0;
        
        char ch = s.charAt(i);
        if(ch == '(' || ch=='{' || ch == '[')return 1 + paren(s,++i);
        else  return -1 + paren(s,++i);
       
        
    }
    
}
