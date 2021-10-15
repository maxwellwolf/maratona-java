package academy.devdojo.maratonajava.javacore.Heranca.dominio;

public class Pessoa {

    // Modificador de acesso protected permite acesso a variável por suas filhas e classes do mesmo pacote
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
public Pessoa(String nome) {
        this.nome = nome;

    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+" "+this.getCpf());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco.toString();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
