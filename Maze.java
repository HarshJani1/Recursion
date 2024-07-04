/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solution;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author 91987
 */
public class Maze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println(countMazePath(3,3));
//        mazePath("",3,3);
//        System.out.println(mazePath_2("",3,3));
        HashMap<String,Integer> map = new HashMap<>();
        System.out.println(countMazePathDP(23,12,map));
    }
 
//-------------------------------------------------------------------------------------------------------------   
     
    public static void mazePath(String p , int row, int clm){    
       if(row == 1 && clm == 1){
           System.out.println(p);
           return;
       }
       
       if(clm > 1){
           mazePath(p + "R",row,clm-1);
       }
       if(row > 1){
           mazePath(p + "D",row-1,clm);
       }
    }
    
//------------------------------------------------------------------------------------------------------------
    
    public static ArrayList mazePath_2(String p , int row, int clm){
        if(row == 1 && clm == 1){
          ArrayList<String> list = new ArrayList<>();
          list.add(p); 
           return list;
       }
       
        ArrayList<String> path = new ArrayList<>();
        
       if(clm > 1){
           path.addAll(mazePath_2(p + "R",row,clm-1));
       }
       if(row > 1){
           path.addAll(mazePath_2(p + "D",row-1,clm));
       }
        
        return path;
    }
    
//---------------------------------------------------------------------------------------------
    
    public static int countMazePath( int row, int clm){
        if(row == 1 && clm == 1){
         return 1;
       }
        
        int count=0;
       
       if(clm > 1){
          count += countMazePath(row,clm-1);
       }
       if(row > 1){
           count += countMazePath(row-1,clm);
       }
        return count;
    }
    
 //==========================================------=-=-===--=-=-==-=================================
      
    
    public static int countMazePathDP( int row, int clm,HashMap<String,Integer> map){
        if(row == 1 && clm == 1){
         return 1;
       }
        String key = row+""+clm;
        
        if(map.containsKey(key)){
            return map.get( key);
        }
        
        int count=0;
        
       
       if(clm > 1){
          count += countMazePathDP(row,clm-1,map);
       }
       if(row > 1){
           count += countMazePathDP(row-1,clm,map);
       }
       
       map.put(key,count);
        return map.get( key);
    }
}
