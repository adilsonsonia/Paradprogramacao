
package Sessao_A;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        double pi = 3.14159;
        double area;
        double raio;
        
        System.out.print("Digite o valor do Raio: ");
        raio = tec.nextInt();
        
        area = pi * (raio*raio);
        
        System.out.println("O valor da área do circulo é: " + area);
    }
}
