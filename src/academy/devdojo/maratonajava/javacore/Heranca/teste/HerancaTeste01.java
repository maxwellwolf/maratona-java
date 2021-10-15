package academy.devdojo.maratonajava.javacore.Heranca.teste;

import academy.devdojo.maratonajava.javacore.Heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Heranca.dominio.Funcionario;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Av Belém-Brasília Casa 04", "70804005");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maxwell");
        funcionario.setCpf("00196336104");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5495);
        funcionario.imprime();
    }
}
