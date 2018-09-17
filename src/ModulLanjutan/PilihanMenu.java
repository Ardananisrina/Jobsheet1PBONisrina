/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModulLanjutan;
import java.util.Scanner;
/**
 *
 * @author Nisrina Izdihar
 */
public class PilihanMenu {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        int pilihan = 9;
        do{
            System.out.println("\nMenu Luas Bangun\n");
            System.out.println("1. Menghitung Luas Persegi ");
            System.out.println("2. Menghitung Luas Persegi Panjang ");
            System.out.println("3. Keluar ");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = masukan.nextInt();
            
            switch(pilihan){
                case 1 : luasPersegi();break;
                case 2 : luasPersegiPanjang();break;
            }
        }while(pilihan != 3);
        }
    private static void luasPersegi(){
        Scanner masukan = new Scanner(System.in);
        float sisi, luas;
        System.out.print("Masukkan nilai sisi : ");
        sisi = masukan.nextInt();
        luas = sisi * sisi;
        System.out.println("Luas persegi adalah : " + luas);
    }
    private static void luasPersegiPanjang(){
        Scanner masukan = new Scanner(System.in);
        float panjang, lebar, luas;
        System.out.print("Masukkan nilai panjang : ");
        panjang = masukan.nextInt();
        System.out.print("Masukkan nilai lebar : ");
        lebar = masukan.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah : " + luas);
    }
    
}
