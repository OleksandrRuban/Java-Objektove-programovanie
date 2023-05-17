/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatar;

/**
 *
 * @author vdi-terminal
 */
public class Kalkulatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Adder plus = new Adder();
      plus.calculate(1, 2);
      Cubtractor minus = new Cubtractor();
      minus.calculate(1, 2);
      Multiplier multipiy = new  Multiplier();
      multipiy.calculate(1, 2);
      Divider divide = new Divider();
      divide.calculate(1, 2);
    }
    
}
