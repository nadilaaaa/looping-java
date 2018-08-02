/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08;

/**
 *
 * @author WINDOWS 10
 */
public class Contoh3 {
    public static void main(String[] args) {
        
        //CARA I
        //MENAMPILKAN 1O BILANGAN GANJIL PERTAMA
        int x = 1;
        
        for(x = 1; x <= 20; x+=2)
        {
            System.out.print(x + " ");
        }
        
        
        //MENAMPILKAN 10 BILANGAN GENAP PERTAMA
        
        for(x = 2; x <= 20; x+=2)
        {
            System.out.println(x + " ");
        }
        
        //CARA II
        
        for(x = 1; x <= 20; x++)
        {
            if(x % 2 == 1)
            {
                System.out.print(x + " ");
            }
        }
    }
}
