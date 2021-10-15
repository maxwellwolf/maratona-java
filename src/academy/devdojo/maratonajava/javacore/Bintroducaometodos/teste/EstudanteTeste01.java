package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Maxwell";
        estudante01.idade = 36;
        estudante01.sexo = 'M';

        estudante02.nome = "Laiane";
        estudante02.idade = 31;
        estudante02.sexo = 'F';

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
