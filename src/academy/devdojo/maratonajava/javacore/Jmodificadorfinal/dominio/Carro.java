package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    // Constantes devem ter o modificador de acesso final
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime() {
        System.out.println("---------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade: " + this.velocidadeMaxima);
        System.out.println("Limite: " + VELOCIDADE_LIMITE);
    }

    public Carro() {
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }



    public double getVelocidade() {
        return VELOCIDADE_LIMITE;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVELOCIDADE_LIMITE() {
        return VELOCIDADE_LIMITE;
    }

}
