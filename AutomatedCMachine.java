/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathy
 */
public class AutomatedCMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conector c1 = new Conector();
        Conector c2 = new Conector();

        if (c1.conecta(c2)) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
