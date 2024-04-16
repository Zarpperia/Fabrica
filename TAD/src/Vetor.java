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
public class Vetor implements UmMonteDeNumero{
    
    int vetor[];
    int indiceDaVez;
    
    public Vetor(int tamanho){    
       this.vetor = new int[tamanho];
       this.indiceDaVez =0;
    }
    
   /* public Vetor(){
      System.out.println("Passou no construtor VAZIO");
    
    }
    
    public Vetor(String nome){
    
      System.out.println("Passou no construtor STRING " + nome);
    }*/

    @Override
    public void inserir(int n) {
        this.vetor[this.indiceDaVez]=n;
        this.indiceDaVez++;
    }

    @Override
    public int buscar(int n) {
        int tamanho = this.vetor.length;
        
        for(int i = 0; i < tamanho; i++){
            if (this.vetor[i]== n){
                return i;
            }
        }        
        return -1;
    }

    @Override
    public int tamanho() {
       return this.vetor.length;
    }

    @Override
    public void ordernar() {
        boolean troca =true;
        int aux;
        while(troca){
            troca = false;
            for (int i = 0; i < this.vetor.length - 1;i++){
                if(this.vetor[i]>this.vetor[i+1]){
                    aux = this.vetor[i];
                    this.vetor[i] = this.vetor[i + 1];
                    this.vetor[i + 1] = aux;
                    troca = true;                            
                }
            }
        }
    }
    @Override
    public int numero(int index) {
        return this.vetor[index];
    }
    
    @Override
    public void imprimir(){
    
        for(int item: this.vetor){            
            System.out.print(item + " ");
        }
        System.out.println("");
    }
    
    
    
}
