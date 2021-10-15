package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Jogador j2 = new Jogador("Cafu");
        Jogador[] jogadores = {j1,j2};
        Time time = new Time("Santos");
        j1.setTime(time);
        j2.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("--- jogador ---");
        j1.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
