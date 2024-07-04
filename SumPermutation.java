/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solution;

import java.util.ArrayList;

/**
 *
 * @author 91987
 */
public class SumPermutation {

    static int count = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] arr = {2, 3, 6, 7};
        //int target = 8;
        //pub1(arr,"",0,0,target);
        int[] arr= {1,1,1,1,1};
        int target=3;
        pub1(arr,"",0,0,target);
    }

//-======================================================================================================

    public static void pub(int []arr, String sum, int sum1, int index, int target ) {
        if(index == arr.length){
            if(sum1 == target){
                System.out.println(sum+",");
            }
            return;
        }
        
        pub(arr,sum+arr[index]+" ",sum1+arr[index],index+1,target);
        pub(arr,sum,sum1,index+1,target);
        
    }
    
//----------------------------------------------------------------------------------------------------
    //?????????????????????????????????????????????????????????????????????????????
    public static void pub1(int []arr, String sum, int sum1, int index, int target ) {
        if(sum1 > target){
              return;
         }
        
        if(sum1 == target){
              System.out.println(sum+",");
              return;
         }
        if(index == arr.length){
            return;
        }
        
        for(int i = index; i<arr.length;i++){
            pub1(arr,sum+arr[index]+" ",sum1+arr[index],index,target);
        }
        
    }
    //?????????????????????????????????????????????????????????????????????????????
//================================================================================================================
    
    public static void pub3(int []arr, String sum, int sum1, int index, int target ) {
        if(sum1 > target){
              return;
         }
        
        if(sum1 == target){
              System.out.println(sum+",");
              return;
         }
        if(index == arr.length){
            return;
        }
        
        for(int i = 0; i<arr.length;i++){
            pub3(arr,sum+arr[index]+" ",sum1+arr[index],i,target);
            pub3(arr,sum+arr[index]+" ",sum1-arr[index],i,target);
        }
        
    }

}
