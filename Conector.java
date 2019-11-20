/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathy
 */
import java.util.Scanner;

public class Conector {

    private String conector;

    /**
     * Inicializa o conector através do input do usuário.
     */
    public Conector() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque os valores do conector: ");
        conector = scanner.nextLine();

        while (this.validaConector(conector) == false) {
            System.out.println("==============");
            System.out.println("Erro: Conector inválido");
            System.out.println("Coloque 5 valores binários (0 ou 1)");
            System.out.println("==============");
            System.out.println("Coloque os valores do conector: ");
            conector = scanner.nextLine();
        }
    }

    /**
     * Retorna a string contendo o texto digitado pelo usuário (um conector)
     */
    public String getConector() {
        return this.conector;
    }

    /**
     * Verifica se o input passado pelo usuário é um conector válido.
     *
     */
    private boolean validaConector(String conector) {
        return conector.matches("(0|1){5}");
    }

    /**
     * Verifica se um conector conecta ao outro.
     */
    public boolean conecta(Conector c) {
        char c1[] = this.getConector().toCharArray();
        char c2[] = c.getConector().toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] == c2[i]) {
                return true;
            }
        }
        return false;
    }
}
