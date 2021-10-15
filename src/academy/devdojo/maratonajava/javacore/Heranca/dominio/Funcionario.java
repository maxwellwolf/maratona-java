package academy.devdojo.maratonajava.javacore.Heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario() {

    }
    public Funcionario(String nome) {
        super(nome);
        this.salario = salario;
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);

    }
    public void relatorio(){
        System.out.println("Eu " +this.nome +" recebi a quantia de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
