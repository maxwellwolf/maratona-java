package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Maxwell";
        professor.idade = 56;
        professor.sexo = 'M';
        String sexo = professor.sexo == 'M' ? "Masculino" : "Feminino";
        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + sexo);

    }
}
