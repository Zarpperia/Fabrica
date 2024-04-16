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
public class Lista implements UmMonteDeNumero{
    int vetor[];
    int indiceDaVez;
    
    public Lista(int tamanho){    
       this.vetor = new int[tamanho];
       this.indiceDaVez =0;
    }
    
    @Override
    public void inserir(int n) {
        this.vetor[this.indiceDaVez]=n;
        this.indiceDaVez++;
    }

    @Override
    public int buscar(int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int tamanho() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ordernar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int numero(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void imprimir() {
       
        if (this.indiceDaVez > 0){
            
            for(int i = 0; i <= this.indiceDaVez-1;i++){
                System.out.print(this.vetor[i] + " ");
            }
            System.out.println("");
        } 
    }
    
}
