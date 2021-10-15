package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class Exercicio01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maxwell");
        funcionario.setIdade(36);
        funcionario.setSalario(new double[]{1800, 3600, 3955, 5490});

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
