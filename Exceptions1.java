/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Exceptions1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[5]);
        } catch(Exception e) {
            e.printStackTrace();
	    /* java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
                at Real.Exceptions1.main(Exceptions1.java:15)
            */
        }
    }
}
