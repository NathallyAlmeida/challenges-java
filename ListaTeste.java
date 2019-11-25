/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.faec.tad.test;

import br.edu.faec.tad.Lista;

/**
 *
// * @author nathy
 */
public class ListaTeste {
    public static void main (String[]args){
        
        Lista mercado = new Lista();
        mercado.vazia();
        mercado.inserir("Teste");
        mercado.imprimir();
        
    }
    
    
}