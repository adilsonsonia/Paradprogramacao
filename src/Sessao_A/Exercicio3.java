
package Sessao_A;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduza os dados que são solicitados a seguir ");
        
        System.out.print("Introduza o valor de A: ");
        int valorA = tec.nextInt();
        System.out.print("Introduza o valor de B: ");
        int valorB = tec.nextInt();
        System.out.print("Introduza o valor de C: ");
        int valorC = tec.nextInt();
        System.out.print("Introduza o valor de D: ");
        int valorD = tec.nextInt();
        
        int diferenca = (valorA*valorB) - (valorC * valorD);
        System.out.println("O resultado do cálculo é: " + diferenca);
    }
}
