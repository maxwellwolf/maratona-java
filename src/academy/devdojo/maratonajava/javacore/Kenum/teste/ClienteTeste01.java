package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maxwell", TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Laiane", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Telbaldo", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
