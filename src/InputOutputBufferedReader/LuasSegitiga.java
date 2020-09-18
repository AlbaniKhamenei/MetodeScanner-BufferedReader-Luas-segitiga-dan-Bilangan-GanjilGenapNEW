/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputBufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Windows 10
 */
public class LuasSegitiga {
    public static void main(String[] args) {
        
    Scanner input=new Scanner (System.in);
    
    double L, A, T;
    
    System.out.print("Masukan Alas = ");
    A = input.nextDouble();
    System.out.print("Masukan Tinggi = ");
    T = input.nextDouble();
    
    L = 0.5 * A * T;
    System.out.println("Luas Segi Tiga =" + L);
    }
}
