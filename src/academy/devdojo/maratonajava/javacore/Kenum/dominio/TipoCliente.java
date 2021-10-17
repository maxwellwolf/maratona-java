package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    public final int VALOR;
    public String nomeRelatorio;
    TipoCliente(int valor, String nRelat) {
        this.VALOR = valor;
        this.nomeRelatorio = nRelat;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
