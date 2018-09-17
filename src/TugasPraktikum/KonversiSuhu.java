/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Nisrina Izdihar
 */
public class KonversiSuhu {
    public static void main(String[] args){
        int celcius;

double kelvin, fahrenheit, reamur;

celcius = 78;
kelvin = celcius + 273;
fahrenheit = celcius * 9/5 + 100;
reamur = 0.8 * celcius + 100;

System.out.println("-----Menghitung Konversi Suhu-----");
System.out.println("Celcius ke reamur, fahrenheit, kelvin ");
System.out.println("Suhu celcius : " + celcius);
System.out.println("celcius ke reamur : " + reamur);
System.out.println("Celcius ke fahrenheit : " + fahrenheit);
System.out.println("Celcius ke kelvin : " + kelvin);

    }
}
