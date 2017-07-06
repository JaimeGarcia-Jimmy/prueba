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
    
    
    public static boolean esLetra(char simbolo) {
        
        if (simbolo == 'a' || simbolo == 'b' || simbolo == 'c' || simbolo == 'd' || simbolo == 'e' || 
                simbolo == 'f' || simbolo == 'g' || simbolo == 'h' || simbolo == 'i' || simbolo == 'j' || 
                simbolo == 'k' || simbolo == 'l' || simbolo == 'm' || simbolo == 'n' || simbolo == 'ñ' || 
                simbolo == 'o' || simbolo == 'p' || simbolo == 'q' || simbolo == 'r' || simbolo == 's' || 
                simbolo == 't' || simbolo == 'u' || simbolo == 'v' || simbolo == 'w' || simbolo == 'x' || 
                simbolo == 'y' || simbolo == 'z' || 
                simbolo == 'A' || simbolo == 'B' || simbolo == 'C' || simbolo == 'D' || simbolo == 'E' || 
                simbolo == 'F' || simbolo == 'G' || simbolo == 'H' || simbolo == 'I' || simbolo == 'J' || 
                simbolo == 'K' || simbolo == 'L' || simbolo == 'M' || simbolo == 'N' || simbolo == 'Ñ' || 
                simbolo == 'O' || simbolo == 'P' || simbolo == 'Q' || simbolo == 'R' || simbolo == 'S' || 
                simbolo == 'T' || simbolo == 'U' || simbolo == 'V' || simbolo == 'W' || simbolo == 'X' || 
                simbolo == 'Y' || simbolo == 'Z' ||
                simbolo == 'á' || simbolo == 'é' || simbolo == 'í' || simbolo == 'ó' || simbolo == 'ú' ||
                 simbolo == 'Á' || simbolo == 'É' || simbolo == 'Í' || simbolo == 'Ó' || simbolo == 'Ú')
            return true;
        else
            return false;
        
    }
    
}
