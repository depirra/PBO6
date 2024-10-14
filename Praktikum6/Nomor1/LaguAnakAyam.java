/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan6;

/**
 *
 * @author Lenovo AMD3020E
 */
public class LaguAnakAyam{
    public static void main(String[] args){
        int n = 10;
        System.out.println("Lagu Anak Ayam");
        System.out.println();
        for (int i = n ; i> 0; i--) {
            System.out.println("Anak ayam turun " + i);
            System.out.println("Mati satu, tinggal "+((i - 1) == 0?"induknya":i - 1));
            System.out.println();
        }
    }
}
