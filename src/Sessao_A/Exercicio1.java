
package Sessao_A;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("***** Introduz dois numeros *****");
        
        System.out.println("Introduza o 1° número");
        int n1 = tec.nextInt();
        
        System.out.println("Introduza o 2° número");
        int n2 = tec.nextInt();
        
        int soma = n1 + n2;
        System.out.println("A soma dos valores preenchidos é: " + soma);
    }
    
}
