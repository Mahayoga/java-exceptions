/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exceptions4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Integer a = null;
            test(a);
        } catch(Exception e) {
            e.printStackTrace();
	    /*java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "some" is null
                at Real.Exceptions4.test(Exceptions4.java:25)
                at Real.Exceptions4.main(Exceptions4.java:18)
            */
        }
    }
    
    public static int test(Integer some) {
        return some.intValue();
    }
}
