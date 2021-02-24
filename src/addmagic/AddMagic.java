/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addmagic;

import moduls.Hiber;

/**
 *
 * @author WSR
 */
public class AddMagic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        try {
            Hiber.start();
            NewJFrame nf = new NewJFrame();
            nf.setVisible(true);
        } catch (Exception e) {
            System.exit(0);
        }
    }
    
}
