/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Exceptions2 {
    public static void main(String[] args) {
        try {
            int a = 9 / 0;
            System.out.println(a);
        } catch(Exception e) {
            e.printStackTrace();
	    /*java.lang.ArithmeticException: / by zero
                at Real.Exceptions2.main(Exceptions2.java:14)
            */
        }
    }
}
