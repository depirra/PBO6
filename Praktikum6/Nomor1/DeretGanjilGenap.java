/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan6;

/**
 *
 * @author Lenovo AMD3020E
 */
public class DeretGanjilGenap{
    public static void main(String[] args){
        int n = 20;
        System.out.println("Deret Bilangan Ganjil dari 0 sampai " + n + ": ");
        for (int i = 0; i <= n; i++) {
            if (i%2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Deret Bilangan Genap dari 0 sampai " + n + ": ");
        for (int i = 0; i <= n; i++) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }
    }    
}

