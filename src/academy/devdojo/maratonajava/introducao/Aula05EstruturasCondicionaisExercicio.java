package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salario = 68508;
        double taxa;
        if (salario > 0 && salario <= 34712){
            taxa = salario * 0.097;
            System.out.println("Sua taxa é de 9.7%: "+taxa);
        }else if(salario > 34712 && salario <= 68507){
            taxa = salario * 0.3735;
            System.out.println("Sua taxa é de 37.35%: "+taxa);
        }else{
            taxa = salario * 0.495;
            System.out.println("Sua taxa é de 49.5%: "+taxa);
        }




    }
}
