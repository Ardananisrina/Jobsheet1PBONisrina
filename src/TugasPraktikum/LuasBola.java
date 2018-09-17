/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;
import java.util.Scanner;
/**
 *
 * @author Nisrina Izdihar
 */
public class LuasBola {
    public static void main(String[] args){
        Scanner baca = new Scanner(System.in);
        System.out.print("masukkan r : ");
        double r = baca.nextDouble();
        System.out.print("masukkan phi : ");
        double phi = baca.nextDouble();
        
        System.out.println("Luas Permukaan Bola : " + (4*phi*r*r));
        
        
    }
    
}
