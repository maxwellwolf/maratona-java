package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Celta", 120);
        Carro c3 = new Carro("Mercedes",340);
        // Ao alterar o valor de um atributo estático, ele é replicado para todos os objetos
        Carro.setVelocidade(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
