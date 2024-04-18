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
        }
    }
}
