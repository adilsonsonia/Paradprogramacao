
package Sessao_B;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduza um número usando teclado: ");
        int numero = tec.nextInt();
        
        if(numero < 0){
            System.out.println("O número que você digitou é negativo");
        }else if(numero == 0){
            System.out.println("O número que você digitou é zero");
        }else{
            System.out.println("O número que você digitou é Positivo");
        }
    }
}
