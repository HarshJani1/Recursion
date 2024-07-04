/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solution;

/**
 *
 * @author 91987
 */
public class FindMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []arr1 = {1,3,67,22,45,-10,0,-33,45,12,-1,-62,34,24,67,23,86,34,12,-100,100};
        int n1 = arr1.length;
        System.out.println(findMinNum(arr1,n1));
        System.out.println(findMaxNum(arr1,n1));
    }
    
    public static int findMinNum(int[] arr, int n){
        
        if(n==1){
            return arr[0];
        }
        
        return Math.min(arr[n-1],findMinNum(arr,n-1));
        
    }
    
     public static int findMaxNum(int[] arr, int n){
        
        if(n==1){
            return arr[0];
        }
        
        return Math.max(arr[n-1],findMaxNum(arr,n-1));
        
    }
    
}
