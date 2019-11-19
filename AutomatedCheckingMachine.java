package br.usp.ime.maratona.warmup.solutions;

import br.usp.ime.maratona.warmup.Desafio;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AutomatedCheckingMachine implements Desafio<String> {
@Override
    public String executar(File input) {
        
    	int vet[] = new int[5];
    	int vet2[] = new int[5];
    	int aux = 0;
    	String res = null;
    	
    try (Scanner sc = new Scanner(input)) {
        for(int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        
        for(int i = 0; i < vet2.length; i++) {
            vet2[i] = sc.nextInt();
        }
        
        for(int i = 0; i < vet.length; i++) {
            if(vet[i]+vet2[i] != 1) {
                aux++;
            }
        }
        
        if(aux == 0) {
            res = "Y";
        } else {
            res = "N";
        }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AutomatedCheckingMachine.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        return res;
    }
}
