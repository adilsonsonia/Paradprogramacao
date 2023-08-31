
package Sessao_B;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo (hh:mm): ");
        String horaInicialStr = scanner.next();
        LocalTime horaInicial = LocalTime.parse(horaInicialStr);

        System.out.print("Digite a hora final do jogo (hh:mm): ");
        String horaFinalStr = scanner.next();
        LocalTime horaFinal = LocalTime.parse(horaFinalStr);

        Duration duracao;

        if (horaFinal.isAfter(horaInicial)) {
            duracao = Duration.between(horaInicial, horaFinal);
        } else {
            duracao = Duration.between(horaInicial, LocalTime.MAX).plus(Duration.between(LocalTime.MIN, horaFinal));
        }

        long duracaoHoras = duracao.toHours();
        long duracaoMinutos = duracao.toMinutes() % 60;

        System.out.println("A duração do jogo é de " + duracaoHoras + " hora(s) e " + duracaoMinutos + " minuto(s).");

        scanner.close();
    }
}
