/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author TOSHIBA
 */
public class Utilidades {
    
    public static boolean esDigito(char simbolo) {
        
        if (simbolo == '0' || simbolo == '1' || simbolo == '2' || simbolo == '3' || simbolo == '4' || simbolo == '5' || simbolo == '6' || simbolo == '7' || simbolo == '8' || simbolo == '9')
            return true;
        else
            return false;
        
    }
    
}
