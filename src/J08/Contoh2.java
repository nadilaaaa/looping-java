/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Contoh2 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
       
        //For
        System.out.print("Masukkan nilai n atau nilai akhir: ");
        int x;
        int n;
        n = baca.nextInt();
        for(x = 1; x <= n; x++)
        {
            System.out.print(x + " ");
        }
        
        //WHILE
        x = 1;
        while(x <= n)
        {
            System.out.println(x + " ");
            x++;
        }
        
        //DO WHILE
        x = 1;
        do
        {
            System.out.print(x + " ");
            x++;
        }
        while(x <= n);

    }
}
