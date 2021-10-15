package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Jogador j2 = new Jogador("Romario");
        Jogador j3 = new Jogador("Cafu");
        Jogador[] jogadores = {j1,j2,j3};
        for (Jogador jogador: jogadores) {
            jogador.imprime();
        }
    }
}
