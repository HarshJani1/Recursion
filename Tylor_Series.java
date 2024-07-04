/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solution;

/**
 *
 * @author 91987
 */
public class Tylor_Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(tylor(3,4));
        System.out.println(tylor_recursion(3,4));
    }

    public static int tylor(int x, int n) {
        int s = 1;

        while (n > 0) {
            s = 1 + ((x / n) * s);
            n--;
        }
        return s;
    }
    static int s = 1;

    public static int tylor_recursion(int x, int n) {
        if (n == 0) {
            return s;
        }
        s = 1 + ((x / n) * s);

        return tylor_recursion(x, n - 1);
    }
}
