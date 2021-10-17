package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    public enum TipoPagamento{
        DEBITO, CREDITO
    }
    private String nome;
    private TipoCliente tipo;
    private TipoPagamento pag;

     public Cliente(String nome, TipoCliente tipo, TipoPagamento pag) {
        this.nome = nome;
        this.tipo = tipo;
        this.pag = pag;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo.nomeRelatorio +
                ", pag=" + pag +
                '}';
    }
}
