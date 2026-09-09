/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frutas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author prestamo
 */
public class Frutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
List<String> fruteriaFIJA = new ArrayList<>();
        fruteriaFIJA.add("PAN");
        fruteriaFIJA.add("Cebolla");
        fruteriaFIJA.add("Leche");
        fruteriaFIJA.add("Arroz");
        System.out.println("Lista fija: " + fruteriaFIJA);
List<String> fruteriaCambia = new ArrayList<>();
        fruteriaCambia.add("Galletas");
        fruteriaCambia.add("Yogur"); 
        fruteriaCambia.add("Calaos"); 
        fruteriaCambia.add("Sopa"); 
        System.out.println("Lista cambiante: " + fruteriaFIJA);
        
fruteriaFIJA.addAll(fruteriaCambia);
        System.out.println("Esta es la lista combianda" + fruteriaFIJA);
    }
}   

