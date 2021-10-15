package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public void imprime() {
        System.out.println("---------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade: " + this.velocidadeMaxima);
        System.out.println("Limite: " + Carro.velocidadeLimite);
    }

    public Carro() {
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public static void setVelocidade(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;

    }

    public static double getVelocidade() {
        return velocidadeLimite;

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

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
}
