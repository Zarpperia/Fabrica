
package classes;

import Interfaces.UmMonteDeNumero;


public  class FabricaDeLista {
    
    public static UmMonteDeNumero getLista(){    
        return new Vetor(10);
    }
    
}
