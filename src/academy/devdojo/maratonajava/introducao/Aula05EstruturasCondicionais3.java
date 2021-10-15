package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
        double salario = 600;
        String mensagemDoar = "Eu vou doar 500 resais para o DevDojo";
        String mensagemNaoDoar = "Eu não vou doar para o DevDojo";
        String resultado;
        if (salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
        // Operador ternario
        salario = 6000;
        resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println("\n"+resultado);



    }
}
