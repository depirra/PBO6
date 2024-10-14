/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan6;

/**
 *
 * @author Lenovo AMD3020E
 */
import java.util.Scanner;
public class TabelPerkalian{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan ordo perkalian : ");
        int n = input.nextInt();
        
        System.out.println();
        System.out.println("Tabel Perkalian " + n + " x " + n);
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
		System.out.print((j == 0 ? "  " : j + "  "));
                } else {
                System.out.print((j == 0 ? i + "  " : (i * j) + "  "));
                }
            }
            System.out.println();
        }
    }
}

