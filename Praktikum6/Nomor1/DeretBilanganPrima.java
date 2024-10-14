/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan6;

/**
 *
 * @author Lenovo AMD3020E
 */
public class DeretBilanganPrima{
    public static void main(String[] args){
        int n = 20;
        System.out.println("Deret Bilangan Prima dari 0 sampai " + n + ": ");
        for (int i = 0; i <= n; i++){
            int bilangan = 0;
            for (int j = 1; j <= i; j++){
                if(i%j == 0 ){
                    bilangan++;
                }
            }
            if(bilangan == 2){
                System.out.print(i+" ");
            }
        }
        
        System.out.println();
        System.out.println("Deret Bilangan Bukan Prima dari 0 sampai " + n + ": ");
        for (int i = 0; i <= n; i++){
            int bilangan = 0;
            for (int j = 1; j <= i; j++){
                if(i%j == 0 ){
                    bilangan++;
                }
            }
            if(bilangan != 2){
                System.out.print(i + " ");
            }
        }
    }
    
}

