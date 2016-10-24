/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewCode;

import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */
public class NewCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    short numero1,numero2;
    
    numero1 = Short.parseShort(JOptionPane.showInputDialog("numero1"));
    numero2 = Short.parseShort(JOptionPane.showInputDialog("numero2"));
    {
    if (numero1 > numero2){ System.out.print((numero1-numero2));}
    else System.out.print((numero1+numero2));
    }
    
    }
    
}