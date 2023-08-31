
package Sessao_B;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite os números na ordem crescente ou decrescente");
        System.out.print("Digite o primeiro número: ");
        int num1 = tec.nextInt();
        
        
        System.out.println("Digite o Segundo número: ");
        int num2 = tec.nextInt();
        
        if(num1%num2 == 0 || num2%num1 == 0){
            System.out.println("Os números introduzidos são Múltiplos ");
        }else{
            System.out.println("Os numeros não são Múltiplos");
        }
    }
}
