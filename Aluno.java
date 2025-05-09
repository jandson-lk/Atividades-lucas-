// Definindo a classe Aluno
public class Aluno {

    // Atributos da classe
    String nome;
    int idade;

    // Método main para criar e manipular um objeto Aluno
    public static void main(String[] args) {
        // Criando um objeto da classe Aluno
        Aluno aluno1 = new Aluno();

        // Atribuindo valores aos atributos do objeto aluno1
        aluno1.nome = "João";
        aluno1.idade = 20;

        // Exibindo os valores dos atributos
        System.out.println("Nome do aluno: " + aluno1.nome);
        System.out.println("Idade do aluno: " + aluno1.idade);
    }
}

