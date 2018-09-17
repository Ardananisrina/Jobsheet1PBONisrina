/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author Nisrina Izdihar
 */
public class Tugas1 {
    public static void main(String[] args){
        int a = 4;
        int b = 2;
        
        for(int i=0; i<a; i++){
            System.out.print("@");
        }
       
        System.out.println(""); 
        for(int j=0; j<b;j++){
            System.out.print("@");   
            for(int u=0; u<(a-2); u++){
                System.out.print(" ");
                if(u==(a-3)){
                    System.out.print("@");
                }
            }
                System.out.println("");
        }
      
        for(int l=0; l<a; l++){
            System.out.print("@");
        }
        
        System.out.println("");
        
    }
    
}
