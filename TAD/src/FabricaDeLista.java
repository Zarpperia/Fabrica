/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import Interfaces.UmMonteDeNumero;

/**
 *
 * @author elienai.neves
 */
public  class FabricaDeLista {
    
    public static UmMonteDeNumero getLista(){    
        return new Vetor(10);
    }
    
}
