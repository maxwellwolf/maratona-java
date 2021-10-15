package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Random;
import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("Digite sua pergunta e responderei SIM ou NÃO, ou digite EXIT para sair.");
            String pergunta = entrada.nextLine();
            if(pergunta.equalsIgnoreCase("exit")){
                break;
            }
            Random num = new Random();
            String resposta = (num.nextInt(2) == 1) ? "SIM" : "NÃO";
            System.out.println("A resposta para sua pergunta é " + resposta);
        }
    }
}
