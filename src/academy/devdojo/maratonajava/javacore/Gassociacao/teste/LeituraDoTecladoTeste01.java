package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("\nDigite sua idade: ");
        int idade = entrada.nextInt();
        System.out.print("\nDigite M ou F para seu sexo: ");
        String sexo = (entrada.next().equalsIgnoreCase("M") ) ? "Masculino" : "Feminino" ;
        System.out.println("Olá "+nome+", sua idade é "+ idade+" e você é do sexo "+ sexo);
    }
}
