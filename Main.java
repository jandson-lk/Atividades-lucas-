
class Aluno {
    
    String nome;
    int idade;

   
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

   
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

public class Main {
    public static void main(String[] args) {
      
        Aluno aluno1 = new Aluno("João", 20);

       
        aluno1.exibirInformacoes();
    }
}
