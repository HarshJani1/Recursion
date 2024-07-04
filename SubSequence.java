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
public class SubSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tiles = "V";
        ArrayList<String> a = subS_5("","V",0,new  ArrayList<Integer>());
        System.out.println(a.size());
        
    }

    public static ArrayList<String> subS(String s) {

        if (s.length() == 0) {
            ArrayList<String> last = new ArrayList<>();
            last.add("");
            return last;
        }

        char ch = s.charAt(0);

        ArrayList<String> ans = subS(s.substring(1));

        ArrayList<String> realAns = new ArrayList<>();

        for (String c : ans) {
            realAns.add("" + c);
        }

        for (String c : ans) {
            realAns.add(ch + c);
        }

        return realAns;
    }

//---------------------------------------------------------------------------------------------------
    static String s2[] = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQR", "STU", "VWX", "YZ"};

    public static ArrayList<String> subS_2(String s) {

        if (s.length() == 0) {
            ArrayList<String> last = new ArrayList<>();
            last.add("");
            return last;
        }

        char ch = s.charAt(0);

        ArrayList<String> ans = subS_2(s.substring(1));

        ArrayList<String> realAns = new ArrayList<>();

        String str = s2[ch - '0'];

        for (int i = 0; i < str.length(); i++) {
            char word1 = str.charAt(i);
            for (String word : ans) {
                realAns.add(word1 + word);
            }
        }

        return realAns;
    }

    //--------------------------------------------------------------------------------------------------
    public static void subS_3(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        subS_3(p + up.charAt(0), up.substring(1));
        subS_3(p, up.substring(1));
    }

//--------------------------------------------------------------------------------------------------------------
    static ArrayList<String> list = new ArrayList<>();

    public static ArrayList<String> subS_4(String p, String up) {
        if (up.length() == 0) {
            list.add(p);
        }

        subS_3(p + up.charAt(0), up.substring(1));
        subS_3(p, up.substring(1));

        return list;
    }
//====================================================================================================================
    static ArrayList<String> list1 = new ArrayList<>();

    public static ArrayList<String> subS_5(String p, String up,int start,ArrayList<Integer> idx) {
  
            if (!list1.contains(p) && !p.equals("")) {
                list1.add(p);
                System.out.println(p);
            }

        for (int i = 0; i < up.length(); i++) {
            if(idx.contains(i)) continue;
            idx.add(i);
            subS_5(p + up.charAt(i), up,0,idx);
            idx.remove(idx.size()-1);
        }
        return list1;
    }
}
