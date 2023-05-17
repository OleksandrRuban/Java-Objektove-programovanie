/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;

/**
 *
 * @author vdi-terminal
 */
public class Zadanie3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle bmw = new Car ();
        bmw.marka = "bmw";
        System.out.println(bmw.marka);
        Motocycle mot = new Motocycle();
        mot.marka = "suzuki";
        System.out.println(mot.marka);
        System.out.println(mot.hasSidecar);
    }
    
}
