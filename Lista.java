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
public class Lista {
    Celula primeiro, ultimo;
   /**
    * Cria uma lista vazia
    */ 
    public Lista(){
        primeiro = new Celula();
        ultimo = primeiro;
        primeiro.proximo = null;
    }
    
    public boolean vazia(){
        if (primeiro == null) return true;
        else return false;
        //return primeiro == null;
    }
    public Object pesquisa(Object info){
       if (vazia()) return null;
       Celula aux = primeiro;
       while (aux != null){
           if (aux.item.equals(info)){
               return info;
           }
            aux = aux.proximo;
       }
       return null;
    }
    public void inserir(Object info){
        ultimo.proximo = new Celula();
        ultimo.item = info;
        ultimo = ultimo.proximo;
        ultimo.proximo = null;
        
    }
    public Object retirar(Object info)throws Exception{
         if (this.vazia() || (info == null)) {
         throw new Exception("Erro : Lista vazia");
            }
        Celula aux = primeiro;
        while (aux.proximo != null && !aux.proximo.item.equals(info)) {
            aux = aux.proximo;
        }
        if (aux.proximo == null) {
            return null;
        } 
        Celula q = aux.proximo;
        Object item = q.item;
        aux.proximo = q.proximo;
        if (aux.proximo == null) {
            ultimo = aux;
        }
        return item;
    }
    public void imprimir(){
        while(vazia() == false) {
            System.out.print(primeiro.item);
        }
    }
        
}