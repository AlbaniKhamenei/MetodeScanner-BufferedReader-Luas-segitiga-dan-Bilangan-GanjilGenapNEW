/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputBufferedReader;
import java.util.Scanner;
/**
 *
 * @author Windows 10
 */
public class MenentukanBilanganGanjilGenap {
    public static void main(String[] args){
        //Scanner
        Scanner input = new Scanner(System.in);
       
        System.out.println("Masukkan Sebuah Angka :");
        int angka = input.nextInt();
        
        // Ganjil -- > Jika angka % 2 = 1
        // Genap --- > Jika angka % 2 = 0
        if(angka % 2 == 0){
            System.out.println("Angka " + angka + " adalah bilangan genap ");
        }else
            System.out.println("Angka " + angka + " adalah bilangan ganjil ");
        }

}