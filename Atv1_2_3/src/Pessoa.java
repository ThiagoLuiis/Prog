public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private String cpf;

    public Pessoa(String nome, int idade, String endereco, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome 
        + "\nIdade: " + idade 
        + "\nEndereço: " + endereco 
        + "\nCPF: " + cpf;
    }
}