/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.faec.tad;

/**
 *
 * @author nathy
 */
public class Pilha {
    Celula primeiro, topo;
    
    public Pilha(){
        topo = new Celula();
        primeiro = topo;
        topo.proximo = null;
    }
    
    public void empilhar(Object info){
        topo.proximo = new Celula();
        topo = topo.proximo;
        topo.item = info;
        topo.proximo = null;
    }
    
    public boolean vazia(){
        if (primeiro == null) return true;
        else return false; 
    }
    
    public void mostrar (){
        while(vazia() == false) {
            System.out.print(topo.item);
        }
    }
}
