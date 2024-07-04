/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solution;

/**
 *
 * @author 91987
 */
public class FindCapitalString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String s = "geeksforgeeKs";
        String s ="kjzldhzghiodzhihfhdoigzodhihtodgzjkfnllucligczlkdfjgozhdgouzthgozfdngdfgzdodzioghzdoiughodijgoidxjgoijhozijhxoijhofuoitxhkjdhgxkgjgihxhiH";
        System.out.println(findCapChar(s));
        
    }
    
    public static char findCapChar(String s){
        if(Character.isUpperCase(s.charAt(0)) ){
        return s.charAt(0);
    }
        return findCapChar(s.substring(1));
    }
    
}
