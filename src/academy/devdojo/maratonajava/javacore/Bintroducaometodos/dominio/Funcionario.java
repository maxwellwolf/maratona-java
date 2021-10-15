package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media = 0;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario != null) {
            for (double sal : this.salario) {
                System.out.println(sal);
            }
        }
    }

    public void imprimeMediaSalario() {

        if (salario == null) {
            return;
        }
        for (double sal : this.salario) {
            this.media += sal;
        }
        System.out.println("Média dos salários: " + this.media / salario.length);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
}
