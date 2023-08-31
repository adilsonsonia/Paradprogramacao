
package Sessao_B;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
    
    
    System.out.print("Digite um número: ");
    int numero = tec.nextInt();
    
        if(numero%2==0){
            System.out.println("O numero que você digitou é Par!");
        }else{
            System.out.println("O número que você digitou é Ímpar");
        }
    }
}
