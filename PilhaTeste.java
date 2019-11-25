/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.faec.tad.test;

import br.edu.faec.tad.Pilha;

/**
 *
 * @author nathy
 */
public class PilhaTeste {
    public static void main (String[] args){
        
        Pilha livros = new Pilha();
        livros.vazia();
        livros.empilhar("Teste");
        livros.mostrar();
        
    }
       
}