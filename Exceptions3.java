/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exceptions3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukkan umur kamu: ");
            int umur = sc.nextInt();
            System.out.println("Umur kamu adalah " + umur);
        } catch(Exception e) {
            e.printStackTrace();
	    /*java.util.InputMismatchException
                at java.base/java.util.Scanner.throwFor(Scanner.java:964)
                at java.base/java.util.Scanner.next(Scanner.java:1619)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
                at Real.Exceptions3.main(Exceptions3.java:18)
            */
        }
    }
}
